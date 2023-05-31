import java.util.Scanner;

public class tropizoid {
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

        System.out.println("Enter the Array: ");
        int[][] arr=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i=1;i<r;i++){
            for (int j=1;j<c;j++){
                if (arr[i][j] != arr[i-1][j-1]){
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }
}
