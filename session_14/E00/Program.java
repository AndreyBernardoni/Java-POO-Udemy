public class Program {
    public static void main(String[] args) {
        
        Account account = new Account(1001, "Alex", 1000.0);
        account.withdraw(200.0);
        System.out.println(account.getBalance());

        SavingsAccount account2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        account2.withdraw(200.0);
        System.out.println(account2.getBalance());

        BussinesAccount account3 = new BussinesAccount(1003, "Bob", 1000.0, 500.0);
        account3.withdraw(200.0);
        System.out.println(account3.getBalance());

    }
}