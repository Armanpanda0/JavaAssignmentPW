public class Complex {
    int real;
    int imgin;

    public static void main(String[] args) {
        Complex a1=new Complex();
        Complex a2=new Complex();
         a1.real=2;
         a1.imgin=4;
         a2.real=3;
         a2.imgin=4;

        System.out.println("Addition");
        System.out.print(a1.real+ a2.real);
        System.out.println("+"+a1.imgin+a2.imgin+"i");

        System.out.println("Difference");
        System.out.print(a1.real - a2.real);
        System.out.println("+"+(a1.imgin-a2.imgin)+"i");

        System.out.println("Product");
        System.out.print(a1.real * a2.real);
        System.out.print("+"+(a1.imgin  *  a2.imgin)+"i");

    }
}
