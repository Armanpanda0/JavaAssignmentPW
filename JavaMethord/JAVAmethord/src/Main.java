import java.util.Scanner;

class Algebra{
     int add(int a,int b){
        int sum =a+b;
        return sum;
    }

}
class subtraction{
    int sub(int s,int t){
        int sub=s-t;
        return sub;
    }

}
class Multiplication{
    int multi(int a,int b){
        int mul=a * b;
        return mul;

    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Algebra obj1 = new Algebra();
        subtraction  obj2= new subtraction();
        Multiplication obj3=new Multiplication();



        int x=sc.nextInt();
        int y=sc.nextInt();

        int ans=obj1.add(x ,y);
        int subb=obj2.sub(x,y);
       // obj3.multi(x , y);

        System.out.println("The Subtraction is: "+subb);
        System.out.println("The sum Is: "+ans);
        System.out.println("The Multiplicatiopn  is: "+obj3.multi(x, y));

    }
}