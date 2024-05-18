import java.util.*;
class Person{
    String name;
    int age;
    String gender;

    public void read(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name= sc.next();
        System.out.println("Enter age: ");
        this.age= sc.nextInt();
        System.out.println("Enter gender: ");
        this.gender= sc.next();
    }

    public void display(){
        System.out.print(name+"\t"+age+"\t"+gender+"\t");
    }

}

class Student extends Person{
    int usn;
    String branch;
    float cgpa;

    public void read1(){
        read();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter usn:");
        usn= sc.nextInt();
        System.out.println("Enter branch: ");
        branch= sc.next();
        System.out.println("Enter cgpa: ");
        cgpa= sc.nextFloat();
    }

    public void display1(){
        display();
        System.out.print(usn +"\t"+branch+"\t"+cgpa+"\n");
    }
}

class Employee extends Person{
    int eid;
    String desig;
    float salary;

    public void read2(){
        read();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter eid:");
        eid= sc.nextInt();
        System.out.println("Enter desig: ");
        desig= sc.next();
        System.out.println("Enter salary: ");
        salary= sc.nextFloat();
    }

    public void display2(){
        display();
        System.out.print(eid +"\t"+desig+"\t"+salary+"\n");
    }
}
public class p4 {
    public static void main(String args[]){
        Student[] students= new Student[2];
        Employee[] employees= new Employee[1];

        for(int i=0;i<2;i++){
            students[i]= new Student();
            students[i].read1();
        }

        System.out.println("Name\tAge\tGender\tUSN\tBranch\tCGPA");
        for(int i=0;i<2;i++){
            students[i].display1();
        }

        for(int i=0;i<1;i++){
            employees[i]= new Employee();
            employees[i].read2();
        }

        System.out.println("Name\tAge\tGender\tEmpID\tDesig\tSalary");
        for(int i=0;i<1;i++){
            employees[i].display2();
        }

    }
}
