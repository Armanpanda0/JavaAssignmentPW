package example.me;

import javax.naming.InterruptedNamingException;

public class Image {
    public String str_1="This is The Constructer Class";

    void img1(){
        System.out.println("This is inside the img1: "+str_1);
    }

    public static void main(String[] args) {
        Image obj1=new Image();
        obj1.img1();
        System.out.println("\nCalling string Directly: "+obj1.str_1);


        Image1 obj2=new Image1();
        obj2.img2();


    }
}

class Image1{
    void img2(){
        Image obj=new Image();
        System.out.println("\nInside the Pcackage but out side the class: "+ obj.str_1);
    }
}

