public class Main {

    static int fum(int num,int k){
        if(k==0){
            return 0;
        }
        return fum(num ,k-1) + num;
    }
    static int fum1(int num,int k){
        if(k==0){
            return 1;
        }
        return fum1(num ,k-1) * num*k;
    }

    public static void main(String[] args) {
        for(int i=0;i<8;i++) {
            System.out.print(fum1(12, i)+" ");
        }
    }
}