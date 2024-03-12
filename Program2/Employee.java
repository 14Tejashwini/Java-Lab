import java.util.Scanner;
public class Employee {
static class emp{
String name;
int emp_id;
String dept;
Double sal;
String desg;
public void read_data(Scanner s){
System.out.println("Enter employee name:");
this.name=s.next();
System.out.println("Enter employee id:");
this.emp_id=s.nextInt();
System.out.println("Enter employee department:");
this.dept=s.next();
System.out.println("Enter employee Salary:");
this.sal=s.nextDouble();
System.out.println("Enter employee designation:");
this.desg=s.next();
}
public void disp_data(){
System.out.println(this.name+"\t"+this.emp_id+"\t"+this.dept+"\t"+this.sal+"\t"+this.de
sg);
}
public double calc_sal(double total_sal){
if(this.dept.equals("sales")){
total_sal+=this.sal;
}
return total_sal;
}
public double high_pay(){
if(this.dept.equals("purchase") && this.desg.equals("manager")){
double max=this.sal;
return max;
}
return -1;
}
}
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter no. of employees:");
int n=s.nextInt();
emp[] obj1=new emp[n];
for(int i=0;i<n;i++){
System.out.printf("Enter the details of the employee %d:\n", i+1);
obj1[i]=new emp();
obj1[i].read_data(s);
}
System.out.println("Displaying Employee Details:");
System.out.println("Name\tID\tDepartment\tSalary\tDesignation");
for(int i=0;i<n;i++){
obj1[i].disp_data();
}
System.out.println("Sum of salaries of all employees in sales dept:");
double total_sal=0;
for(int i=0;i<n;i++){
total_sal=obj1[i].calc_sal(total_sal);
}
System.out.println(total_sal);
System.out.println("Highest paid manager in purchase dept:");
double max=0;
int e=-1;
for(int i=0;i<n;i++){
double pay=obj1[i].high_pay();
if(pay>max){
max=pay;
e=i;
}
}
if(e!=-1){
obj1[e].disp_data();
}
System.out.println("Hike of 10% in salary of sales department:");
for(int i=0;i<n;i++){
if(obj1[i].dept.equals("sales")){
obj1[i].sal=1.1*obj1[i].sal;
obj1[i].disp_data();
}
}
s.close();
}
}
