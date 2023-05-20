public class LastOccurence {


    static boolean shorted(int[] arr) {

        boolean check=true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                check=false;
                break;
            }
        }
        return check;
    }
    static void strictlyGrater(int[] arr,int z){
        int index=0;
        System.out.println("\nThe Arrays Are:  ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            if (arr[i]>z){
                index++;
            }
        }
        System.out.println("\nStrigthtly Grater Than that of the "+z+" is: "+index);

    }

    static void lastoccur(int[]arr,int y){
        int index=-1;
        System.out.println("\nThe Arrays Are:  ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            if (arr[i]==y){
                index=i;
            }
        }
        System.out.println("\nThe Lasy index Occurance "+y+" is at: "+index);
    }


    public static void main(String[] args) {

        int a[] = {1 , 4, 7 , 9 , 1};
        int an[] = {1 ,2,3,4,5,7};

        int x;
       // lastoccur(a,0);
       // strictlyGrater(a,9);
        System.out.println(shorted(an));System.out.println(shorted(a));


    }
}
