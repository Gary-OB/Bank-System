import java.util.Scanner;

/**
 * Created by Gary on 21/08/2017.
 * This class is a runner class for the
 * BankSystem application. It contains
 * prompts in a console log which run the
 * app and let you do all the features
 * associated with all the classes.
 */
public class BankSystemTest {
    public static void main(String args[]){

        AccountHolder accountHolder = setupAccountHolder();
        displayText(accountHolder);
    }

    public static AccountHolder setupAccountHolder(){
        AccountHolder newAccountHolder = new AccountHolder(1001, "Gonzales", "Sarah");

        newAccountHolder.addCurrentAccount(2001, "My Current Account");
        newAccountHolder.addCurrentAccount(2002, "My Second Current Account");
        newAccountHolder.addSavingsAccount(3001, "My Savings Account");
        newAccountHolder.addLoan(4001, 2500.0f);
        newAccountHolder.addLoan(4002, 30.0f);
        newAccountHolder.addLoan(4003, 500.0f);

        return newAccountHolder;
    }

    public static String listDetails(AccountHolder accountHolder){
        return  "\n---Account Details---" +
                "\nAccount ID: " + accountHolder.getAccountHolderId() +
                "\nSurname: " + accountHolder.getSurname() +
                "\nForename: " + accountHolder.getForename() +
                "\n\n---Current Accounts---" +
                "\n" + AccountHolder.listContents(accountHolder.getCurrentAccounts()) +
                "\n\n---Savings Accounts---" +
                "\n" + AccountHolder.listContents(accountHolder.getSavingsAccounts()) +
                "\n\n---Loans---" +
                "\n" + AccountHolder.listContents(accountHolder.getLoans());
    }

    public static void displayText(AccountHolder accountHolder){
        boolean running = true;
        String systemChoice;
        int inputInt = 0;
        float inputFloat;
        String inputString;

        Scanner input = new Scanner(System.in);

        while(running) {
            System.out.println(listDetails(accountHolder));

            System.out.print("What does your request have to deal with? (Current Accounts - 'C'" +
                    ", Savings Accounts - 'S' or Loans - 'L' ): ");
            systemChoice = input.nextLine();

            switch (systemChoice) {
                case "c":
                    System.out.println("Add new Current Account? - 'A'" +
                            "\nDeposit funds? - 'D'" +
                            "\nWithdraw Funds? - 'W'" +
                            "\nDeactivate Account? - 'DA'" +
                            "\nSet Maximum amount? - 'M'");
                    systemChoice = input.nextLine();
                    switch (systemChoice) {
                        case "a":
                            System.out.print("Enter new Account Id: ");
                            inputInt = input.nextInt();
                            input.nextLine();

                            System.out.print("Enter new Account Name: ");
                            inputString = input.nextLine();

                            accountHolder.addCurrentAccount(inputInt, inputString);
                            break;
                        case "d":
                            System.out.print("Enter account Id: ");
                            inputInt = input.nextInt();

                            System.out.print("Deposit how much?: ");
                            inputFloat = input.nextFloat();
                            accountHolder.retrieveCurrentAccount(inputInt).deposit(inputFloat);
                            break;
                        case "w":
                            System.out.print("Enter account Id: ");
                            inputInt = input.nextInt();

                            System.out.print("Withdraw how much?: ");
                            inputFloat = input.nextFloat();
                            accountHolder.retrieveCurrentAccount(inputInt).withdraw(inputFloat);
                            break;
                        case "da":
                            System.out.print("Are you sure?: ");
                            inputString = input.nextLine();
                            if (inputString.equals("y"))
                                accountHolder.retrieveCurrentAccount(inputInt).setActive(false);
                            break;
                        case "m":
                            System.out.print("Set maximum amount: ");
                            inputFloat = input.nextFloat();

                            accountHolder.retrieveCurrentAccount(inputInt).setMaximumAmount(inputFloat);
                            break;
                    }
                    break;
                case "s":
                    System.out.println("Add new Savings Account? - 'A'" +
                            "\nDeposit funds? - 'D'" +
                            "\nDeactivate Account? - 'DA'" +
                            "\nSet Interest? - 'M'" +
                            "\nAdd Interest? - 'M'");
                    systemChoice = input.nextLine();

                    switch (systemChoice) {
                        case "a":
                            System.out.print("Enter new Account Id: ");
                            inputInt = input.nextInt();
                            input.nextLine();

                            System.out.print("Enter new Account Name: ");
                            inputString = input.nextLine();

                            accountHolder.addSavingsAccount(inputInt, inputString);
                            break;
                        case "d":
                            System.out.print("Enter account Id: ");
                            inputInt = input.nextInt();

                            System.out.print("Deposit how much?: ");
                            inputFloat = input.nextFloat();

                            accountHolder.retrieveSavingsAccount(inputInt).deposit(inputFloat);
                            break;
                        case "da":
                            System.out.print("Are you sure?: ");
                            inputString = input.nextLine();
                            if (inputString.equals("y"))
                                accountHolder.retrieveSavingsAccount(inputInt).setActive(false);
                            break;
                        case "si":
                            System.out.print("Add interest: ");
                            inputFloat = input.nextFloat();

                            accountHolder.retrieveSavingsAccount(inputInt).setInterestRate(inputFloat);
                            break;
                        case "ai":
                            System.out.print("Set interest: ");
                            inputFloat = input.nextFloat();

                            accountHolder.retrieveSavingsAccount(inputInt).addInterest();
                            break;
                    }
                    break;
                case "l":
                    System.out.println("Add new Loan? - 'A'" +
                            "\nPay off amount? - 'P'");
                    systemChoice = input.nextLine();

                    if (systemChoice.equals("a")) {
                        System.out.print("Enter new Loan Id: ");
                        inputInt = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter loan amount: ");
                        inputFloat = input.nextFloat();

                        accountHolder.addLoan(inputInt, inputFloat);
                    } else if (systemChoice.equals("p")) {
                        System.out.print("How much to pay off: ");
                        inputFloat = input.nextFloat();

                        accountHolder.retrieveLoan(inputInt).payAmount(inputFloat);
                    }
                    break;
                default:
                    running = false;
                    break;
            }

        }
    }
}