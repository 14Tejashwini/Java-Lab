import java.util.Scanner;

interface compute{
    void convert();
}

class byte_ implements compute{
    Scanner s=new Scanner(System.in);
    public void convert(){
        double kb;
        double gb;
        System.out.println("Conversion of KB to GB:\nEnter the value in KB:");
        kb=s.nextDouble();
        gb=kb/Math.pow(2, 20);
        System.out.println("Value in GB:"+gb);
    }
}
class currency_ implements compute{
    Scanner s=new Scanner(System.in);
    public void convert(){
        double euro;
        double rs;
        System.out.println("Conversion of Euro to Rupees:\nEnter the value in Euro:");
        euro=s.nextDouble();
        rs=euro*90;
        System.out.println("Value: Rs."+rs);
    }
}

public class abst {
    public static void main(String[] args){
        byte_ b=new byte_();
        b.convert();
        currency_ c=new currency_();
        c.convert();
    }
    
}
