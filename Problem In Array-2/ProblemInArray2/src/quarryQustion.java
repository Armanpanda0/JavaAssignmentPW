import java.util.Scanner;

public class quarryQustion {

    static int[] frequeArray(int[] arr){
        int[] freq=new int[100005];

        for (int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the Array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("No.of Quary to be asked:  ");
        int q=sc.nextInt();

        int[] freq=frequeArray(arr);

        while (q>0){
            System.out.println("Enter the quary: ");
            int x=sc.nextInt();
            if (freq[x] >0){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
            q--;
        }
    }
}
