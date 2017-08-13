/**
 * Created by Gary on 13/08/2017.
 */
public class CurrentAccount extends Account {

    private float maximumAmount;

    public CurrentAccount(String accountName, int accountId, boolean isActive, float maximumAmount){
        super(accountName, accountId, isActive);
        this.maximumAmount = maximumAmount;
    }

    public float getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(float maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public float checkBalance(){
        return balance;
    }
}
