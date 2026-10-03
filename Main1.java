public class Main1 {
    public static void main(String[] args) {
        String name = "Sandeep";
        int units = 185;
        int total = 455;
        System.out.println("========== ELECTRICITY BILL ==========");
        System.out.println("Customer: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println();
        System.out.println("Total = " + total);
        if ( units >=200 ) {
            System.out.println("Usage Category: High Usage");
        } else if ( units >= 100 ) {
            System.out.println("Usage Category: Medium Usage");
        } else {
            System.out.println("Low Usage");
        }
        if ( units % 2 == 0) {
            System.out.println("Units are Even");
        } else {
            System.out.println("Units are Odd");
        }
        System.out.println();
        System.out.println("Reading Check:");
        for ( int i = 1; i <= 5; i++)
            System.out.println(i);
        System.out.println();
        System.out.println("Bill Reminder:");
        int i = 5;
        while ( i <= 25) {
            System.out.println(i);
            i += 5;
        }
        int j = 1;
        do{
            System.out.println("3 * " + j + " = " + (3 * j));
            j++;
        } while ( j <= 10 );
        System.out.println();
        System.out.println("=======================================");
    }
}