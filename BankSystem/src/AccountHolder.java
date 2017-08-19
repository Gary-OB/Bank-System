import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gary on 12/08/2017.
 * This class models an AccountHolder, who is a person looking to create
 * an account or a person who already holds an account.
 */
public class AccountHolder {

    private String accountHolderId;
    private String surname;
    private String forename;
    private List<CurrentAccount> currentAccounts = new ArrayList<>();
    private List<SavingsAccount> savingsAccounts = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public AccountHolder(String accountHolderId) {
        this.accountHolderId = accountHolderId;
    }

    public String getAccountHolderId() {
        return accountHolderId;
    }

    public void setAccountHolderId(String accountHolderId) {
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
    
}
