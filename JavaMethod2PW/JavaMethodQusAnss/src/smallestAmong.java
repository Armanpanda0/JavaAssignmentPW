import java.util.Scanner;
class smallest{
    int smal(){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b= sc.nextInt();
       int c=sc.nextInt();

       if (a < b && a < c){
           System.out.println(a+ " Is Smallest among three");
       }
       else
           if (b < a && b < c){
               System.out.println(b+ " Is the Smallest one");
           }
           else
               System.out.println(c+ " is smallest");

       return 0;
    }

}

public class smallestAmong {
    public static void main(String[] args) {
        smallest obj1=new smallest();
        int smallIs=obj1.smal();
        System.out.println(smallIs);
    }
}
