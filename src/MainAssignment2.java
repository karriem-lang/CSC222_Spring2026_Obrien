/**
 * CSC222 Assignment #2 - Interactive Exercise Menu
 * Prof. D. O'Brien
 * 14Feb2026 Time - 19:40
 *
 * This program presents an interactive menu system for 10 Java exercises,
 * demonstrating control flow, loops, arrays, and modern Java features.
 *
 * @author [Karriem Lang]
 * @version 1.0
 */

import java.util.Scanner;
import java.util.Random;

public class MainAssignment2 {
    //Ansi color -> output
    //UGLY -> CLUNKY -> Javanic -> 3:30am tried everything in the Java Bible without success!
    // an 'enum' and MILLION 'Color' prefixes for a little color!! PaPa can have this language!
    public enum Color {
        RESET("\u001B[0m"),
        GREEN("\u001B[32m"),
        YELLOW("\u001B[33m"),
        BLUE("\u001B[34m"),
        RED("\u001B[31m"),
        PURPLE("\u001B[35m");

        private final String code;

        Color(String code) {
            this.code = code;
        }

        /* I doubt @Override is most Java-nic but works for me...even though IDE is complaining...
        "Java Enums: When Constants Need Behavior" by Ahmet Emre Demirsen
        Medium: Feb 2, 2026
        https://medium.com/but-it-works-on-my-machine/java-enums-when-constants-need-behavior-124ef6c414db
         */
        @Override
        public String toString() {
            return code;
        }
    }

    //color test banner...commit/push
    static void main(String[] args) {
        System.out.println(Color.PURPLE + "=".repeat(61) + Color.RESET);
        System.out.println(Color.PURPLE + "WELCOME TO CSC222!! ASSIGNMENT #2 - Prof: D.O'brien 14Feb2026" + Color.RESET);
        System.out.println(Color.PURPLE + "=".repeat(61) + Color.RESET);

        //Repeat to self - this is not Python... compiled not interpreted!
        //Menu object before class is ok - just breath-deeply!
        Menu menu = new Menu();
        menu.start();
        System.out.println(Color.GREEN + "\nThank you for using the program. Goodbye!" + Color.RESET);
    }

    static class Menu {
        private Scanner scanner;
        private boolean[] completed;

        public Menu() {
            scanner = new Scanner(System.in);
            completed = new boolean[11]; //Exercises 1-10...
        }
        public void start() {
            int choice; //TODO try/except

            do {
                displayMenu();
                System.out.println("Enter your choice (1-12)");
                choice = scanner.nextInt();
                processChoice(choice);

            } while (choice != 12);
        }
        private void displayMenu() {
            System.out.println("\n" + Color.BLUE + "=".repeat(50) + Color.RESET);
            System.out.println(Color.BLUE + "          CSC222 ASSIGNMENT 2 MENU" + Color.RESET);
            System.out.println(Color.BLUE + "=".repeat(50) + Color.RESET);

            for (int i = 1; i <= 10; i++) {
                System.out.println(i + ". Exercise " + i);

                if (completed[i]) {
                    System.out.println(Color.GREEN + " ✅" + Color.RESET);
                }
                System.out.println();
            }
            System.out.println("11. Run ALL Exercises");
            System.out.println(Color.YELLOW + "12. Exit" + Color.RESET);
            System.out.println(Color.BLUE + "=".repeat(50) + Color.RESET);
        }

        private void processChoice(int choice) {
            // Modified usage of switch/yield expression to get a message
            String resultMessage = switch(choice) {
                case 1 -> {
                    exercise1();
                    completed[1] = true;
                    yield Color.GREEN + "✓ Exercise 1 completed" + Color.RESET;
                }
                case 2 -> {
                    exercise2();
                    completed[2] = true;
                    yield Color.GREEN + "✓ Exercise 2 completed" + Color.RESET;
                }
                case 3 -> {
                    exercise3();
                    completed[3] = true;
                    yield Color.GREEN + "✓ Exercise 3 completed" + Color.RESET;
                }
                case 4 -> {
                    exercise4();
                    completed[4] = true;
                    yield Color.GREEN + "✓ Exercise 4 completed" + Color.RESET;
                }
                case 5 -> {
                    exercise5();
                    completed[5] = true;
                    yield Color.GREEN + "✓ Exercise 5 completed" + Color.RESET;
                }
                case 6 -> {
                    exercise6();
                    completed[6] = true;
                    yield Color.GREEN + "✓ Exercise 6 completed" + Color.RESET;
                }
                case 7 -> {
                    exercise7();
                    completed[7] = true;
                    yield Color.GREEN + "✓ Exercise 7 completed" + Color.RESET;
                }
                case 8 -> {
                    exercise8();
                    completed[8] = true;
                    yield Color.GREEN + "✓ Exercise 8 completed" + Color.RESET;
                }
                case 9 -> {
                    exercise9();
                    completed[9] = true;
                    yield Color.GREEN + "✓ Exercise 9 completed" + Color.RESET;
                }
                case 10 -> {
                    exercise10();
                    completed[10] = true;
                    yield Color.GREEN + "✓ Exercise 10 completed" + Color.RESET;
                }
                case 11 -> {
                    runAllExercises();
                    for (int i = 1; i <= 10; i++) completed[i] = true;
                    yield Color.PURPLE + "🔥 ALL EXERCISES COMPLETED! 🔥" + Color.RESET;
                }
                case 12 -> {
                    yield Color.YELLOW + "Exiting program..." + Color.RESET;
                }
                default -> {
                    yield Color.RED + "Invalid choice. Try again." + Color.RESET;
                }
            };

            // Now we use the result message
            System.out.println("\n" + Color.YELLOW + "▶".repeat(40) + Color.RESET);
            System.out.println(resultMessage);
            System.out.println(Color.YELLOW + "◀".repeat(40) + Color.RESET);

            if (choice != 12 && choice >= 1 && choice <= 11) {
                System.out.print(Color.GREEN + "\nPress Enter to continue..." + Color.RESET);
                scanner.nextLine(); // consume newline
                scanner.nextLine(); // wait for Enter
            }
        }
        /*
         IntelliJ Advice: Simple Rule
         Few concatenations (2-3) is good
         Many concatenations (StringBuilder with chained append()
         */
        private String runAllExercises() {
            StringBuilder results = new StringBuilder();
            results.append("\n");

            exercise1();
            results.append(Color.GREEN)
                    .append("✓ Exercise 1 complete\n")
                    .append(Color.RESET);

            exercise2();
            results.append(Color.GREEN)
                    .append("✓ Exercise 2 complete\n")
                    .append(Color.RESET);

            exercise3();
            results.append(Color.GREEN)
                    .append("✓ Exercise 3 complete\n")
                    .append(Color.RESET);

            exercise4();
            results.append(Color.GREEN)
                    .append("✓ Exercise 4 complete\n")
                    .append(Color.RESET);

            exercise5();
            results.append(Color.GREEN)
                    .append("✓ Exercise 5 complete\n")
                    .append(Color.RESET);

            exercise6();
            results.append(Color.GREEN)
                    .append("✓ Exercise 6 complete\n")
                    .append(Color.RESET);

            exercise7();
            results.append(Color.GREEN)
                    .append("✓ Exercise 7 complete\n")
                    .append(Color.RESET);

            exercise8();
            results.append(Color.GREEN)
                    .append("✓ Exercise 8 complete\n")
                    .append(Color.RESET);

            exercise9();
            results.append(Color.GREEN)
                    .append("✓ Exercise 9 complete\n")
                    .append(Color.RESET);

            exercise10();
            results.append(Color.GREEN)
                    .append("✓ Exercise 10 complete\n")
                    .append(Color.RESET);

            return results.toString();
        }
    }
    //Exercise 1-6 ✅
    public static void exercise1() {
        System.out.println("\n📘 EXERCISE 1");
        System.out.println("Description: [Using if-else Statements in Java]");

        Random num = new Random();
        int time = num.nextInt(6) + 13;
        System.out.println("The random int between 13 and 18 inclusive is: " + time);
        System.out.println("Output:");

        if (time <= 11) {
            System.out.println("Good Morning!");
        } else {
            System.out.println("Good Afternoon!");
        }
    }
    public static void exercise2() {
        System.out.println("\n📘 EXERCISE 2");
        System.out.println("Description: [Enhancing if-else with else-if in Java]");

        Random num = new Random();
        int time = num.nextInt(23) + 0;
        System.out.println("The random int between 0 and 23 inclusive is: " + time);
        System.out.println("Output:");

        if (time <= 11) {
            System.out.println("Good Morning!");
        } else if (time <= 17){
            System.out.println("Good Afternoon!");
        } else {
            System.out.println("Good Evening");
        }
    }
    public static void exercise3() {
        System.out.println("\n\uD83D\uDCC6 EXERCISE 3 \uD83D\uDCC6");
        System.out.println("Description: [Using JDK 25 arrow switch/yield construct]");
        System.out.println("Sample output for exercise 3");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        //TODO how about an array of days???

        System.out.println("Enter day number (1-7) for Mon-Sun");
        int dayNumber = scanner.nextInt();
        String dayName = switch (dayNumber) {
            case  1 -> "Monday";
            case  2 -> "Tuesday";
            case  3 -> "Wednesday";
            case  4 -> "Thursday";
            case  5 -> "Friday";
            case  6 -> "Saturday";
            case  7 -> "Sunday";
            default -> {
                System.out.println("Invalid day number.");
                yield "Unknown";
            }
        };
        if (!dayName.equals("Unknown")) {
            System.out.println("Day " + dayNumber + " is " + dayName);
        }
    }
    public static void exercise4() {
        System.out.println("\n📘 EXERCISE 4");
        System.out.println("Description: [Legacy switch -> case -> break -> default construct]");
        System.out.println("Sample output for exercise 4");
        int day = 2;

        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the weekend! 🚤");
        }
    }
    public static void exercise5() {
        System.out.println("\n🎢 EXERCISE 5🎢 ");
        System.out.println("Description: [Using a while loop to Output Numbers in Java]");
        System.out.println("Sample output for exercise 5");

        int i = 0;
        while (i < 6) {
            System.out.println(i);
            i++;
        }
    }
    public static void exercise6() {
        System.out.println("\n📘 EXERCISE 6");
        System.out.println("Description: [Use a for Loop to Print Even Numbers in Java]");
        System.out.println("Sample output for exercise 6");

        int i = 2;
        for (i = 2; i <= 10; i += 2) {
            System.out.println(i + " is even Steven!");
        }

    }
    public static void exercise7() {
        System.out.println("\n📘 EXERCISE 7");
        System.out.println("Description: [Using break to exit a for loop in Java]");
        System.out.println("Sample output for exercise 7");

        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("control variable i: = " + i);
            if (i == 4) { //When condition is met -> control variable (i == 4) loop graciously ends.
                System.out.println("Good bye, i am now 4 - get it!!!");
                break;
            }
        }
    }
    public static void exercise8() {
        System.out.println("\n📘 EXERCISE 8");
        System.out.println("Description: [Using continue to skip iterations in Java]");
        System.out.println("Sample output for exercise 8");

        int i = 0;
        for (i = 0; i < 10; i++) {
            if ( i == 4) {
                System.out.println("When i see 'continue' i jump over " + i + " ! and keep on trucking!");
                continue;
            }
            System.out.println(i);
        }

    }
    public static void exercise9() {
        System.out.println("\n📘 EXERCISE 9");
        System.out.println("Description: [Looping Through an array in Java]");
        System.out.println("Sample output for exercise 9");

        int i = 0;

        String [] cars = {"Volvo", "BMW", "Honda", "Toyota"};
        for (i = 0; i < cars.length; i++) {
            IO.println(cars[i]); //Tired of IntelliJ crying... -> JDK 25
        }
    }
    public static void exercise10() {
        System.out.println("\n📘 EXERCISE 10");
        System.out.println("Description: [Nested Loops in Java]");
        System.out.println("Sample output for exercise 10");
        IO.println();

        //Much cleaner and Javanic Spec with -> 2 For Loops...
        int i = 1;
        for (i = 1; i <= 3; i++) {
            IO.println("Iteration " + i + " of the for loop...");

            int j = 1; //Must be placed inside For Loop in order to RESET...(Python)
            while (j <= 5) {
                IO.println("Inside the while loop: " + j);
                j++;
            }
            IO.println();
        }
        /* =====================================================
   FUTURE IMPROVEMENTS (Version 2.0)
   =====================================================

   [ ] Input validation - handle non-integer inputs gracefully
   [ ] Add try-catch blocks for Scanner exceptions
   [ ] Save completed exercises to file (progress persistence)
   [ ] Add timer to track how long each exercise takes
   [ ] Create Exercise interface for cleaner exercise management
   [ ] Add option to repeat last exercise
   [ ] Implement difficulty levels (Easy/Medium/Hard)
   [ ] Add score tracking and summary report
   [ ] Create unit tests for each exercise
   [ ] Add configuration file for customizing colors/messages

   ===================================================== */
    }
}
