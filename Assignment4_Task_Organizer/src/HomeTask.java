/**
 OOP in action!
 The Inheritance pillar of OPP allows us to extend an existing class (Task)
 This new class HomeTask inherits the members of the class it extends -> Task
 in addition to its own unique attributes -> toolsRequired
 */
public class HomeTask extends Task {

    private String toolsRequired; // broom, vacuum cleaner

    /*
    Constructor calls the base class constructor first!
    Java -> constructs the parent (Task) first and then the child(HomeTask)
    thus, first statement MUST be super(x,y...z) -> initialization,
    or you will get a compile error! got the t-shirt...lol
    */
    public HomeTask(String name, double duration, String priorityLevel, String toolsRequired) {
        super(name, duration, priorityLevel);
        this.toolsRequired = toolsRequired;
    }

    /*
    The Magic Sauce!
    Override printInfo to include home-specific details
    permissible do to the omission of 'private/final' in -> public void printInfo()
    super() runs base version first then adds HomeTask specific extension -> toolsRequired
    */
    @Override
    public void printInfo() {
        super.printInfo(); // Parent class -> Task
        System.out.println("Tools Required: " + toolsRequired);
    }
}