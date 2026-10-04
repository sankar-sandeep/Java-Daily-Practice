public class daily {
    public static void main(String[] args) {
        for ( int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + ( 3 * i ));
        }
        System.out.println();
        System.out.println("Multiplication Table:");
        int j = 1;
        while ( j <= 10 ) {
            System.out.println("4 * " + j + " = " + ( 4 * j ));
            j++;
        }
        System.out.println();
        int k = 1;
        do { 
            System.out.println("5 * " + k + " = " + ( 5 * k ));
            k++;
        } while ( k <= 10);
        System.out.println();
        int mark1 = 85;
        int mark2 = 78;
        int mark3 = 92;
        int mark4 = 67;
        System.out.println("Marks: " + ( mark1 + mark2 + mark3 + mark4 ));
        System.out.println("Average: " + (( mark1 + mark2 + mark3 + mark4 ) / 4));
        if ( ( mark1 + mark2 + mark3 + mark4 ) / 4 >= 100 ) {
            System.out.println("Grade: A");
        } else if ( ( mark1 + mark2 + mark3 + mark4 ) / 4 >= 80 ) {
            System.out.println("Grade: B");
        } else if ( ( mark1 + mark2 + mark3 + mark4 ) / 4 >= 65 ) {
            System.out.println("Grade: C");
        } else if ( ( mark1 + mark2 + mark3 + mark4 ) / 4 >= 50 ) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

    }
}
