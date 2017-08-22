import java.util.Date;

/**
 * Created by Gary on 17/08/2017.
 * This class models a loan with all the related
 * attributes of a loan.
 */
public class Loan {

    private int loanId;
    private Date startDate;
    private boolean isCleared;
    private float loanAmount;

    public Loan(int loanId, boolean isCleared, float loanAmount) {
        this.loanId = loanId;
        this.startDate = new Date();
        this.isCleared = isCleared;
        this.loanAmount = loanAmount;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public boolean isCleared() {
        return isCleared;
    }

    public void setCleared(boolean cleared) {
        isCleared = cleared;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void payAmount(float amountToPay){
        loanAmount = loanAmount - amountToPay;
    }

    public String toString() {
        return  "loanId: " + loanId +
                "\nstartDate: " + startDate +
                "\nisCleared: " + isCleared +
                "\nloanAmount: " + loanAmount;
    }
}
