
public abstract class Account {

    private long balance;


    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {

        boolean flagSuccessPay = this.pay(amount);

        if (flagSuccessPay) {
            boolean flagSuccessAdd = account.add(amount);
            if (flagSuccessAdd) {
                return true;
            } else
                return false;
        } else
            return false;
    }

}