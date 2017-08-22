import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Created by Gary on 12/08/2017.
 * This class models an AccountHolder, who is a person looking to create
 * an account or a person who already holds an account.
 */
public class AccountHolder {

    private int accountHolderId;
    private String surname;
    private String forename;

    private List<CurrentAccount> currentAccounts = new ArrayList<>();
    private List<SavingsAccount> savingsAccounts = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

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

    public String listCurrentAccounts(){
        Iterator itr = currentAccounts.iterator();
        String currentAccountList = "Current Accounts\n" +
                                    "----------------\n";

        while(itr.hasNext()){
            Object element = itr.next();
            currentAccountList.concat(element.toString());
        }

        return currentAccountList;
    }

    public String listSavingsAccounts(){
        Iterator itr = savingsAccounts.iterator();
        String savingsAccountList = "Savings Accounts\n" +
                "----------------\n";

        while(itr.hasNext()){
            Object element = itr.next();
            savingsAccountList.concat(element.toString());
        }

        return savingsAccountList;
    }

    public String listLoan(){
        Iterator itr = loans.iterator();
        String loanList = "Loans\n" +
                "----------------\n";

        while(itr.hasNext()){
            Object element = itr.next();
            loanList.concat(element.toString());
        }

        return loanList;
    }
}
