import java.util.Locale;
import java.io.*;
import java.util.Scanner;

class Voiwel{
    int Vowel(){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
      //  str.toLowerCase();
        int count=0;

        for (int i=1;i<= str.length();i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count ++;
            }

        }
       // System.out.println(count);
        System.out.println();
        return count;
    }
}

public class ViowelCount {
    public static void main(String[] args) {
        Voiwel obj1= new Voiwel();
        int is=obj1.Vowel();
        System.out.println("Total number of Vowels are: "+ is);
    }

}
