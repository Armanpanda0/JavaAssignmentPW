import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the Selling Price:");
        int sp=sc.nextInt();
        System.out.println("Enter the coste Price: ");
        int cp=sc.nextInt();

        if (sp>cp){
            System.out.println("Profite ios: "+ (sp-cp));
        }
        else
            System.out.println("Your Loss is: "+ (cp-sp));
    }
}
