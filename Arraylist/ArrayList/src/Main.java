import java.util.ArrayList;
import java.util.Collections;
public class Main {

    static void reverse(ArrayList<Integer> l1){
        int i=0;
        int j=l1.size()-1;

      /*  while (i<j){
            Integer temp = Integer.valueOf(l1.get(i));
            l1.set(i,l1.get(j));
            l1.set(j,temp);
            i++;
            j--;
        }*/
        while(i<j){
            Integer temp=Integer.valueOf(l1.get(i));
            l1.set(i,l1.get(j));
            l1.set(j,temp);
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();

        //adding the Elements
        l1.add(1);
        l1.add(9);
        l1.add(4);
        l1.add(5);
        l1.add(3);
        l1.add(0);
      //  System.out.println("The Array is: "+ l1);

        //Deleteing Thge Element .remove()
        l1.remove(0);//9 4 5 3

        //System.out.println("The Array is: "+ l1);

        //adding the element in the
        l1.add(1,10);

        //System.out.println("The Array is: "+ l1);

        //Direct delete the Element:
        l1.remove(Integer.valueOf(4));
        System.out.println("The Array is: "+ l1);


//        reverse(l1);
        Collections.reverse(l1);
       // System.out.println("The Array is: "+ l1);
        Collections.reverseOrder();
        System.out.println("The ReverseOrder Array is: "+ l1);
        Collections.sort(l1);
        System.out.println("The Ascnding Array is: "+ l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("The Descnding Array is: "+ l1);
    }
}