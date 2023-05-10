import java.util.Scanner;
public class numberSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=i;j< n+1;j++){
                System.out.print(j+" ");
                //System.out.print("*");
            }
            for (int k=1;k<i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
