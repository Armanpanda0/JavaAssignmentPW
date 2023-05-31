import java.util.Scanner;

public class multipication {

    static void printArr(int[][] arr, int r, int c) {

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr the Row and Col: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr_1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr_1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entr the Row and Col: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
            System.out.println("Enter the Second Array: ");
            int[][] arr_2 = new int[r1][c1];
            for (int x = 0; x < r1; x++) {
                for (int y = 0; y < c1; y++) {
                    arr_2[x][y] = sc.nextInt();
                }
            }
            int[][] arr_3=new int[r][c1];
            if (c != r1){
                System.out.println("Wrong dimention: ");
                return;
            }
            else
                for (int i=0;i<r;i++){
                    for (int j=0;j<c1;j++){
                        for (int k=0;k<c;k++){
                            arr_3[i][j] +=arr_1[i][k]+arr_2[k][j];
                        }
                    }
                }



            printArr(arr_1, r, c);
                printArr(arr_2,r1,c1);
        System.out.println("The Multiply array: ");
                printArr(arr_3,r,c1);



    }
}
