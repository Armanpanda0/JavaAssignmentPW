import java.util.Scanner;

public class printUpperTriangle {

    static void printArray(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;
        for (int i=0;i<r;i++){
            for (int k=0;k<c;k++) {
                if (k >= i) {
                    System.out.print(arr[i][k] + " ");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    static void printArray1(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row and col no: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter " + r * c + " Elments ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array: ");
        printArray1(arr);
        System.out.println("The upper Triangle: ");
        printArray(arr);
    }
}
