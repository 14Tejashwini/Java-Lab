import java.util.Scanner;

public class p4_polymorphism {
            public static void usrstrcmp(String s1,String s2){
             if(s1.compareTo(s2)==0){
                System.out.println("The two strings are equal");
            }
            else{
                System.out.println("The two strings are not equal");
            }
        }
        public static void usrstrcmp(String s1,String s2,int n){
            st1=s1.substring(0,n);
            st2=s2.substring(0,n);
            if(st1.equals(st2)){
                System.out.println("The 1st "+n+" characters of the two strings are equal");
            }
            else{
                System.out.println("The 1st "+n+" characters of the two strings are not equal");
            }
        }


    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String str1;
        String str2;
        int n;
        System.out.print("Enter 1st string:");
        str1=s.next();
        System.out.print("Enter 2nd string:");
        str2=s.next();
        usrstrcmp(str1, str2);
        System.out.print("Enter the no. of characters to compare:");
        n=s.nextInt();
        usrstrcmp(str1, str2, n);
        s.close();
    }
}
