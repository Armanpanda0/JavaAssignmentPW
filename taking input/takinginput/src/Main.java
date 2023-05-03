import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name=sc.next();
        int roll=sc.nextInt();
        String foi=sc.next();

        System.out.println("Name: "+name);
        System.out.println("Roll: "+ roll);
        System.out.println("Field of Intrest: " +foi);
    }
}