public class Main {

    static int factorial(int n){
        // Base care
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}