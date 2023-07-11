package Lectures1.CW.Ex2;

public class CreditAccount extends Account{
    private Double prossent;

    public CreditAccount(Integer numAccount, String owner, Double balance, Double prossent) {
        super(numAccount, owner, balance);
        this.prossent = prossent;
    }

    public CreditAccount() {
    }

    public Double getProssent() {
        return prossent;
    }

    public void setProssent(Double prossent) {
        this.prossent = prossent;
    }
    protected void calculateInterest(){
        Double result = getBalance() * prossent / 100;
        withdraw(result);
    }
}
