import java.util.Scanner;

public class binaryTOgray {
    static int binToGra(int x, int i){
        int a,b;
        int result=0;
        if (x != 0){
            a=x%10;
            x=x/10;

            b=x%10;
            if (((a & ~b)==1) || ((~a & b)==1) ){
                result = (int) (result+Math.pow(10,i));
            }
            return binToGra(x, ++i)+result;
        }
       return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(binToGra(x,0));

    }

}
