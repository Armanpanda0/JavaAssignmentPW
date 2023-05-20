import java.util.Scanner;

public class ReferenceArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        int [] arr2=arr;
        int[] arr3 =arr2;
        System.out.println("Enter the Arrays: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The original Array: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe Reference Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println("\nThe Reference Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
