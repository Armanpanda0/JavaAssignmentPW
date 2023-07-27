import java.util.Scanner;

public class SeriseofSum {

    static int sos(int n){
        if (n==0){
            return 0;
        }
        if (n%2==0) {
            return sos(n-1)-n;
        }
        return sos(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sos(n));
    }
}
