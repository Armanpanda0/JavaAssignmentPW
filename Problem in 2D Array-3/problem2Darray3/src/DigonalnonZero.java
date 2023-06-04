import java.util.Scanner;

public class DigonalnonZero {

    static void printArray(int[][] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.println(arr[i][j]+ " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Num");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("Array: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j || i+j==n-1){
                    if (arr[i][j] == 0){
                        System.out.println("false");
                        return;
                    }
                }


                }
        }
        System.out.println("True");
    }
}
