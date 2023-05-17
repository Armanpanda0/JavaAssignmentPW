

class Aaverage{
    double average(int x,int y ,int z){
        double ans=(x+y+z)/3;
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Aaverage obj=new Aaverage();

        double anss=obj.average(25,45,65);
        System.out.println(anss);

        Aaverage obj1=new Aaverage();
        double ansz=obj1.average(25,25,25);
        System.out.println(ansz);
    }
}