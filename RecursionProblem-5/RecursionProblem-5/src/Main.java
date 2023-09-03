import java.util.Scanner;

public class Main {
    static int findpath(int m,int n){
        if (m==1 || n==1){
            return 1;
        }
        int make=findpath(m-1,n)+findpath(m,n-1);
        return  make;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(findpath(a,b));
    }
}