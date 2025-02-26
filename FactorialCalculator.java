import java.util.Scanner;

public class FactorialCalculator {
    
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        while (true) {
            try {
                System.out.print("Enter a non-negative integer: ");
                number = Integer.parseInt(scanner.nextLine());
                
                if (number < 0) {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
        return number;
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long factorial = calculateFactorial(number);
        
        System.out.println("The factorial of " + number + " is: " + factorial);
        System.out.println("\nNotable Observations:");
        System.out.println("- This activity emphasizes the use of methods for input validation and complex calculations.\n"
                + "- Input validation is important to prevent unexpected errors and ensure program robustness.");
        
        System.out.println("\nJava Programming Best Practices:");
        System.out.println("- Use meaningful method names that clearly describe their purpose.");
        System.out.println("- Keep your methods concise and focused on a single task.");
        System.out.println("- Add comments to your code to explain the logic and purpose of each method.");
        System.out.println("- Validate user input to prevent unexpected errors.");
        System.out.println("- Handle edge cases, such as when the input is 0 (factorial of 0 is 1).");
    }
}
