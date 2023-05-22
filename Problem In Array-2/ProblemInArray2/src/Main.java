import java.util.Scanner;

public class Main {
    static int[] reverse(int[] arr_1){
        int n=arr_1.length;
        int[] arr_2=new int[n];
        int j=0;
        for (int i=arr_1.length-1;i>=0;i--){
            arr_2[j++]=arr_1[i];
        }
        return arr_2;
    }

    static void swapwithOutT(){
        int temp=0;
        int i=9 ,j=88;
        System.out.println("Before Swap a= "+i);
        System.out.println("Beore Swap b= "+j);
        i=i+j;
        j=i-j;
        i=i-j;
        System.out.println("after Swap a= "+i);
        System.out.println("After Swap b="+j);
    }


    static void swapwithT(){
        int temp=0;
        int i=9 ,j=88;
        System.out.println("Before Swap a= "+i);
        System.out.println("Beore Swap b= "+j);
        i=temp;
        i=j;
        j=temp;
        System.out.println("after Swap a= "+i);
        System.out.println("After Swap b="+j);
    }
    static void pprintArray(int[] arr){
        int n=arr.length;
        System.out.println("The Original Array is: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void swapArr(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reversrdw(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swapArr(arr , i , j);
                i++;
                j--;

        }
    }
    static void reversrd(int[] arr ,int i,int j){

        while(i<j){
            swapArr(arr , i , j);
            i++;
            j--;

        }
    }

    static void rotateInplace(int[] arr ,int k){
        int n=arr.length;
        k=k%n;
        reversrd(arr,0,n-k-1);
        reversrd(arr,n-k,n-1);
        reversrd(arr,0,n-1);
    }

    static int[] rotate(int[] arr ,int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<k-n;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Ente the Size of the Array: ");
       int n=sc.nextInt();
       int[] arr=new int[n];
        System.out.println("Enter the Array Size: ");
       for (int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }

        pprintArray(arr);
        //swapwithT();
       // swapwithOutT();
        System.out.println("Enter K: ");
              int k=sc.nextInt();
       // pprintArray(arr);
        System.out.println("After reversed: ");
       //reversrd(arr);
      // int[]ans= rotate(arr,k);

        //System.out.println(ans);
      //  pprintArray(ans);
        System.out.println("after Rotation: ");
        rotateInplace(arr,k);
        pprintArray(arr);
    }
}