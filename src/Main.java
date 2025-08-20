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
            System.out.println("Resident of Indiana: No");
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
            classlevel = 1;
        } else if (credits <= 59) {
            classlevel = 2;
        } else if (credits <= 89) {
            classlevel = 3;
        } else {
            classlevel = 4;
        }

        if (classlevel == 1) {
            System.out.println("Student Class Level: Freshman");
        } else if (classlevel == 2) {
            System.out.println("Student Class Level: Sophomore");
        } else if (classlevel == 3) {
            System.out.println("Student Class Level: Junior");
        } else {
            System.out.println("Student Class Level: Seniors");
        }

//        ELIGIBLE
        System.out.println();
        System.out.println("=== ELIGIBILITY STATUS ===");
        if (standing == 4 && classlevel >= 3) {
            System.out.println("Honor Society: Eligible");
        } else {
            System.out.println("Honor Society: Not Eligible");
        }

        if (credits >= 120 && gpa >= 2.0) {
            System.out.println("Graduation: Eligible");
        } else {
            System.out.println("Graduation: Not Eligible");
        }

        if (gpa >= 3.0 && resident && !financialAid) {
            System.out.println("Scholarship: Eligible");
        } else {
            System.out.println("Scholarship: Not Eligible");
        }
    }
}
