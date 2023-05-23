import java.util.Scanner;

public class arranging {
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

        System.out.println("Enter the Number to be Searched: ");
        int m=sc.nextInt();
        System.out.println("Occurance is:: ");
        boolean check=false;
        for (int i=0;i<n;i++){
            if(m==arr[i]){
                check=true;
               // System.out.print("TRUE");
            }
            else
                check=false;
              //  System.out.print("FALSE");
        }
        System.out.println(check);

    }
}
