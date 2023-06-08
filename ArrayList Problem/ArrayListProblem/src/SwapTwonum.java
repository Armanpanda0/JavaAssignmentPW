import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapTwonum {
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
        ArrayList<Integer> l1=new ArrayList<>();
        for (int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        print(l1);
        System.out.println("Enter the index: ");
        int i=sc.nextInt();
        int j=sc.nextInt();
        int temp=l1.get(i);
        Collections.swap(l1,i,j);
        print(l1);
    }
}
