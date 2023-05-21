import java.util.Scanner;

public class Absolutw1 {






    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the Arrays: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j=i+1;j<n;j++){
                if (arr[j]-arr[i]==x){
                    System.out.println("yes");
                    return;
                }

            }
        }
        System.out.println("No");
    }
}
