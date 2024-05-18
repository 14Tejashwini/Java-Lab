import java.util.Scanner;
public class bk1 {
    public static void high_roi(Bank[] b, int n, int year) {
        float max_roi = -1;
        int max_roi_index = -1;
        for (int i = 0; i < n; i++) {
            if (b[i].roi > max_roi && b[i].year == year) {
                max_roi = b[i].roi;
                max_roi_index = i;
            }
        }
        if (max_roi_index == -1) {
            System.out.println("No customer found for the given year.");
        } else {
            System.out.println("Highest paid customer of the bank in the year " + year + ":");
            b[max_roi_index].display();
            
        }
    }
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the no. of customers in Citi Bank:");
     int n1= s.nextInt();
     CitiBank[] b1=new CitiBank[n1];
     for(int i=0;i<n1;i++){
        System.out.printf("Enter the details of the customer %d:\n", i+1);
        b1[i]=new CitiBank();
        b1[i].read(s);
        b1[i].calc_roi();
     }
     System.out.println("Displaying Customer Details of Citi Bank:");
            System.out.println("Name\tAcct No.\tBalance\tROI");
            for(int i=0;i<n1;i++){
                b1[i].display();
            }      
    System.out.println("Enter the no. of customers in SBI Bank:");
     int n2= s.nextInt();
     SBIBank[] b2=new SBIBank[n2];
     for(int i=0;i<n2;i++){
        System.out.printf("Enter the details of the customer %d:\n", i+1);
        b2[i]=new SBIBank();
        b2[i].read(s);
        b2[i].calc_roi();
     }
     System.out.println("Displaying Customer Details of SBI Bank:");
            System.out.println("Name\tAcct No.\tBalance\tROI");
            for(int i=0;i<n2;i++){
                b2[i].display();
            }
    System.out.println("Enter the no. of customers in Canara Bank:");
     int n3= s.nextInt();
     CanaraBank[] b3=new CanaraBank[n3];
     for(int i=0;i<n3;i++){
        System.out.printf("Enter the details of the customer %d:\n", i+1);
        b3[i]=new CanaraBank();
        b3[i].read(s);
        b3[i].calc_roi();
     }
     System.out.println("Displaying Customer Details of Canara Bank:");
            System.out.println("Name\tAcct No.\tBalance\tROI");
            for(int i=0;i<n3;i++){
                b3[i].display();
            }
    System.out.println("Enter the bank name to find customer with the highest rate of interest:");
    String ch=s.next();
    System.out.println("Enter the year to find the highest paid customer:");
    int year = s.nextInt();
    if(ch.equals("Citi")){
        high_roi(b1, n1,year);
    }
    else if(ch.equals("SBI")){
        high_roi(b2, n2,year);
    }
    else if(ch.equals("Canara")){
        high_roi(b3, n3,year);
    }
     s.close();  
    }
}
 class Bank{
                public String name;
                public int acct_no;
                public float bal;
                public float roi;
                public int year;

                public void read(Scanner s) {
                    System.out.print("Enter name:");
                    this.name=s.next();
                    System.out.print("Enter account no.:");
                    this.acct_no=s.nextInt();
                    System.out.print("Enter balance:");
                    this.bal=s.nextFloat();
                    System.out.print("Enter year:");
                    this.year = s.nextInt();
                }
                public void display() {
                    System.out.println(this.name+"\t\t"+this.acct_no+"\t\t"+this.bal+"\t"+this.roi);
                }
                public void calc_roi(){}
            }
    class CitiBank extends Bank{
        @Override
        public void calc_roi(){
            roi=(bal*2)/100;
            bal=bal+roi;    
        }
    }
    class SBIBank extends Bank{
        @Override
        public void calc_roi(){
            roi=(bal*5)/100;
            bal=bal+roi;    
        }
    }
    class CanaraBank extends Bank{
        @Override
        public void calc_roi(){
            roi=(bal*10)/100;
            bal=bal+roi;    
        }
    }
