/**
 * Created by Gary on 12/08/2017.
 */
public abstract class Account {
    private int accountId;
    private float balance = 0.0f;
    private boolean isActive;


    public Account(int accountId, boolean isActive) {
        this.accountId = accountId;
        this.isActive = isActive;
    }
}
