import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the oprands '+', '-' , '*' , '/' , '%' ");
        char n=sc.next().charAt(0);
        System.out.println("First number is ");
        Double num1=sc.nextDouble();
        System.out.println("First number is ");
        Double num2=sc.nextDouble();
        System.out.println("The Outp;utb is: ");

        Double rlt;
        switch (n){
            case '+':
                rlt=num1+num2;
                System.out.println(rlt);
                break;

            case '-':
                rlt = num1-num2;
                System.out.println(rlt);
                break;
            case'*':
                rlt=num1*num2;
                System.out.println(rlt);
                break;
            case '/':
                rlt=num1/num2;
                System.out.println(rlt);
            case '%':
                rlt=num1%num2;
                System.out.println(rlt);

        }
    }
}
