import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int x=sc.nextInt();
        for (int i=1;i<x;i++){
            sum += x%10;
            x=x/10;

        }

        System.out.println(sum);
    }
}
