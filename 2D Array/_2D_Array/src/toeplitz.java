import java.util.Scanner;

public class toeplitz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Row: " );
        int n=sc.nextInt();
        System.out.println("Column: ");
        int m=sc.nextInt();


        int[][] arr=new int[n][m];
        System.out.println("Enter "+ n*m +" No. element");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                if (arr[i][j] != arr[i-1][j-1]){
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("True");
    }
}
