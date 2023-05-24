import java.util.Scanner;

public class partition {

    static int sumArray(int[] arr) {
        int n = arr.length;
        int totalsum=0;
        for (int i = 1; i < n; i++) {
            totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean equalsumPartition(int[] arr){
        int tatalsum=sumArray(arr);
       // System.out.println("1"+tatalsum);
        int presum=0;
        for (int i=0;i<arr.length;i++){
            presum += arr[i];
            int sufixSum= tatalsum - presum;
            if (presum==sufixSum){
                System.out.println("1");
                return true;

            }
        }
        //System.out.println("2"+tatalsum);
                return false;
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

       // System.out.println("Original Array: ");
       // printArray(arr);

        System.out.println("Modified array: ");
       // int[] sum = sumArray(arr);
        // printArray(sum);
        System.out.println("Is "+equalsumPartition(arr));



    }
}
