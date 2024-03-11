import java.util.Scanner;
public class arr2 {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n=s.nextInt();
int[] a1=new int[n];
int[] a2=new int[n];
int[] res=new int[n];
System.out.println("Enter the elements of 1st array:");
for(int i=0;i<n;i++){
a1[i]=s.nextInt();
}
System.out.println("Enter the elements of 2nd array:");
for(int i=0;i<n;i++){
a2[i]=s.nextInt();
}
System.out.println("Multiplication of 2 arrays:");
for(int i=0;i<n;i++){
res[i]=a1[i]*a2[i];
}
for(int num:res){
System.out.print(" "+num);
}
s.close();
}
}
