public class practice {
    public static void main(String[] args) {
        String name = "Sandeep";
        int age = 19;
        int mark1 = 85;
        int mark2 = 78;
        int mark3 = 92;
        int mark4 = 67;
        int mark5 = 88;
        int average = 82;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
        System.out.println("Marks:");
        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);
        System.out.println("Subject 4: " + mark4);
        System.out.println("Subject 5: " + mark5);
        System.out.println();
        System.out.println("Total Marks: " + (mark1 + mark2 + mark3 + mark4 + mark5));
        System.out.println("Average: " + (mark1 + mark2 + mark3 + mark4 + mark5) / 5);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }
        System.out.println();
        System.out.println("Numbers 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Even Numbers 2 to 20:");
        int i = 2;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
            System.out.println();
            System.out.println("5 Multiplication Table:");
            int j = 1;
            do {
                System.out.println("5 * " + j + " = " + (5 * j));
                j++;
            } while (j <= 10);
        }
}