import java.util.Scanner;

public class testEquality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array Size: ");;
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        boolean check =false;

        System.out.println("Enter the !st Array: ");
        for (int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Ente the Second Array: ");
        for (int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if (arr1[i]==arr2[i]){
                check=true;
            }
        }
        System.out.println("Two Arrays are Same: "+ check);
    }
}
