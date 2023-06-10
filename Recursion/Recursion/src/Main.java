import java.util.Scanner;

public class Main {

    static void printDecrasing(int n){
        //base case for haltaing the case from infinite loop
        if(n==1){
            System.out.println(n);
            return;
        }
        // self work because we print it in a reverse manner
        System.out.println(n);
        // recursive woprk because of the
        printDecrasing(n-1);
    }
    static void printIncreasing(int a){
        //Base case for which it will stop calling ,and recursion will stop
        if(a==1){
            System.out.println(a);
            return;
        }
        printIncreasing(a-1);
        System.out.println(a);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       //printIncreasing(n);
        printDecrasing(n);
    }
}