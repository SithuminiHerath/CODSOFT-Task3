import java.util.Scanner;
class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void display() {
        System.out.println("\n MAIN MENU :");
        System.out.println("\t 1 - withdraw");
        System.out.println("\t 2 - Deposit");
        System.out.println("\t 3 - Check_Balance");
        System.out.println("\t 4 - Exit");
    }

    public void transaction(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount > 0) {
                    if (userAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful. Remaining balance: " + userAccount.getBalance());
                    }
                } else {
                    System.out.println("Invalid withdrawal amount.");
                }
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                if (depositAmount > 0) {
                    userAccount.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: " + userAccount.getBalance());
                } else {
                    System.out.println("Invalid deposit amount.");
                }
                break;

            case 3:
                System.out.println("Current balance: " + userAccount.getBalance());
                break;

            case 4:
                System.out.println("Thank you!");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid option.Try again");
        }
    }
}
