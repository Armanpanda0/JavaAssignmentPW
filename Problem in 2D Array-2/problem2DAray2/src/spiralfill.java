import java.util.Scanner;

public class spiralfill {
    static void printMatrix(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] sprialMatrixFill(int n){

        int[][] arr=new int[n][n];
        int topRow=0 , bottomRow=n-1, leftCol=0 , rightCol=n-1;
        int total=1;

        while(total <= n * n){
            //Printing the TopRow -> leftCol to rightCol
            for (int j=leftCol;j<=rightCol && total <= n * n;j++){
                arr[topRow][j]=total++;
            }
            topRow++;

            //printing Rightcol -> toprow to buttomRow
            for (int i=topRow;i<=bottomRow & total <= n * n;i++){
                arr[i][rightCol]=total++;
            }
            rightCol--;

            //bottomRw -> rightCol to leftCol
            for (int j=rightCol;j>=leftCol && total <= n * n;j--){
                arr[bottomRow][j]=total++;
            }
            bottomRow--;
            //leftCol -> bottomRow to Toprow
            for (int i=bottomRow;i>=topRow && total <= n * n;i--){
                arr[i][leftCol]=total++;
            }
            leftCol++;
        }
        return arr;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num ");
        int n=sc.nextInt();

        int[][] ans=sprialMatrixFill(n);
        printMatrix(ans);

    }

}

