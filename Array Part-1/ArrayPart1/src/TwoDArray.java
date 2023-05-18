public class TwoDArray {
    public static void main(String[] args) {
        int arr[][]=new int[2][2];
        arr[0][0]=1321;
        arr[0][1]=131;
        arr[1][0]=151;
        arr[1][1]=111;
        //System.out.println(arr[0][0]);
        //System.out.println(arr[0][1]);
       // System.out.println(arr[1][0]);
       // System.out.println(arr[1][1]);
        for (int i=0;i< arr.length;i++){
            for (int j=0; j< arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
