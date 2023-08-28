import java.util.Scanner;

public class primeNumber {
    static boolean primenum(int n, int i){
                if(n <= 2)
                    return (n==2) ? false : true;
                if(n %i ==0)
                    return false;
                if (i* i <=n)
                    return true;
                return primenum(n,i+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(primenum(n,2)){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
