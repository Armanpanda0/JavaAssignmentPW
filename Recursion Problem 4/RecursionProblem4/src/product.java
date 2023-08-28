import java.util.Scanner;

public class product {

    static int prod(int n,int m){
        if (n==1){
            return m;
        }
        return prod(m,n-1)+ m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(prod(n,m));
    }
}
