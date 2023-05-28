import java.util.Scanner;

public class DigoanlTraversal {
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

        int[] arr1=new int[n*m];
        int indx=0;
        int row=0;
        int col=0;
        while (col<m){
            int i=row;
            int j=col;
            while (i >=0 && j<m ){
                arr1[indx]=arr[i][j];
                indx++;
                i--;
                j++;

            }

        }
        row++;
        if (row >=n){
            row =n-1;
            col++;
        }
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
