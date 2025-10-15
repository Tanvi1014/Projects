import java.util.Scanner;

public class expensecal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        double[] amounts = new double[100];
        int count = 0;
        int choice;
        double total = 0;

        System.out.println("===== SIMPLE EXPENSE TRACKER =====");

        do {
            System.out.println("\n1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total Expense");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // clear input buffer

            if (choice == 1) {
                System.out.print("Enter expense name: ");
                names[count] = sc.nextLine();
                System.out.print("Enter amount: ");
                amounts[count] = sc.nextDouble();
                sc.nextLine();
                total = total + amounts[count];
                count++;
                System.out.println("Expense added successfully!");
            } 
            else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No expenses added yet!");
                } else {
                    System.out.println("\n--- Expense List ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + names[i] + " - ₹" + amounts[i]);
                    }
                }
            } 
            else if (choice == 3) {
                System.out.println("Total Expense = ₹" + total);
            } 
            else if (choice == 4) {
                System.out.println("Exiting... Goodbye!");
            } 
            else {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

