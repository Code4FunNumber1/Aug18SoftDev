import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Data Collection
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your GPA: ");
        double gpa = input.nextDouble();
        System.out.println("Enter your number of credits completed: ");
        int credits = input.nextInt();
        System.out.println("Enter true if you are a resident of Indiana. If not enter false: ");
        boolean resident = input.nextBoolean();
        System.out.println("Enter true if you have financial aid. If not enter false: ");
        boolean financialAid = input.nextBoolean();

//        === STUDENT REPORT ===
        System.out.println("=== STUDENT REPORT ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Credits: " + credits);
        if (resident) {
            System.out.println("Resident of Indiana: Yes");
        } else {
            System.out.println("Resident: No");
        }
        if (financialAid) {
            System.out.println("Financial Aid: Yes");
        } else {
            System.out.println("Financial Aid: No");
        }

        System.out.println();

        int standing = 0;
        if (gpa >= 3.5) {
            standing = 4;
        } else if (gpa >= 2.0) {
            standing = 3;
        } else if (gpa >= 1.5) {
            standing = 2;
        } else {
            standing = 1;
        }

        if (standing == 4) {
            System.out.println("Academic Standing: Dean's List");
        } else if (standing == 3) {
            System.out.println("Academic Standing: Good");
        } else if (standing == 2) {
            System.out.println("Academic Standing: Academic Warning");
        } else {
            System.out.println("Academic Standing: Academic Probation");
        }

        int classlevel = 0;

        if (credits <= 29) {
             classlevel = 9;
        } else if (credits <= 59) {
            classlevel = 10;
        }else if (credits <= 59) {
            classlevel = 11;
        }else {
            classlevel = 12;
        }

        // Turn leve into print like we did with standing.

    }


}
