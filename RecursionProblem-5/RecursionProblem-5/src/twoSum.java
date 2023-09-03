import java.util.Scanner;

public class twoSum {

    static int TwoSum(int[] arr,int n,int sum){
        int i=0,j=n-1,k=0,ans=0;
        while (i<j) {
            k = arr[i] + arr[j];
            if (k == sum) {
                ans++;
                j--;
                i++;
            } else if (k > sum) {
                j--;
            } else {
                i++;
            }

        }
        if (ans == 0) return -1;
        return ans;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input The Aray Size ");
        int m=sc.nextInt();
        int[] arr=new int[m];
        for (int i =0 ;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.print("["+arr[i]+"]");
        }
        System.out.println("sum is = ");
        int n=sc.nextInt();
        int sum=0;

        System.out.println(TwoSum(arr,n,sum));
    }
}
