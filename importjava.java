import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Sum");
            System.out.println("2. Difference");
            System.out.println("3. Product");
            System.out.println("4. Division");
            System.out.println("5. Increment");
            System.out.println("6. Decrement");
            System.out.println("7. Exit");
            int choice = sc.nextInt();

            if (choice == 7) {
                System.out.println("Exiting the program.");
                break;
            }
            
            System.out.println("Enter the number of inputs (1 to 5):");
            n = sc.nextInt();

            if (n < 1 || n > 5) {
                System.out.println("Please enter a valid input: 1 to 5");
                continue;
            }

            double[] numbers = new double[n];
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextDouble();
            }

            double result = numbers[0];

            switch (choice) {
                case 1: 
                    for (int i = 1; i < n; i++) {
                        result += numbers[i];
                    }
                    System.out.println("Sum: " + result);
                    break;
                
                case 2: 
                    for (int i = 1; i < n; i++) {
                        result -= numbers[i];
                    }
                    System.out.println("Difference: " + result);
                    break;
                
                case 3:
                    result = 1;
                    for (double num : numbers) {
                        result *= num;
                    }
                    System.out.println("Product: " + result);
                    break;
                
                case 4:
                    for (int i = 1; i < n; i++) {
                        if (numbers[i] == 0) {
                            System.out.println("Cannot divide by zero!");
                            result = Double.NaN;
                            break;
                        }
                        result /= numbers[i];
                    }
                    if (!Double.isNaN(result)) {
                        System.out.println("Division Result: " + result);
                    }
                    break;
                
                case 5:
                    for (int i = 0; i < n; i++) {
                        numbers[i]++;
                    }
                    System.out.println("Incremented values:");
                    for (double num : numbers) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                
                case 6:
                    for (int i = 0; i < n; i++) {
                        numbers[i]--;
                    }
                    System.out.println("Decremented values:");
                    for (double num : numbers) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}