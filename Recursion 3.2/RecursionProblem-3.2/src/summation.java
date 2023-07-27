import java.util.Scanner;

public class summation {


    static int summ(int m , int n){
        if (n==1){
            return sumofn(m);
        }
        int sum=summ(m,n-1);
        return sumofn(sum);
    }

    static int sumofn(int m){
        int ans=0;
        if(m==1){
            ans++;
            return ans;
        }
        ans += m+ sumofn(m-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(summ(m , n));
    }
}
