/*
Understanding UML

Student -> Class name

PRIVATE variables -> '-' means private
- firstName: String
- lastName: String
- gpa: double ->

CONSTRUCTOR (creates objects)  -> '+' means public
+ Student(firstName: String, lastName: String, gpa: double)

GETTER Methods (access data)
+ getFirstName(): String
+ getLastName(): String
+ getGPA(): double

SETTER Methods (modify data)
+ setGPA(gpa: double):

SPECIAL method (string rep)
+ toString(): String
*/
//============================================================//
/*
Requirements:
START:
    Ask: Number of students
    Loop:
        for each student
            first name
            last name
            gpa -> if gpa < 0 -> assign value 0
            create object
            sore object in array
    Exit Loop:
        Calculate avg gpa -> format to two places
DONE
*/

import java.util.Scanner;

public class Student {

    // PRIVATE! Outside Access Denied! -> A.K.A -> Encapsulation
    private String firstName;
    private String lastName;
    private double gpa;

    // CONSTRUCTOR -> @param firstName @param lastName @param gpa
    // CONSTRUCTOR'S 3 Jobs: RECEIVE parameters, INITIALIZE objects with those values (unless default)
    // VALIDATE via methods (if needed)...(GPA) returning NEW object -> caller
    // Basically transforming blueprint(class) into live instance(object) -ready to rock -n- roll!
    public Student(String firstName, String lastName, double gpa) {
        // this -> THIS object's var
        this.firstName = firstName;
        this.lastName = lastName;

        // setter validation
        setGPA(gpa);
    }

    // GETTER METHODS -> return private values
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getGPA() {
        return this.gpa;
    }

    // SETTER METHOD
    public void setGPA(double gpa) {
        if (gpa < 0 || gpa > 4.0) {
            this.gpa = 0.0; // validation requirement for out of bound numbers...
        } else {
            this.gpa = gpa;
        }
    }

    public String toString() {
            String formattedGPA = String.format("%.2f", this.gpa);
            return this.firstName + " " + this.lastName + " (GPA: " + formattedGPA + ")";
        }

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numStudents;
        Student[] studentArray;
        double totalGPA = 0.0; // local variables are NOT automatically initialized!
        double averageGPA;

        // Just a little snazzy! -> Welcome Message
        System.out.println("=========================================");
        System.out.println("         **STUDENT GPA TRACKER**         ");
        System.out.println("=========================================");

        // How many Students -> Prompt
        System.out.print("\nHow many students do you want to track? ");
        numStudents = scanner.nextInt();
        scanner.nextLine(); // !MUST CONSUME newline char!!! (BigTroubleLittleChina!)

        studentArray = new Student[numStudents];

        System.out.println("\n\uD83D\uDCDD Enter information for " + numStudents + " students:");

        // Collection Loop -> Student Object Creation -> Fill Array
        // Unfortunately Enhanced loop's are for Collections only...
        for (int i = 0; i < numStudents; i++) {

            System.out.println("\n--- Student " + (i + 1) + " ---");

            System.out.println("First name: ");
            String firstName = scanner.nextLine();

            System.out.println("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("GPA (0.0-4.0): ");
            double gpa = scanner.nextDouble();
            scanner.nextLine(); // Consume \n

            // Two for One! CONSTRUCTOR creates Object and Validates gpa
            Student newStudent = new Student(firstName, lastName, gpa);
            studentArray[i] = newStudent;
            // Visual Check
            System.out.println(" ✓ Added: " + newStudent.toString());
        }
        // Output Students
        System.out.println("\n========================================");
        System.out.println("          ***  STUDENT'S  ***             ");
        System.out.println("==========================================");

        for (Student student : studentArray) { // Enhanced Opportunity Knock's!
            System.out.println(student);
            totalGPA += student.getGPA(); // Running total for AVG
        }
        // We have not covered exceptions... Bonus -> zero division catch...
        if (numStudents > 0) {
            averageGPA = totalGPA / numStudents;
        } else {
            averageGPA = 0.0;
        }

        // Prettify Format
        String formattedAverage = String.format("%.2f", averageGPA);

        System.out.println("\n========================================");
        System.out.println("           SUMMARY");
        System.out.println("========================================");
        System.out.println("Total students: " + numStudents);
        System.out.println("Total GPA sum: " + String.format("%.2f", totalGPA));
        System.out.println("📊 AVERAGE GPA: " + formattedAverage);
        System.out.println("========================================");

        // Ready to test... and put the kids to sleep!
        scanner.close();
        System.out.println("\n✨ Program complete. Goodbye! ✨");

        }
    }

