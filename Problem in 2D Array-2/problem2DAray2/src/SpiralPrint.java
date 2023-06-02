
import java.util.Scanner;

public class SpiralPrint {



    static void sprialMatrix(int[][] arr,int r,int c){

        int topRow=0 , bottomRow=r-1, leftCol=0 , rightCol=c-1;
        int total=0;

        while(total < r * c){
            //Printing the TopRow -> leftCol to rightCol
            for (int j=leftCol;j<=rightCol && total < r * c;j++){
                System.out.print(arr[topRow][j]+" ");
                total++;
            }
            topRow++;

            //printing Rightcol -> toprow to buttomRow
            for (int i=topRow;i<=bottomRow & total < r * c;i++){
                System.out.print(arr[i][rightCol]+" ");
                total++;
            }
            rightCol--;

            //bottomRw -> rightCol to leftCol
            for (int j=rightCol;j>=leftCol && total < r * c;j--){
                System.out.print(arr[bottomRow][j]+" ");
                total++;
            }
            bottomRow--;
            //leftCol -> bottomRow to Toprow
            for (int i=bottomRow;i>=topRow && total < r * c;i--){
                System.out.print(arr[i][leftCol]+" ");
                total++;
            }
            leftCol++;
        }

    }
    static void printMatrix(int[][] arr,int r,int c){
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row & Col: ");
        int r=sc.nextInt();
        int c=sc.nextInt();


        System.out.println("Enter the Element: ");
        int[][] arr=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix is: ");
        printMatrix(arr,r,c);
        System.out.println("Sprial is the: ");
        sprialMatrix(arr,r,c);
        //printMatrix(arr,r,c);



    }
}

