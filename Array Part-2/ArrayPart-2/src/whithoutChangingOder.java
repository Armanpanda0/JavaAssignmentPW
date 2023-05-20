import java.util.Scanner;

public class whithoutChangingOder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array: " );
        int n=sc.nextInt();
        int[] arr=new int[n];

        int[] res=new int[n];
        int index=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if (arr[i]>=0){
                res[index]=arr[i];
                index++;
            }
            if (arr[i]<0){
                res[index]=arr[i];
                index++;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(res[i]+" ") ;
        }
    }
}
