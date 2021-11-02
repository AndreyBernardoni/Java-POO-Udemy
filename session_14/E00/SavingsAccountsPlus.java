public class SavingsAccountsPlus extends SavingsAccount {
    @Override
    public void withdraw(Double amount) {
        balance -= amount - 2;
    }
}
