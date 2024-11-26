package vivi.ueben;
import java.util.Scanner;

/**
 *
 * @author iris06
 */
public class Main
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int rectangleCount = 0;

        while (true) 
        {
            printMenu();
            System.out.print("> ");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) 
            {
                case "new rectangle" -> 
                {
                    System.out.println("Rectangle #" + (++rectangleCount) + ":");
                    Rectangle rectangle = new Rectangle(inputPoint(scanner, "First point"), inputPoint(scanner, "Second point"));
                    System.out.printf("Width: %d\nHeight: %d\nArea: %d\n", rectangle.getWidth(), rectangle.getHeight(), rectangle.getArea());
                    rectangle.draw();
                }
                //case "new circle" ->
                case "quit" -> {
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid command. Please try again.");   
            }
        }
    }

    private static void printMenu() {
        String menu = """
        --------------------------------------------------------------------------------
        Available commands:
        "New rectangle" - create new rectangle
        "New circle" - create new circle
        "Quit" - quit program
        --------------------------------------------------------------------------------
        """;
        System.out.println(menu);
    }

    private static Point inputPoint(Scanner scanner, String prompt) {
        System.out.println("  " + prompt + ":");
        int x = inputInt(scanner, "x coordinate");
        int y = inputInt(scanner, "y coordinate");
        return new Point(x, y);
    }

    private static int inputInt(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print("  " + prompt + ": ");
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("  Invalid input. Please enter an integer.");
            }
        }
    }

    private static int inputPositiveInt(Scanner scanner, String prompt) {
        while (true) {
            int value = inputInt(scanner, prompt);
            if (value >= 0) return value;
            System.out.println("  Invalid input. Please enter a non-negative integer.");
        }
    }
}

