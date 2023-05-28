import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class countThe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Row: " );
        int n=sc.nextInt();
        System.out.println("Column: ");
        int m=sc.nextInt();


        int[][] arr=new int[n][m];
        System.out.println("Enter "+ n*m +" No. element");

        for (int k=0;k<n;k++){
            for (int j=0;j<m;j++){
                arr[k][j]=sc.nextInt();
            }
        }

        Arrays.sort(arr,(a,b) -> a[0]-b[0]);
        int count=0;
        int i=0;
        while (i<n){
            while(i< n-1 && arr[i+1][0] < arr[i][1]){
                arr[i+1][0]=arr[i][0];
                arr[i+1][1]=Math.max(arr[i][1],arr[i+1][1]);
                i++;
            }
            i++;
            count++;
        }
        System.out.println(count);
    }
}
