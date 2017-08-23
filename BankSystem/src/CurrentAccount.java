/**
 * Created by Gary on 13/08/2017.
 * This class is a child class of Account which specifies details
 * associated with a CurrentAccount such as the ability to both
 * withdraw and deposit funds.
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

    public void deposit(float amount){
        if(isActive() && (balance+amount) <= maximumAmount) balance += amount;
    }

    public void withdraw(float amount){
        balance -= amount;
    }

    public String toString() {
        return  super.toString() +
                "\nmaximumAmount: " + maximumAmount;
    }
}
