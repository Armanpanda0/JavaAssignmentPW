import java.util.Scanner;

public class pascalTriangle {

    static int[][] pascal(int n){
        int[][] arr=new int[n][];
        for (int i=0;i<n;i++){
            //i row have the i+1 col
            arr[i] = new int[i+1];
            //1st and last element contain the 1
            arr[i][0]=arr[i][i]=1;
            for (int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }

        }
        return arr;
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
        System.out.println("Entr the no. of: ");
        int n=sc.nextInt();
        System.out.println("The pascal's triangle is: ");
        int[][] arr=pascal(n);
        printMatrix(arr);

    }
}
