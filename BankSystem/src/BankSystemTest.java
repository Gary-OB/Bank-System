import java.util.Scanner;

public class BankSystemTest {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        AccountHolder accountHolder = setupAccountHolder();
        System.out.println(listDetails(accountHolder));

        boolean running = true;
        String systemChoice = "";

        while(running) {
            System.out.print("What does your request have to deal with? (Current Accounts - 'C'" +
                    ", Savings Accounts - 'S' or Loans - 'L' ): ");

            if(systemChoice == "c".toUpperCase()){
                //deal with CurrentAccounts
            } else if (systemChoice == "s".toUpperCase()){
                //deal with SavingsAccount
            } else if (systemChoice == "l".toUpperCase()){
                //deal with Loans
            } else running = false;
        }
    }

    public static AccountHolder setupAccountHolder(){
        AccountHolder newAccountHolder = new AccountHolder(1001, "Gonzales", "Sarah");

        newAccountHolder.addCurrentAccount(2001, "My Current Account");
        newAccountHolder.addSavingsAccount(3001, "My Savings Account");
        newAccountHolder.addLoan(4001, 2500.0f);

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
}