public class BussinesAccount extends Account{
    private double loanLimit;

    public BussinesAccount() {
    }

    public BussinesAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double loan(double amount){
        if(amount <= loanLimit){
            balance += amount - 10.0;
        }

        return balance;
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
    
    public double getLoanLimit() {
        return loanLimit;
    }
    
    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
}