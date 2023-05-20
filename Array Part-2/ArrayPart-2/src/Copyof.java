import java.util.Arrays;

public class Copyof {
    static void Ancopy(int[] arr,int[] arr1){
        System.out.println("Original Array: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nCopyed of Array: ");
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }


    public static void main(String[] args) {
        int[] arry={22,33,55,66,753,2352};
        int[] b = Arrays.copyOf(arry,3);
        b[0]=130;
        Ancopy(arry,b);
    }
}
