import java.util.Scanner;

public class armstrong {

    static int isArmstrong(int a,int dig){
        if (a==0) return 0;
        return pow(a%10,dig) + isArmstrong(a/10,dig);
    }

    static int pow(int a, int b){
        if (b==0){
            return 1;
        }
        int por=pow(a,b/2);
        if (b % 2 == 0){
            return por *por;
        }
        else
            return por * por * a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        int temp=a;
        while(temp != 0){
            count++;
            temp=temp/10;
        }
        if (a== isArmstrong(a,count)){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
