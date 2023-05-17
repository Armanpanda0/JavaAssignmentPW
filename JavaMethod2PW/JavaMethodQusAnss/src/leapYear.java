import java.util.Scanner;
class Getyear{
    int year(){
        Scanner sc =new Scanner(System.in);
        int yr=sc.nextInt();
        boolean leap= false;

        if (yr % 4 ==0){
            if (yr % 100 == 0){

                if (yr %400 == 0 ){
                    leap= true;
                  //  System.out.println(yr+" Is the leap year if(400)");
                }
                else
                    leap = false;
                //System.out.println(yr+" Not leap year else(400)");

            }
            else
                leap = true;
              //  System.out.println("This is leap year elsr(100)");
        }
        else
            leap = false;
            //System.out.println(yr+" Not leap year else(4)");

        if (leap)
            System.out.println(yr+"This is Leap year");
        else
            System.out.println(yr+" "+"Is not a leap year"+"   This is else of out of the if");

        return yr;
    }
}

public class leapYear {
    public static void main(String[] args) {
        Getyear obj1=new Getyear();
        int ans=obj1.year();
        System.out.println(ans);
    }
}
