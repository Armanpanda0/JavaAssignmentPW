import java.util.Scanner;

public class CountConsonant {
   static int countConso(String s){
       int count=0;
       for (int i=0;i<s.length();i++) {
           if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)==' '){
             //  count++;
           }else
               count++;

       }
       return count;
   }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("No of consonant is "+countConso(str));
    }
}
