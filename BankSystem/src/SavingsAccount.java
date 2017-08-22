/**
 * Created by Gary on 13/08/2017.
 * This class is a child class of Account which specifies details
 * associated with a SavingsAccount such as the ability to deposit
 * funds and add interest.
 */
public class SavingsAccount extends Account{

    private float interestRate;

    public SavingsAccount(String accountName, int accountId, boolean isActive, float interestRate) {
        super(accountName, accountId, isActive);
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float checkBalance(){
        return balance;
    }

    public void deposit(float amount){
        balance += amount;
    }

    public void addInterest(){
        float interestToAdd;

        interestToAdd = (balance * interestRate)/100;
        balance += interestToAdd;
    }

    public String toString() {
        return  super.toString() +
                "\ninterestRate: " + interestRate;
    }
}
