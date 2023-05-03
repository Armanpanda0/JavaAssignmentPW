import java.util.Scanner;
public class mark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int math=sc.nextInt();
        int eng=sc.nextInt();
        int sci=sc.nextInt();
    int tat=math+eng+sci;
        float per=tat/300;
        System.out.println("Total Mark is: "+(math+eng+sci));
        System.out.println("Percentage is:"+per);

    }
}
