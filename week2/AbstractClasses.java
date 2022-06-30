public class AbstractClasses {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        System.out.println(account.deposit(10_000));
        System.out.println(account.deposit(10_000));
        System.out.println(account.deposit(10_000));

        // Make an AbstractBankAccount
        // Make a CheckingAccount that extends AbstractAccount
        // Make a SavingsAccount that extends AbstractAccount
        // Is there any other kind of accounts we can make?
        //   If so, what is it?
        //   Should it extend AbstractAccount or CheckingAccount or SavingsAccount?
    }
}

abstract class AbstractAccount {
    private double balance;
    public AbstractAccount() {
        this.balance = 0;
    }
    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }
    abstract public double withdraw(double amount);
    public double getBalance() {
        return balance;
    }
}
class CheckingAccount extends AbstractAccount {
    // @Override
    public double deposit(double amount) {
        double result = super.deposit(amount);
        // any other special code for checking accounts
        return result;
    }
    // @Override
    public double withdraw(double amount) {
        // TODO Auto-generated method stub
        return 0;
    }
}


// Now what if you need to add interest to the account?

abstract class AbstractInterestService <T extends AbstractAccount> {
    public abstract void addInterest(T account);
}

// class CheckingAccountInterestService extends AbstractInterestService<CheckingAccount> {

// }
