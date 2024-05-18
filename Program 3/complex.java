import java.util.Scanner;
public class complex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        comp c1=new comp();
        comp c2=new comp();
        c1.read_data(s);
        c1.display();
        c2.read_data(s);
        c2.display();
        while(true){
        System.out.println("MENU\n1.Add 2 complex nos.\n2.Subtract 2 complex nos.\n3.Increment complex nos.\n4.Decrement complex nos.\n5.Compare the 2 complex nos.\n6.Exit\nEnter choice:");
        int ch=s.nextInt();
        switch(ch){
            case 1:
            c1.add(c2);
            break;
            case 2:
            c1.sub(c2);
            break;
            case 3:
            c1.inc();
            c2.inc();
            break;
            case 4:
            c1.dec();
            c2.dec();
            break;
            case 5:
            c1.compare(c2);
            break;
            case 6:
            break;
        }
    if(ch>=6){
        break;
    }
    }
        s.close();
    }
}
class comp{
    public int real;
    public int img;
    public comp(){
        real=0;
        img=0;
    }
    public void read_data(Scanner s){
        System.out.println("Enter the real and imaginery part of the complex no.:");
        this.real=s.nextInt();
        this.img=s.nextInt();
    }
    public void display(){
        System.out.println(" "+this.real+"+"+this.img+"i");
    }
    public void add(comp c){
        comp c3=new comp();
        c3.real=this.real+c.real;
        c3.img=this.img+c.img;
        System.out.print("Addition of complex nos:");
        c3.display();
    }
    public void sub(comp c){
        comp c4=new comp();
        c4.real=this.real-c.real;
        c4.img=this.img-c.img;
        System.out.print("Difference of complex nos:");
        c4.display();
    }
    public void inc(){
        this.real++;
        this.img++;
        System.out.print("Incrementing complex nos:");
        this.display();
    }
    public void dec(){
        this.real--;
        this.img--;
        System.out.print("Decrementing complex nos:");
        this.display();
    }
    public void compare(comp c){
        if(this.real==c.real &&this.img==c.img){
            System.out.println("Complex nos. are equal");
        }
        else{
            System.out.println("Complex nos. are not equal");
        }
    }
}
