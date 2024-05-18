import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbc {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Replace these with your database details
        String jdbcUrl = "jdbc:mysql://localhost:3306/student_details";
        String username = "root";
        String password = "";

        try {
            // Establishing the database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            String name;
            String usn;
            int semester;
            int age;
            String course;
            String dob;
            String address;
            System.out.println("Enter Name,usn,sem,age,course,dob,address:");
            name=s.next();
            usn=s.next();
            semester=s.nextInt();
            age=s.nextInt();
            course=s.next();
            dob=s.next();
            address=s.next();
            String query1 = "insert into student values("+"'"+name+"',"+"'"+usn+"',"+"'"+semester+"',"+age+","+"'"+course+"',"+"'"+dob+"',"+"'"+address+"')";
            PreparedStatement preparedStatement1 = connection.prepareStatement(query1);
            preparedStatement1.execute();
            String query = "SELECT * FROM student";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Displaying student details
            while (resultSet.next()) {
                name = resultSet.getString("name");
                usn = resultSet.getString("usn");
                semester = resultSet.getInt("semester");
                age = resultSet.getInt("age");
                course = resultSet.getString("course");
                dob = resultSet.getString("dob");
                address = resultSet.getString("address");

                System.out.println("Name: " + name + ", USN: " + usn + ", Semester: " + semester +
                        ", Age: " + age + ", Course: " + course + ", DOB: " + dob + ", Address: " + address);
            }

            // Closing resources
            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        s.close();
    }
}
