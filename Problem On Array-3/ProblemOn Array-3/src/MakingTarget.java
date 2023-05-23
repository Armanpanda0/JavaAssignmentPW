import java.util.Scanner;

public class MakingTarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n=sc.nextInt();

        System.out.println("Enter the array; ");
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The original Array is: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nThe target sum: ");
        int target=sc.nextInt();

        int st=0;
        int lt=n-1;
        while (st < lt){
            if (arr[st]+arr[lt] == target){
                System.out.println(++st+ " "+ ++lt);
                System.out.println(arr[st]+ " "+ arr[lt]);
                return;
            }
            else if (arr[st] + arr[lt] > target){
                lt--;
            }
            else
                st++;
        }
        System.out.println(-1);
    }
}
