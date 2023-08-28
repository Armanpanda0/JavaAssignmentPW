import java.sql.SQLOutput;
import java.util.Scanner;

public class binaryTodecimal {

    static int BtoD(int y){
        if (y==1){
            return y;
        }

        return (y%2 + 10 * BtoD(y/2));
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        System.out.println(BtoD(y));
    }
}
