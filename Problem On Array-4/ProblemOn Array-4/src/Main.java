import java.util.Scanner;

public class Main {


    static int[] sumArray(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        ans[0]=arr[0];
        for (int i=1;i<n;i++){
            ans[i]=ans[i-1] + arr[i];
        }
        return ans;
    }



    static void printArray(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the Array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array: ");
        printArray(arr);

        System.out.println("Modified array: ");
        int[] sum=sumArray(arr);
        printArray(sum);
       // System.out.println(sum);
    }
}