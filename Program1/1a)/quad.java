import java.util.Scanner;

class quadratic{
    public void calc(int a,int b,int c){
        double d;
        double x1;
        double x2;
        d=(b*b)-(4*a*c);
        if(d==0){
            x1=-b/(2*a);
            x2=x1;
            System.out.println("Solutions are real and equal\nValues:"+x1+" and "+x2);
        }
        else if(d>0){
            x1=(-b+Math.pow(d,0.5))/(2*a);
            x2=(-b-Math.pow(d,0.5))/(2*a);
            System.out.println("Solutions are real and distinct\nValues:"+x1+" and "+x2);
        }
        else{
            System.out.println("Solutions are imaginery");
        }
    }
}

public class quad {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Enter the value of a,b,c in the quadratic equation:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        quadratic q=new quadratic();
        q.calc(a, b, c);
        s.close();
    }
}
