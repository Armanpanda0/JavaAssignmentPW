import java.util.Scanner;

public class Main {


    static void prifixSum1(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        // prifixSum operation on the row
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
    }
    static void prifixSum(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;
        // prifixSum operation on the row
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                arr[i][j] += arr[i][j-1];
            }
        }

        //PrifixSum on column operationm
        for (int j=0;j<c;j++){ // Constantaing the column
            for (int i=1;i<r;i++){
                arr[i][j] += arr[i-1][j];
            }

        }
    }

    static int findsum1(int[][] arr,int l1,int r1,int l2,int r2){
        int ans=0;
        for (int i=l1; i<= l2;i++){
            for (int j=r1; j<= r2;j++){
                ans +=arr[i][j];
            }
        }
        return ans;
    }

    static int findsum2(int[][] arr,int l1,int r1,int l2,int r2){
        int ans=0;
        prifixSum1(arr);
        for (int i=l1; i<= l2;i++){
            if (r1>=1) {
                ans += arr[i][r2] - arr[i][r1 - 1];
            }
            else {
                ans += arr[i][r2];
            }
        }
        return ans;
    }

    static int findsum3(int[][] arr,int l1,int r1,int l2,int r2){
        int ans=0, sum=0 , up=0, left=0 ,upleft=0;
        prifixSum(arr);
        sum += arr[l2][r2];
        if(l1>=1) {
            up += arr[l1 - 1][r2];
        }
        if (r1 >=1) {
            left += arr[l2][r1 - 1];
        }
        if (l1 >=1 && r1>=1) {
            upleft += arr[l1 - 1][r1 - 1];
        }

        ans = sum - left - up + upleft;
        return ans;
    }
    static void printArra(int[][] arr,int r,int c){

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row and col no: ");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int[][] arr=new int[r][c];
        System.out.println("Enter "+ r*c +" Elments ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        printArra(arr,r,c);


        System.out.println("Enter l1, r1, l2, r2 ");
        int l1=sc.nextInt();
        int r1=sc.nextByte();
        int l2=sc.nextByte();
        int r2=sc.nextByte();



        //System.out.println("Sum is "+ findsum1(arr,l1,r1,l2,r2));
       // System.out.println("Sum is "+ findsum2(arr,l1,r1,l2,r2));
        System.out.println("Sum is "+ findsum3(arr,l1,r1,l2,r2));
    }
}