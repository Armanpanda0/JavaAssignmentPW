import java.util.Scanner;

public class binaryTodecimal2 {

    static int dtb(int y){
        if (y==1){
            return y;
        }
        System.out.print(y%2);
        return dtb(y/2);
    }
    static int rev(int x){
        int revv=0;
        while(x != 0){
             revv=x%2;
            x=x/2;
            System.out.println(revv);
        }
        return revv;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        System.out.print(rev(y));
    }
}
