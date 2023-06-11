public class Main {

    static int countdigit(int n){
        if (n >=0 && n<= 9){
            return 1;
        }
        return countdigit(n/10)+countdigit(n%10);
    }
    public static void main(String[] args) {
        System.out.println(countdigit(123456));
    }
}