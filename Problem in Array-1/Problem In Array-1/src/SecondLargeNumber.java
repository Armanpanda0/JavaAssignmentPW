import java.util.Scanner;

public class SecondLargeNumber {
    static int largnum(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int Secondlar(int[] arr2){
        int maxi=largnum(arr2);
        int n=arr2.length;
        for (int i=0;i<n;i++){
            if (arr2[i]==maxi){
                maxi=Integer.MIN_VALUE;
            }

        }
        int secondMax=largnum(arr2);
        return secondMax;


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
        System.out.println("Fiest is:"+largnum(arr));
        System.out.println("Second is: "+Secondlar(arr));
    }
}


