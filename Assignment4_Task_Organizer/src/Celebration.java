// Little Bling-Bling
public class Celebration {

    // Static method so you can call it without creating an object
    public static void celebrate() throws InterruptedException {
        String message = "✨CSC222✨ and Java Rocks!!!✨✨✨";
        String[] colors = {
                "\u001B[31m", // Red
                "\u001B[32m", // Green
                "\u001B[33m", // Yellow
                "\u001B[34m", // Blue
                "\u001B[35m", // Magenta
                "\u001B[36m"  // Cyan
        };
        String reset = "\u001B[0m";

        for (int i = 0; i < 3; i++) { // 10 cycles
            for (String color : colors) {
                System.out.print("\r" + color + message + reset);
                Thread.sleep(200); // 200ms delay
            }
        }
        System.out.println("\n"); // Move to new line
    }
}

