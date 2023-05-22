import java.util.Scanner;

public class rearrange {

    static int[] arrnag(int[] arr , int n){
        int indx=-1,temp=0;
        for (int i=0;i<n;i++){
            if (arr[i] < 0){
                indx++;
                temp=arr[indx];
                arr[indx]=arr[i];
                arr[i]=temp;
            }
        }

        int pos=indx+1, neg=0;
        while (pos<n && neg<pos && arr[neg]<0){
            temp=arr[pos];
            arr[pos]=arr[neg];
            arr[neg]=temp;
            pos++;
            neg +=2;
        }
        System.out.println(arr[pos]);
        return arr;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        System.out.println("Enter the Array: ");
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Original Array is:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.print("The Rarran array: ");

        //arrnag(arr,n);
       // System.out.print( arrnag(arr,n) +" ");


        int indx=-1,temp=0;
        for (int i=0;i<n;i++){
            if (arr[i] < 0){
                indx++;
                temp=arr[indx];
                arr[indx]=arr[i];
                arr[i]=temp;
            }
        }

        int pos=indx+1, neg=0;
        while (pos<n && neg<pos && arr[neg]<0){
            temp=arr[pos];
            arr[pos]=arr[neg];
            arr[neg]=temp;
            pos++;
            neg +=2;
        }
        System.out.println(arr[indx]);
    }
}
