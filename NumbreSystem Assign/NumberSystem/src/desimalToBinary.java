import java.util.Scanner;
public class desimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int som=0;
        int pow=1;
        while(n > 1){
            int dig = n % 2;
            som += (dig * pow);
            pow *= 10;
            n /= 2;
            System.out.print(n+" "+"then");
            System.out.println(som+" ");
        }
        System.out.println(som+);
    }
}
