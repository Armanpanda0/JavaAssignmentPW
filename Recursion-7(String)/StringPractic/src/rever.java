import java.util.Scanner;

public class rever {

    static String reverse(String str){
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
           // System.out.println(rev);
        }
        if(str.equals(rev)){
            System.out.println("String is Pallindrom");
        }else
            System.out.println("Your String  is Not palindrom");
        return rev;
    }


    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
        System.out.println(reverse(str));
    }
}
