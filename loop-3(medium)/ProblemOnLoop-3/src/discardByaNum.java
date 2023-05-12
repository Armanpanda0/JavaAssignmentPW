import java.util.Scanner;
public class discardByaNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sum=1;
        int num=0;
        while(num != -1){
            num=sc.nextInt();
            sum=sum+num;

        }
        System.out.println(sum);
    }
}
