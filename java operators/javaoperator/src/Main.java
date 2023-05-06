import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x);
        int y=((((x+8)/3)%5)*5);
        System.out.println(y);
    }
}