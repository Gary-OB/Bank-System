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


}