public class nested {
    public static void main(String[] args) {
        String name = "Sankar Sandeep";
        int age = 19;
        int javaMark = 78;
        int MathsMark = 85;
        int DAAMark = 72;
        int AiMark = 90;
        int TOCMark = 65;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
        System.out.println("Total Marks: " + (javaMark + MathsMark + DAAMark + AiMark + TOCMark));
        System.out.println("Average Marks:" + ((javaMark + MathsMark + DAAMark + AiMark + TOCMark) / 5));
        if ( ((javaMark + MathsMark + DAAMark + AiMark + TOCMark) / 5) >= 90 ) {
            System.out.println("Grade: A");
        } else if ( ((javaMark + MathsMark + DAAMark + AiMark + TOCMark) / 5) >= 70 ) {
            System.out.println("Grade: B");
        } else if ( ((javaMark + MathsMark + DAAMark + AiMark + TOCMark) / 5) >= 65 ) {
            System.out.println("Grade: C");
        } else if ( ((javaMark + MathsMark + DAAMark + AiMark + TOCMark) / 5) >= 60 ) {
            System.out.println("Grade: D" );
        } else {
            System.out.println("Fail");
        }
        if ( age >= 18 ) {
            System.out.println("Eligibility: Eligible" );
        } else {
            System.out.println("Eligibility: Not Eligible");
        }
        System.out.println();
        System.out.println("Odd Numbers from 1 to 20:");
        for ( int i =1 ; i <= 19; i += 2 ) {
            if ( i == 2 ) {
                continue;
            } if ( i == 6 ) {
                continue;
            } if ( i == 8 ) {
                continue;
            } if ( i == 10 ) {
                continue;
            } if ( i == 12 ) {
                continue;
            } if ( i == 14 ){
                continue;
            } if ( i == 17 ) {
                break;
            }
             System.out.println(i);
        }
        System.out.println();
        System.out.println("Sum of numbers from 1 to 10: ");
        int i = 1;
        int sum = 0;
        while ( i <= 10 ) {
            sum += i;
            i++;
        }
        System.out.println(sum);
        System.out.println();
        System.out.println("Countdown: ");
        int j = 10;
        do { 
            System.out.println(j);
            j--;
        } while ( j >= 1);
    }
}
