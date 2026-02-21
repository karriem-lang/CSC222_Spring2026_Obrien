import java.text.DecimalFormat;

/*
 Base -> Parent -> Super Class
 */
public class Task {
    // Private (access specifiers) -> Encapsulation
    private String name;
    private double duration;
    private String priorityLevel;

    /*
     Constructor: The Handshake Protocol
     Constructs a new Task w/ specified Attributes
     @param name -> Task name
     @param duration -> Task duration
     @param priorityLevel -> Task priority
    */
    public Task(String name, double duration, String priorityLevel) {
        this.name = name;
        this.duration = duration;
        this.priorityLevel = priorityLevel.toLowerCase(); // bonus: normalize input
    }

    // accessor method -> Getter
    public double getDuration() {
        return duration;
    }

    /*
    Helper printInfo() built to be overridden [no FINAL]
    allowing subclasses liberty in print method implementation
    */
    public void printInfo() {
        // Format duration to 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        // Python like -> "print formatted" %s -> String %n -> newline
        System.out.printf("Task: %s%n", name);
        // alternate format from the java.text.DecimalFormat
        System.out.println("Duration: " + df.format(duration) + " hours");
        System.out.println("Priority Level: " + priorityLevel);
    }
}