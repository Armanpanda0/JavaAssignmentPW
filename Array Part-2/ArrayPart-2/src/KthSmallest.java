import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=6;
        int[ ]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Befor sort: ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("theK value: ");
        int k=sc.nextInt();

        System.out.println("After sort: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("is");
        System.out.println(arr[k-1]);
    }
}
