import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int num=0;
        while(n !=0){
            n/=10;
            num++;
        }
        System.out.println(num);
    }
}