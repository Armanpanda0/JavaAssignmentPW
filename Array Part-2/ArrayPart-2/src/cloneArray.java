import java.util.Arrays;
import java.util.Scanner;
public class cloneArray {
     static void clone(int[] arr,int[] arr2 ){
         System.out.println("\nOriginal Array: ");
         for (int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println("\nCloned Array: ");
         for (int i=0;i<arr2.length;i++){
             System.out.print(arr2[i]+" ");
         }
     }


    public static void main(String[] args) {
        int[] arry={1,3,44,55,66,73,223};
        int n=arry.length;
        int[] b= arry.clone();
       // int[] b = Arrays.copyOf(arry , 4);
        b[0]=33;
        clone(arry,b);
    }
}
