import java.util.Scanner;
public class flippnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int n=a ^ b ;

        int cnt=0;

        while(n != 0){
            n= n & (n-1);
            ++cnt;
        }
        System.out.println(cnt);
    }
}
