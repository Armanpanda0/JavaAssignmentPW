public class powisTo {


    static int pow1(int p,int q){
        if (q==0){
            return 1;
        }
        int subPow=pow1( p ,q/2);
        if (q%2 == 0)
             return subPow * subPow;
        return p* subPow* subPow;
    }

    public static void main(String[] args) {
        System.out.println(pow1(3,2));
    }
}
