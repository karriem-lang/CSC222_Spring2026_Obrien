

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

/*
Main -> entry point into program
*/
public class TaskOrganizer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Ask user for number of tasks
        System.out.print("How many tasks would you like to input? ");
        int numTasks = scanner.nextInt();
        scanner.nextLine(); // Consume newline char

        // Dynamic size
        ArrayList<Task> tasks = new ArrayList<>();

        // Running totals
        double totalSchoolHours = 0;
        double totalHomeHours = 0;

        // Loop for each task input
        for (int i = 0; i < numTasks; i++) {
            System.out.println("\nTask " + (i + 1) + ":");


            System.out.print("Enter the name of the task: ");
            String name = scanner.nextLine();

            System.out.print("Enter the duration of the task (in hours): ");
            double duration = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter the priority level (low, medium, high): ");
            String priority = scanner.nextLine();

            System.out.print("Is this a school task or a home task? ");
            String taskType = scanner.nextLine().toLowerCase();

            // Create task object based on type
            if (taskType.equals("school")) {
                // School-specific input
                System.out.print("Enter the number of meetings: ");
                int meetings = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter the deadline (e.g., '2025-10-12'): ");
                String deadline = scanner.nextLine();

                // Instantiate -> SchoolTask
                SchoolTask schoolTask = new SchoolTask(name, duration, priority, meetings, deadline);
                tasks.add(schoolTask);

                totalSchoolHours += duration; // add to running total

                // Display task details
                System.out.println("\n--- Task Details ---");
                schoolTask.printInfo();

            } else if (taskType.equals("home")) {
                // Home-specific input
                System.out.print("Enter the tools required for the task: ");
                String tools = scanner.nextLine();

                // Instantiate HomeTask
                HomeTask homeTask = new HomeTask(name, duration, priority, tools);
                tasks.add(homeTask);

                totalHomeHours += duration; // add to running total

                // Display task details
                System.out.println("\n--- Task Details ---");
                homeTask.printInfo();
            } else {
                System.out.println("Invalid task type entered. Skipping this task.");
            }
        }

        // Display summary
        System.out.println("\n========================================");
        System.out.println("           TASK SUMMARY");
        System.out.println("========================================");

        // Total combined hours
        double totalHours = totalSchoolHours + totalHomeHours;
        System.out.println("Total combined hours spent on tasks: " + df.format(totalHours));

        // Determine which task type had the highest total duration
        if (totalSchoolHours > totalHomeHours) {
            System.out.println("School tasks had the highest total duration: " + df.format(totalSchoolHours) + " hours");
        } else if (totalHomeHours > totalSchoolHours) {
            System.out.println("Home tasks had the highest total duration: " + df.format(totalHomeHours) + " hours");
        } else {
            System.out.println("School and Home tasks had equal total duration: " + df.format(totalHours/2) + " hours each");
        }

        scanner.close();
        System.out.println("\n✨ Program complete. Goodbye! ✨\n");

// Call for Champaign !
        try {
            Celebration.celebrate();
        } catch (InterruptedException e) {
            System.out.println("Animation interrupted.");
        }
    }
}

