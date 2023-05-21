import java.util.Scanner;

public class ReapitingArray {

    static int number(int[] arr){
        int n =arr.length;

        int count=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the Arrays: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("IS: "+number(arr));
    }
}
