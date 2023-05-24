import java.util.Scanner;

public class RangeQuary {


    static int[] sumArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        printArray(arr);

        System.out.println("Modified array: ");
        int[] sum = sumArray(arr);
       // printArray(sum);

        System.out.println("Enter the no of Quary: ");
        int q=sc.nextInt();
        while (q-- > 0){
            System.out.println("The Indeses: ");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=sum[r]-sum[l-1];
            System.out.println(ans);
            }
        }
    }

