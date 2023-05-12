import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int sum=0;
        int pow=1;

        while(n!=0){
            int dig = n%10;
            sum += (dig * pow);
            n=n/10;
            pow *= 2;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}