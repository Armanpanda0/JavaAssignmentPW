public class sumDigit {


    static int sumdiz(int n){
        if (n>=0 && n<=9){
            return 1;
        }
        return sumdiz(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.println(sumdiz(12346));
    }
}
