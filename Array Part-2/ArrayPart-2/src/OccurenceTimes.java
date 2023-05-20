import java.util.Scanner;

public class OccurenceTimes {

    static void xOccurenceTimes(int[] arr,int x){
        int count=0;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            if (arr[i] == x){
                count++;
            }

        }
        System.out.println("\nNumber of times: \n"+count+"\n");
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[] = {1 , 4, 7 , 9 , 1};
        xOccurenceTimes(a,1);
    }
}
