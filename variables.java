public class variables {
        public static void main(String[] args) {
        String name = "Sandeep";
        int age = 19;
        int mark = 80;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);
        if ( age >= 18 && mark >= 40 ) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        System.out.println();
        if ( mark % 2 == 0 ) {
            System.out.println("Marks are Even");
        } else {
            System.out.println("Marks are Odd");
        }
        System.out.println();
            System.out.println("Numbers from 1 to 20: ");
        for ( int i = 1 ; i <= 20 ; i++ ) {
            if ( i == 3 ) {
                continue;
            } if ( i == 6 ) {
                continue;
            } if ( i == 9 ) {
                continue;
            } if ( i == 12 ) {
                continue;
            } if ( i == 15 ) {
                continue;
            } if ( i == 17 ) {
                break;
            }
            System.out.println(i);
        }
        System.out.println();
        int i = 1;
        int sum = 0;
        while ( i <= 10 ) {
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        System.out.println();
        System.out.println("7 Multiplication Table: ");
        int j =1;
        do { 
            System.out.println("7 * " + j + " = " + (7 * j));
            j++;
        } while ( j <= 10 );
    }
}