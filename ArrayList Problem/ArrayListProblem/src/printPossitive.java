import java.util.ArrayList;
import java.util.Scanner;

public class printPossitive {


    static void print(ArrayList<Integer> l1){

        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number of Elment; ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        ArrayList<Integer> l1=new ArrayList<>();
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       //print(l1);
        for (int i=0;i<n;i++) {
            if (arr[i] >= 0) {
                l1.add(arr[i]);
            }
        }
            if (l1.size()==0){
                System.out.print("Na");
                return;
            }

        print(l1);
    }
}
