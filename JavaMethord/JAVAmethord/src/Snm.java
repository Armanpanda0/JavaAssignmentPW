
class Allgebra{
    int a;
    int b;
    Allgebra(int x,int y){
        System.out.println("My First Constructor");
        a=x;
        b=y;
    }
    int misana(){
        return a+b;
    }
    int fedana(){
        return a-b;
    }
    int gunana(){
        return a*b;
    }


}


public class Snm {
    public static void main(String[] args) {
        Allgebra obj1=new Allgebra(5,10);

        System.out.println(obj1.misana());
        System.out.println(obj1.fedana());
        System.out.println(obj1.gunana());

        Allgebra obj2=new Allgebra(11, 22);
        System.out.println(obj1.misana());
        System.out.println(obj1.fedana());
        System.out.println(obj1.gunana());

    }
}
