public class Employ {
    String name;
    int roll;
    String address;

    public static void main(String[] args) {
        Employ a1=new Employ();
        a1.name="Robert";
        a1.roll= 1994;
        a1.address= "64C- WallsStreet";

        Employ a2=new Employ();
        a2.name="Sam";
        a2.roll= 2000;
        a2.address= " 68D- WallsStreet";


        Employ a3=new Employ();
        a3.name="John";
        a3.roll= 1999;
        a3.address= "26B- WallsStreet";

        System.out.println("Name  "+"  Year_of_joining  "+"Address ");
        System.out.println(a1.name+ "  "+a1.roll+"             "+a1.address);
        System.out.println(a2.name+ "     "+a2.roll+"            "+a2.address);
        System.out.println(a3.name+ "    "+a3.roll+"             "+a3.address);
    }
}
