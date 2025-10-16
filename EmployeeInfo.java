import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept employee details
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Location: ");
        String location = scanner.nextLine();

        // Apply batch update using command-line arguments
        // Example usage: java EmployeeInfo HR Bangalore
        if (args.length >= 2) {
            department = args[0];
            location = args[1];
        }

        // Display updated employee details
        System.out.println("\n--- Employee Information ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Location: " + location);

        scanner.close();
    }
}