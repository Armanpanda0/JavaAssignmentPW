import java.util.Scanner;

public class rotate90Anti {

    static void printArr(int[][] arr, int r, int c) {

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();

        int[][] arr=new int[r][c];
        System.out.println("Enter the Array: ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }


        for (int i=0;i<r/2;i++){
            for (int j=i;j<r-i-1;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][r-i-1];
                arr[j][r-i-1]=arr[r-i-1][r-j-1];
                arr[r-i-1][r-j-1]=arr[r-j-1][i];
                arr[r-j-1][i]=temp;

            }
        }
        printArr(arr,r,c);
    }
}
