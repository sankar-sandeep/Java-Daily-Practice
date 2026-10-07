public class variables2 {
    public static void main(String[] args) {
        String name = "Sankaar Sandeep";
        int age = 19;
        int marks = 78;
        int attendance = 80;
        System.out.println("Name: " + name);
        if ( age >= 18 && marks >= 40 ) {
            System.out.println("Marks: " + marks);
            System.out.println("Attendance: " + attendance);
            System.out.println("Eligibility: " + "Yes");
        } else {
            System.out.println("Eligibility: " + "No");
        }
        if ( marks >= 90 ) {
            System.out.println("Grade: A");
        } else if ( marks >= 80 ) {
            System.out.println("Grade: B");
        } else if ( marks >= 75 ) {
            System.out.println("Grade: C");
        } else if ( marks >= 60 ) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }
        System.out.println();
        System.out.println("Numbers:");
        for ( int i = 1; i <= 20; i++ ) {
            if ( i == 5 ) {
                continue;
            } if ( i == 10 ) {
                continue;
            } if ( i == 15 ) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
