import java.util.Scanner;
public class leftReversePyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        for (int i=0;i<=n;i++){
            for (int j=0;j<=m;j++){
                if (i>j) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }


}
