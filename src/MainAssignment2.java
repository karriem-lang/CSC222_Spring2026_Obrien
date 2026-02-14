import java.util.Scanner;

public class MainAssignment2 {
    //Ansi color -> output
    //UGLY -> CLUNKY -> JAVONIC -> 3:30am tried everything in the Java Bible without success!
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
    //Exercises in copy and pasting haha!
    public static void exercise1() {
        System.out.println("\n📘 EXERCISE 1");
        System.out.println("Description: [Add description here]");
        System.out.println("Output:");
        // TODO: Add your exercise 1 code here
        System.out.println("Sample output for exercise 1");
    }
    public static void exercise2() {
        System.out.println("\n📘 EXERCISE 2");
        System.out.println("Description: [Add description here]");
        System.out.println("Output:");
        // TODO: Add your exercise 2 code here
        System.out.println("Sample output for exercise 2");
    }
    public static void exercise3() {
        System.out.println("\n📘 EXERCISE 3");
        System.out.println("Description: [Add description here]");
        System.out.println("Output:");
        // TODO: Add your exercise 3 code here
        System.out.println("Sample output for exercise 3");
    }
    public static void exercise4() {
        System.out.println("\n📘 EXERCISE 4");
        System.out.println("Description: [Add description here]");
        System.out.println("Output:");
        // TODO: Add your exercise 4 code here
        System.out.println("Sample output for exercise 4");
    }
    public static void exercise5() {
        System.out.println("\n📘 EXERCISE 5");
        System.out.println("Description: [Add description here]");
        System.out.println("Output:");
        // TODO: Add your exercise 5 code here
        System.out.println("Sample output for exercise 5");
    }
    public static void exercise6() {
        System.out.println("\n📘 EXERCISE 6");
        System.out.println("Description: [Add description here]");
        System.out.println("Output:");
        // TODO: Add your exercise 6 code here
        System.out.println("Sample output for exercise 6");
    }
    public static void exercise7() {
        System.out.println("\n📘 EXERCISE 7");
        System.out.println("Description: [Add description here]");
        System.out.println("Output:");
        // TODO: Add your exercise 7 code here
        System.out.println("Sample output for exercise 7");
    }
    public static void exercise8() {
        System.out.println("\n📘 EXERCISE 8");
        System.out.println("Description: [Add description here]");
        System.out.println("Output:");
        // TODO: Add your exercise 8 code here
        System.out.println("Sample output for exercise 8");
    }
    public static void exercise9() {
        System.out.println("\n📘 EXERCISE 9");
        System.out.println("Description: [Add description here]");
        System.out.println("Output:");
        // TODO: Add your exercise 9 code here
        System.out.println("Sample output for exercise 9");
    }
    public static void exercise10() {
        System.out.println("\n📘 EXERCISE 10");
        System.out.println("Description: [Add description here]");
        System.out.println("Output:");
        // TODO: Add your exercise 10 code here
        System.out.println("Sample output for exercise 10");
    }
}
