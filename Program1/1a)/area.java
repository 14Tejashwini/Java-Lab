import java.util.Scanner;
public class area {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter length:");
int a=sc.nextInt();
System.out.println("Enter breadth:");
int b=sc.nextInt();
int ar=a*b;
System.out.println("Area of rectangle="+ar);
sc.close();
}
}
