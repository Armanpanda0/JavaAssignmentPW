public class Triiangle {
    int a;
    int b;
    int c;
    Double area=1.0;
    int perimiter=0;

    public static void main(String[] args) {
        Triiangle ob1=new Triiangle();

        ob1.a=3;
        ob1.b=4;
        ob1.c=5;
        ob1.area=.5 * ob1.b * ob1.c;
        System.out.println("Area of the Triangle is: "+ob1.area);
        ob1.perimiter= ob1.a+ ob1.b+ ob1.c;
        System.out.println("Perimiter of the Triangle is: "+ ob1.perimiter);
    }
}
