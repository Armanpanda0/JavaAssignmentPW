

class maxnum{
    void max(){
        int arr[]={2, -3, 5, 8, 1, 0, -4};
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>count){
                count=arr[i];
            }
        }
        System.out.println("Maximum is: "+count);
    }
}
class Varible{
    void Sum(){
        int arr[]={1,5,3,90,1};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum is: "+sum);
    }

}

public class SumoftheElement {
    public static void main(String[] args) {
        Varible obj1=new Varible();
        obj1.Sum();
        maxnum obj2=new maxnum();
        obj2.max();
    }
}
