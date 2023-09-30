import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");

        Integer num1 = Integer.valueOf(scanner.nextLine());
        Integer num2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Select an operation (+, -, *, /):");
        String operation = scanner.nextLine();

        switch (operation) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
