import java.util.Scanner;

public class Main {
    static int TriplesumEqual(int[] arr,int x){
        int n=arr.length;
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    static int sumEqual(int[] arr,int x){
        int n=arr.length;
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Arrays: ");

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Sum you want: ");
        int x=sc.nextInt();
       // System.out.println("There is: "+sumEqual(arr ,x));
        System.out.println("There are such: "+TriplesumEqual(arr,x)+" Pairs in the Entered array");

    }
}