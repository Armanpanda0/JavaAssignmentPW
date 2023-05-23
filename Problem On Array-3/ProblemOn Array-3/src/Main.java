import java.util.Scanner;

public class Main {


    static int[] sortAndSquare(int[] arr){
        int n=arr.length;
        int st=0;
        int lt=n-1;
        int[] ans=new int[n];
        int k=0;
        while(st <= lt ){
            if (Math.abs(arr[st]) < Math.abs(arr[lt])){
                //arr[lt] *= arr[lt];
                ans[k++]=arr[lt] * arr[lt];
                lt--;
            }
            else{
                //arr[st] *= arr[st] ;
                ans[k++]=arr[st]* arr[st];
                st++;
            }



        }
        reverse(ans);
        return ans;
    }
    static void paritybit(int[] arr){
        int n=arr.length;
        int st=0;
        int lt=arr.length-1;
        while(st < lt){
            if (arr[st] % 2 ==1 & arr[lt] % 2 ==0){
                swaparray(arr, st ,lt);
                st++;
                lt--;
            }
            if (arr[st] % 2==0) {
                st++;
            }
            if (arr[lt] % 2 ==1){
                lt--;
            }
        }
    }

    static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i < j) {
            swaparray(arr, i, j);
            i++;
            j--;
        }
    }
    static void swaparray(int[] arr ,int i,int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
       // System.out.println();
    }


    static void sprtZerosAndOnes(int[] arr){
        int n=arr.length;
        int st=0;
        int lt=n-1;
        while(st < lt){
            if (arr[st]==1 & arr[lt]==0){
                swaparray(arr, st ,lt);
                st++;
                lt--;
            }
            if (arr[st]==0) {
                st++;
            }
            if (arr[lt]==1){
                lt--;
            }
        }
    }


    static void printarray(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n=sc.nextInt();
        System.out.println("Enter the Araay: ");
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Original array: ");
        printarray(arr);

        System.out.println("\nThe Rearrange Array: ");
      //  sprtZerosAndOnes(arr);
        //paritybit(arr);
        sortAndSquare(arr);
       // reverse(arr);
        int[] arar=sortAndSquare(arr);
        printarray(arar);
    }
}