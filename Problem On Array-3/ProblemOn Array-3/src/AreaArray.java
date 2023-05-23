import java.util.Scanner;

public class AreaArray {
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
        System.out.println("\nThe Reaeeange array is: ");

        int st=0;
        int lt=arr.length-1;
        int ans=0;
        while(st < lt){
            int width=lt-st;
            int ht= Math.min(arr[st],arr[lt]);
            int area=ht*width;
            ans=Math.max(ans,area);

            if (arr[st]<arr[lt]){
                st++;
            }
            else {
                lt--;
            }
        }
        System.out.println(ans);
    }
}
