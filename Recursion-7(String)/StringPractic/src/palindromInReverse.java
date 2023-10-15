import java.util.Scanner;

public class palindromInReverse {

    static boolean isPalindron(String s,int l,int r){
        if(l>=r) return true;
        return ((s.charAt(l)==s.charAt(r)) && isPalindron(s,l+1,r-1));

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isPalindron(str,0,str.length()-1));
    }
}
