import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void print(ArrayList<Integer> l1){

        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(4);
        l1.add(3);
        l1.add(5);
        l1.add(2);
        l1.add(7);
        print(l1);
        //insert ar 1s
        l1.add(0,10);
        print(l1);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the Element: ");
        for (int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        System.out.println("Enter the Num: ");
        int x=sc.nextInt();
        l1.add(0,x);
        print(l1);
    }
}