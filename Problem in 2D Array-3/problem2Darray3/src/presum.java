import java.util.Scanner;

public class presum {




    static int prifixSum(int[][] arr){
        int ans=0;
        int r=arr.length;
        int c=arr[0].length;
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                arr[i][j] += arr[i][j-1];
            }
        }


        return ans;
    }

    static void printarray(int[][] arr,int r,int c){

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+ " ");
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
        printarray(arr, r,c);
        prifixSum(arr);
        System.out.println("PrifixSum Array: ");
        printarray(arr,r,c);

    }

}
