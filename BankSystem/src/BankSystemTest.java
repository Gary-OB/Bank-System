import java.util.ArrayList;

/**
 * Created by Gary O Brien on 22/08/2017.
 * Class which contains the main and an initialise
 * method for setting up data related to the system.
 */
public class BankSystemTest {
    public static void main(String args[]){
        ArrayList<AccountHolder> data = initialiseData();
        System.out.println(listAccountHolders(data));
    }

    public static ArrayList<AccountHolder> initialiseData(){
        ArrayList<AccountHolder> accountHolders = new ArrayList<>();

        AccountHolder accountHolderOne = new AccountHolder(1001, "Russell", "Melissa");
        accountHolderOne.addCurrentAccount(2001, "Melissa's Current Account");
        accountHolderOne.addSavingsAccount(3001, "Melissa's Savings Account");
        accountHolderOne.addLoan(4001, 5000.0f);

        AccountHolder accountHolderTwo = new AccountHolder(1002, "Coleman", "Craig");
        accountHolderTwo.addCurrentAccount(2002, "Craig's Current Account");
        accountHolderTwo.addSavingsAccount(3002, "Craig's Savings Account");
        accountHolderTwo.addLoan(4002, 1500.0f);

        AccountHolder accountHolderThree = new AccountHolder(1003, "Gonzales", "Sarah");
        accountHolderThree.addCurrentAccount(2003, "Sarah's Current Account");
        accountHolderThree.addSavingsAccount(3003, "Sarah's Savings Account");
        accountHolderThree.addLoan(4003, 7000.0f);

        AccountHolder accountHolderFour = new AccountHolder(1004, "Robinson", "Ronald");
        accountHolderFour.addCurrentAccount(2004, "Ronald's Current Account");
        accountHolderFour.addSavingsAccount(3004, "Ronald's Savings Account");
        accountHolderFour.addLoan(4004, 100.0f);


        accountHolders.add(accountHolderOne);
        accountHolders.add(accountHolderTwo);
        accountHolders.add(accountHolderThree);
        accountHolders.add(accountHolderFour);

        return accountHolders;
    }

    public static String listAccountHolders(ArrayList<AccountHolder> data){
        String dataAsString = "";

        for(AccountHolder accountHolder : data){
            dataAsString += "--------Account Info--------" +
                            "\nAccount_Number: " + accountHolder.getAccountHolderId() +
                            "\nSurname: " + accountHolder.getSurname() +
                            "\nForename: " + accountHolder.getForename() +
                            "\n\n-------Current Acounts-------" +
                            "\n" + accountHolder.listCurrentAccounts() +
                            "\n-------Savings Acounts-------" +
                            "\n" + accountHolder.listSavingsAccounts() +
                            "\n------------Loans------------" +
                            "\n" + accountHolder.listLoan() +
                            "\n\n\n";
        }

        return dataAsString;
    }
}
