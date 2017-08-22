import java.util.Scanner;

public class BankSystemTest {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        AccountHolder accountHolder = setupAccountHolder();
        System.out.println(listDetails(accountHolder));

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
                "\n" + accountHolder.listCurrentAccounts() +
                "\n\n---Savings Accounts---" +
                "\n" + accountHolder.listSavingsAccounts() +
                "\n\n---Loans---" +
                "\n" + accountHolder.listLoan();
    }
}