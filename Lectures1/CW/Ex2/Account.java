package Lectures1.CW.Ex2;

public class Account {
    private Integer numAccount;
    private String owner;
    private Double balance;

    public Account(Integer numAccount, String owner, Double balance) {
        this.numAccount = numAccount;
        this.owner = owner;
        this.balance = balance;
    }

    public Account() {
    }

    public Integer getNumAccount() {
        return numAccount;
    }

    public String getOwner() {
        return owner;
    }

    protected Double getBalance() {
        return balance;
    }

    public void setNumAccount(Integer numAccount) {
        this.numAccount = numAccount;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    protected void deposit(Double amount){
        balance = amount + balance;
    }
    protected void withdraw(Double amount){
        if (balance >= amount) {
            balance = balance - amount;
        }else {
            System.out.println("Нехватает денег. Остаток равен: " + balance);
        }

    }
}
