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

public class Student {

    // PRIVATE! Outside Access Denied! -> A.K.A -> Encapsulation
    private String firstName;
    private String lastName;
    private double gpa;

    // CONSTRUCTOR -> @param firstName @param lastName @param gpa
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
        // I Think this MAIN would be better in a separate file !?!?

    }

