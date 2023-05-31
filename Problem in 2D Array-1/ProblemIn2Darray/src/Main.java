import java.util.Scanner;

public class Main {

static void reverse(int[] arr){
    int st=0 ,lt=arr.length-1;
    while (st<lt){
        int temp=arr[st];
        arr[st]=arr[lt];
        arr[lt]=temp;
        st++;
        lt--;
    }
}
    static void rotate(int[][] arr,int r){

        transposeInplace(arr,r,r);

        for (int i=0;i<arr.length;i++){
            reverse(arr[i]);
        }
    }
    static void transposeInplace(int[][] arr,int r,int c){
        for (int i=0;i<r;i++){
            for (int j=i;j<c;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    static int[][] transpose(int[][] arr ,int r,int c){
        int[][] ans=new int[c][r];
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    static void printMatrix(int[][] arr){

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row: ");
        int r=sc.nextInt();
        System.out.println("Enter the column: ");
        int c=sc.nextInt();

        System.out.println("Entr the Matrix: ");
        int [][] arr=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("The Original Array: ");
        printMatrix(arr);
        System.out.println("The Transpose Matrix is: ");
       // int[][] ans=transpose(arr,r,c);
       // printMatrix(ans);
      //  transposeInplace(arr,r,c);
      //  printMatrix(arr);
        rotate(arr,r);
        printMatrix(arr);
    }
}