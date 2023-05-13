public class Main {
    public static void main(String[] args) {
        int p=9 , q=10;
        System.out.println(p | q);//11
        System.out.println(p & q);//8
        System.out.println(~p);//6

        System.out.println(~q);//5

        System.out.println(p<<1);//18
        System.out.println(p<<2);// p +=  2 raise to the power 2=36

        System.out.println(q>> 1 );// p /= 2 raise to the power 2 =5
        System.out.println(q >> 2); // 2
    }
}