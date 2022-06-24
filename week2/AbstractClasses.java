public class AbstractClasses {
    public static void main(String[] args) {
        // Make an AbstractBankAccount
        // Make a CheckingAccount that extends AbstractAccount
        // Make a SavingsAccount that extends AbstractAccount
        // Is there any other kind of accounts we can make?
        //   If so, what is it?
        //   Should it extend AbstractAccount or CheckingAccount or SavingsAccount?
    }
}

abstract class AbstractAccount {
    public AbstractAccount() {

    }

    // Methods???

}



// Now what if you need to add interest to the account?

abstract class AbstractInterestService <T extends AbstractAccount> {
    public abstract void addInterest(T account);
}

// class CheckingAccountInterestService extends AbstractInterestService<CheckingAccount> {

// }
