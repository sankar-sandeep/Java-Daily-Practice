public class practice6 {
    public static void main(String[] args) {
        String name = "Sankar Sandeep";
        int age = 19;
        int mark1 = 85;
        int mark2 = 78;
        int mark3 = 92;
        int mark4 = 67;
        int mark5 = 88;
        System.out.println();
        System.out.println("Name:" + name);
        System.out.println("Age" + age);
        System.out.println();
        System.out.println("Subject: " + mark1);
        System.out.println("Subject: " + mark2);
        System.out.println("Subject: " + mark3);
        System.out.println("Subject: " + mark4);
        System.out.println("Subject: " + mark5);
        System.out.println();
        System.out.println("Total Marks: " + (mark1 + mark2 + mark3 + mark4 + mark5));
        System.out.println("Average Marks: " + (mark1 + mark2 + mark3 + mark4 + mark5) / 5);
        if ( (mark1 + mark2 + mark3 + mark4 + mark5) / 5 >= 90 ) {
            System.out.println("Grade: A");
        } else if ( (mark1 + mark2 + mark3 + mark4 + mark5) / 5>= 80 ) {
            System.out.println("Grade: B");
        } else if ((mark1 + mark2 + mark3 + mark4 + mark5) / 5 >= 70 ) {
            System.out.println("Grade: C");
        } else if ( (mark1 + mark2 + mark3 + mark4 + mark5) / 5>= 60 ) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        System.out.println();
        System.out.println("Numbers 1 to 10:");
        for ( int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Even Numbers 1 to 20:");
        int j = 2;
        while ( j <= 20 ) {
            System.out.println(j);
            j += 2;
        }
        System.out.println();
        System.out.println("5 Multiplication Table:");
        int k = 1;
        do { 
            System.out.println("5 * " + k + " = " + ( 5 * k ));
            k++;
        } while ( k <= 10);
    }
}
