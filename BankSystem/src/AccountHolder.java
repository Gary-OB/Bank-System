import java.util.*;

/**
 * Created by Gary on 12/08/2017.
 * This class models an AccountHolder, who is a person looking to create
 * an account or a person who already holds an account.
 */
public class AccountHolder {

    private int accountHolderId;
    private String surname;
    private String forename;

    private LinkedList currentAccounts = new LinkedList();
    private LinkedList savingsAccounts = new LinkedList();
    private LinkedList loans = new LinkedList();

    public AccountHolder(int accountHolderId, String surname, String forename) {
        this.accountHolderId = accountHolderId;
        this.surname = surname;
        this.forename = forename;
    }

    public int getAccountHolderId() {
        return accountHolderId;
    }

    public void setAccountHolderId(int accountHolderId) {
        this.accountHolderId = accountHolderId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public LinkedList getCurrentAccounts() {
        return currentAccounts;
    }

    public LinkedList getSavingsAccounts() {
        return savingsAccounts;
    }

    public LinkedList getLoans() {
        return loans;
    }

    public void addCurrentAccount(int accountId, String accountName) {
        CurrentAccount accountToAdd = new CurrentAccount(accountName, accountId, true, 3000.0f);

        currentAccounts.add(accountToAdd);
    }

    public void addSavingsAccount(int accountId, String accountName) {
        SavingsAccount accountToAdd = new SavingsAccount(accountName, accountId, true, 0.0f);

        savingsAccounts.add(accountToAdd);
    }

    public void addLoan(int loanId, float loanAmount) {
        Loan loanToAdd = new Loan(loanId, false, loanAmount);

        loans.add(loanToAdd);
    }

    public String listContents(LinkedList list){
        Iterator itr = list.iterator();
        String contentsList = "";
        while(itr.hasNext()){
            contentsList = itr.next().toString() + "\n";
        }

        return contentsList;
    }
    
}
