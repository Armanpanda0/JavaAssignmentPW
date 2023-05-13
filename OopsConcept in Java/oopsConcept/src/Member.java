public class Member {
    int roll;
    String studentName;

    public static void main(String[] args) {
        Member obj1=new Member();
        obj1.roll=2001289078;
        obj1.studentName="Arman";
        System.out.print(obj1.roll+" ");
        System.out.println(obj1.studentName);

        Member obj2=new Member();
        obj2.roll=12345;
        obj2.studentName="Rahul";
        System.out.println(obj2.roll+" "+obj2.studentName);
    }
}
