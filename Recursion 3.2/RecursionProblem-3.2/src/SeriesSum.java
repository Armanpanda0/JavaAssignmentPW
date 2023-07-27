import java.util.Scanner;

public class SeriesSum {
    static void sors(int n,int m,boolean flag){
        System.out.print(m+" ");
        if (flag==false && n==m)
            return;
        if (flag){

            if (m-5 >0)
                sors(n,m-5,true);
            else
                sors(n,m-5,false);
        }
        else
            sors(n,m+5,false);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sors(n,n,true);
    }
}
