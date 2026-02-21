/**
 OOP in action!
 The Inheritance pillar of OPP allows us to extend an existing class (Task)
 This new class HomeTask inherits the members of the class it extends -> Task
 in addition to its own unique attributes -> meetingCount and deadLine
 */

public class SchoolTask extends Task {

    private int meetingCount; // SchoolTask -> number of meetings
    private String deadline;  // SchoolTask -> deadline

    // Constructor calls the base class constructor -> see Constructor comment in {HomeTask}
    public SchoolTask(String name, double duration, String priorityLevel, int meetingCount, String deadline) {
        super(name, duration, priorityLevel); 
        this.meetingCount = meetingCount;
        this.deadline = deadline;
    }

    // Override printInfo to include school-specific details
    @Override
    public void printInfo() {
        super.printInfo(); // print base task info
        System.out.println("Number of Meetings: " + meetingCount);
        System.out.println("Deadline: " + deadline);
    }
}