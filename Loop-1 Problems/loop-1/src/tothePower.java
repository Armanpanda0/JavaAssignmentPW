import java.util.Scanner;

public class tothePower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int num=1;
        int sum=1;

        while (num<=b){
            sum *=a;
            num++;
        }
        System.out.println(sum);
        /*for (int i=1 ;i<=b;i++){
            num *=a;
        }
        System.out.println(num);*/
    }
}
