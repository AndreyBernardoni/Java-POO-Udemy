public class Account {
    private Integer number;
    private String name;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String name, Double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(Double amount) {
        balance -= amount - 5.0;
    }

    public void deposit(Double amount) {
        balance += amount;
    }
    
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    
}