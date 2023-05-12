import java.util.Scanner;
public class BenjaminBulbe {
    public static void main(String[] args) {
        Scanner ssc=new Scanner(System.in);

        int n= ssc.nextInt();
        for (int i=1;i*i <=n;i++){
            System.out.print(i*i + " ");
        }
    }
}
