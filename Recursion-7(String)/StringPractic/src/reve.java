public class reve {
    public static void main(String[] args) {
        String str="aaassss";
        System.out.println("Before Reverse:");
        System.out.print(str+"\n");
        System.out.println("After reverse: ");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
