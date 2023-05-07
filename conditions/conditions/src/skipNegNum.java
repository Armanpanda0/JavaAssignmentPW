import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class skipNegNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ente a number: ");

        int a=sc.nextInt();

        if (a>0){
            System.out.println("The Number is: "+a);
        } else if (a<0) {
            System.out.println("The Number is Skip because of the It is Nagative: "+a);
        }
        else
            System.out.println("Number is Zero: "+0);
    }
}
