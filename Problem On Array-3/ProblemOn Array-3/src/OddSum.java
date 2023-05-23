import java.util.Scanner;

public class OddSum {
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
        int odd=0 ,even=0,sum=0;
        for (int num :arr){
            if (num % 2 == 1){
                int temp=odd;
                odd=even;
                even=temp;
                odd++;
            }
            else {
                even++;
            }
            sum += odd;
        }
        System.out.println("The rearrange Number: ");
        System.out.println(sum);

    }
}
