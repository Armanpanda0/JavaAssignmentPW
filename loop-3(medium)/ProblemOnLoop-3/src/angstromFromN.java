import java.util.Scanner;
public class angstromFromN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int num=n;

        while(num!=0){
            int id =num%10;
            sum = sum+(id*id*id);
            num=num/10;


        }
        System.out.println(sum);
        if (sum==n){
            System.out.println("This is ");
        }
        else
            System.out.println("not");

    }
}
