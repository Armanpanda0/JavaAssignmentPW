import java.util.Scanner;
public class Area {


    int a;
    int b;

    int returnArea=1;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Area obj1=new Area();

        obj1.a=sc.nextInt();
        obj1.b=sc.nextInt();

        obj1.returnArea= obj1.a * obj1.b;
        System.out.println("Area Of the ectangle is: "+ obj1.returnArea);
    }
}
