import java.util.Scanner;
public class StarandDot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (j %2 == 0){
                    System.out.print(".");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.print("\n");
        }
    }

}
