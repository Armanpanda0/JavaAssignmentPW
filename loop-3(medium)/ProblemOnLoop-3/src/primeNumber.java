import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;

        for (int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }

        }
        if (count==2){
            System.out.println(n+" Is a  P R I M E number");
        }
        else
            System.out.println(n+" Is N O T a P R I M E number");
    }
}
