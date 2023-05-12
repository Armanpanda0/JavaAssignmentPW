import java.util.Scanner;
public class alphabateDymondpartton {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int alp=65;
        int cnt=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<= i*2-1;k++){
                System.out.print((char)(alp+cnt++) );
            }
            cnt=0;
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i*2-1;k++){
                System.out.print((char)(alp+cnt++) );
            }
            cnt=0;
            System.out.println();
        }
    }
}
