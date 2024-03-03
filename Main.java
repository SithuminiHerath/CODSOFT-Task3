import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a bank account
        BankAccount userAccount = new BankAccount(0.0);

        // Create an ATM instance
        ATM atm = new ATM(userAccount);
        int choice;
        do {
            atm.display();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            atm.transaction(choice, scanner);
        }
        while (choice != 4);
    }
}

