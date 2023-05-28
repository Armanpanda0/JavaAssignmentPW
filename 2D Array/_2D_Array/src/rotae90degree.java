import java.util.Scanner;

public class rotae90degree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ente the Square matrix: ");

        System.out.println("Row: ");
        int n=sc.nextInt();
        System.out.println("Colomn: ");
        int m=sc.nextInt();


        System.out.println("Enter "+ n*m +" No. of element");
        int[][] arr=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Original Array: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        if (n !=m){
            System.out.println("This is not a square Matrix Dimention: this is not rotatable ");
        }
        else {
            for (int x = 0; x < n / 2; x++) {
                for (int y = x; y < n - 1 - x; y++) {
                    //store in temp
                    int temp = arr[x][y];
                    arr[x][y] = arr[y][n - x - 1];
                    arr[y][n - x - 1] = arr[n - x - 1][n - y - 1];
                    arr[n - x - 1][n - y - 1] = arr[n - y - 1][x];
                    arr[n - y - 1][x] = temp;
                }
            }

        System.out.println("The Roptate array: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        }



    }
}
