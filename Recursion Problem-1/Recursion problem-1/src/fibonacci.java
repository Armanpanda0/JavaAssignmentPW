public class fibonacci {


    static int fibo(int n){
        // base case
        if (n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        for (int i=0;i<7;i++) {
            System.out.print(fibo(i)+ " ");
        }
    }
}
