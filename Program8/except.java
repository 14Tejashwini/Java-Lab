import java.util.Scanner;

public class except {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 positive nos to divide:");
        float a=s.nextFloat();
        float b=s.nextFloat();
        try{
           if(a>=0&&b>=0){
            if(b!=0){
            System.out.println("Division of 2 nos:");
            System.out.println(a/b);
            }
            else{
                throw new ArithmeticException("Divide by zero error!");
            }
           }else{
            throw new ArithmeticException("Negative input!");
           }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    finally   
    {
        s.close();
    }
}
}
