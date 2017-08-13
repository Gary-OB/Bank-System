/**
 * Created by Gary on 12/08/2017.
 */
public abstract class Account {

    private String accountName;
    private int accountId;
    private float balance = 0.0f;
    private boolean isActive;


    public Account(String accountName, int accountId, boolean isActive) {
        this.accountName = accountName;
        this.accountId = accountId;
        this.isActive = isActive;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public abstract float checkBalance(int accountId);

    public abstract void deposit(float amount);
}
