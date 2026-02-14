import java.util.Random;

public class MainAssignment2 {
    static void main(String[] args) {
        Random num = new Random();
        int time = num.nextInt(6) + 13;
        System.out.println("Random time between 13 and 18 inclusive: " + time ); //random num check

        if (time <= 11) {
            System.out.println("Good Morning!");
        } else {
            System.out.println("Good Afternoon!");
        }//end if else
    }//end main
}
