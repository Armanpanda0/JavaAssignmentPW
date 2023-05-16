import example.me.Image;

public class Picture {
    public static void main(String[] args) {
        Image obj1=new Image();
        System.out.println("Totally oputside the Package: "+obj1.str_1);

       // Picture obj2=new Picture();
        Image3 onj=new Image3();
        onj.img3();
    }
}

class Image3 extends Image{
    void img3(){
        Image obj1=new Image();
        System.out.println("This is the Outside from package and also outside the class picture: "+ obj1.str_1);
    }
}
