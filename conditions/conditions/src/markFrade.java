import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
public class markFrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();
        if (mark<101){
        if (90 < mark) {
            System.out.println("A+");
        } else if (80 < mark) {
            System.out.println("A");
        } else if (70 < mark) {
            System.out.println("B+");
        } else if (60 < mark) {
            System.out.println("B");
        } else if (50 < mark) {
            System.out.println("C");
        } else if (40 < mark) {
            System.out.println("D");
        } else if (30 < mark) {
            System.out.println("E");
        } else if (29 > mark) {
            System.out.println("f");
        } else
            System.out.println("Invalid input");
    }
        else
            System.out.println("Mark should not grater than 100 ........ ...");
    }
}
