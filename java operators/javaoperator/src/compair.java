import java.util.Scanner;
public class compair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=55,b=70;
        if (a<50 && a<b){
            System.out.println("True");
        }
        else if (a<50 || a<b){
            System.out.println(" Second STrue");
        }
    }
}
