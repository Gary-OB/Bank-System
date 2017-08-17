import java.util.Date;

/**
 * Created by Gary on 17/08/2017.
 */
public class Loan {

    private int loanId;
    private Date startDate;
    private boolean isCleared;
    private int loanAmount;

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

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }
}
