// 2D Array Printing only for the Practice


import java.util.Scanner;




public class Main {
    //Addition of the Array

    static void add(int[][] a,int r1,int c1 ,int[][] b,int r2,int c2){
        int[][] sum=new int[r1][c2];
        if (r1 != r2 || c1 != c2){
                System.out.println("Input the Wrong Dimantion: NOT TO BE ADD ");
            }
            else
                for (int i=0;i<r1;i++){
                    for (int j=0;j<c2;j++){
                        sum[i][j]=a[i][j]+b[i][j];
                    }

                }
                printarry(sum,r1,c2);
    }
    static void multi(int[][] a,int r1,int c1,int[][] b,int r2,int c2){

        int[][] mul=new int[r1][c2];
        if (c1 != r2){
            System.out.println("Invalid Dimention: ");
        }
        else
            for (int i=0;i<r1;i++){
                for (int j=0;j<c2;j++){
                    for (int k=0;k<c1;k++){
                        mul[i][j] += a[i][k]*b[k][j];
                    }
                    System.out.println();
                }
            }
        System.out.println("multiple value is: ");
            printarry(mul,r1,c2);

        }



    static void printarry(int[][] arr ,int r1,int c1){
            for (int i=0;i<r1;i++){
                for (int j=0;j<c1;j++){
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimention of the 1st array: ");
        int r1=sc.nextByte();
        int c1=sc.nextByte();
        int[][] a=new int[r1][c1];
        System.out.println("Enter the"+ r1*c1 + "element");
        for(int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the dimention of the 2st array: ");
        int r2=sc.nextByte();
        int c2=sc.nextByte();
        int[][] b=new int[r2][c2];
        System.out.println("Enter the"+ r2*c2 + "element");
        for(int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }


        System.out.println("The Array is: ");
        printarry(a,r1,c1);
        System.out.println("The Array is: ");
        printarry(b,r2,c2);

        //System.out.println("sum");
       // add(a,r1,c1,b,r2,c2);
        System.out.println("Multiple value is: ");
        multi(a,r1,c1,b,r2,c2);
    }
}