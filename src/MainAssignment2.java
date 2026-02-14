import java.util.Scanner;

public class MainAssignment2 {
    //Ansi color -> output
    public static final String RESET = "\u001b[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String RED = "\u001B[31m";
    public static final String PURPLE = "\u001B[35m";

    //color test banner...commit/push
    static void main(String[] args) {
        System.out.println(PURPLE + "=".repeat(61) + RESET);
        System.out.println(PURPLE + "WELCOME TO CSC222!! ASSIGNMENT #2 - Prof: D.O'brien 14Feb2026" + RESET);
        System.out.println(PURPLE + "=".repeat(61) + RESET);
    }

    /*static void main(String[] args) {
        Random num = new Random();
        int time = num.nextInt(6) + 13;
        System.out.println("Random time between 13 and 18 inclusive: " + time ); //random num check

        if (time <= 11) {
            System.out.println("Good Morning!");
        } else {
            System.out.println("Good Afternoon!");
        }//end if else
    }//end main*/
}
