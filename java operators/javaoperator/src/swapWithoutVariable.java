import java.util.Scanner;
public class swapWithoutVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Before Swap 1st number is :"+x);
        System.out.println("Before Swap 2st number is :"+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swap x is: "+x);
        System.out.println("After Swap y is: "+y);

    }
}
