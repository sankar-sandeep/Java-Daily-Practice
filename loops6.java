public class loops6{
    public static void main(String[] args) {
       for ( int row = 1; row <= 10; row++) {
           for (int i = 1; i <= row; i++) {
               System.out.print(row + " ");
           }
           System.out.println();
       }
    }
}