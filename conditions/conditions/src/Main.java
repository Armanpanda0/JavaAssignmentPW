import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input The Length asnd Bredth");
        int b=sc.nextInt();
        System.out.println("Bredth is: "+b);
        int a=sc.nextInt();
        System.out.println("Length"+b);

        if (a==b){
            System.out.println("THis is a Squre");
        }
        else
            System.out.println("This is a rectangle");
    }
}