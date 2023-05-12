import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fct=1;
        int n=sc.nextInt();
        for (int i=1;i<=n ;i++){
            fct=fct * i;
        }
        System.out.println(fct);
    }
}
