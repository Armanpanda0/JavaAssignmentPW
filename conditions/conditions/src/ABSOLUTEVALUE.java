import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class ABSOLUTEVALUE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the Number: ");

        int a=sc.nextInt();

        System.out.println("The number is:"+a);

        System.out.println("The absolute value of the number is: "+(a*(-1)));
    }
}
