public class CreditAccount extends Account {

    private final long LIMIT;

    public CreditAccount(long limit) {
        this.LIMIT = (-1) * limit;
    }

    @Override
    public boolean add(long amount) {
        long value;
        value = getBalance() + amount;
        if (value <= 0) {
            setBalance(value);
            return true;
        } else
            return false;

    }

    @Override
    public boolean pay(long amount) {

        long value;

        value = getBalance() - amount;
        if (value >= LIMIT) {
            setBalance(value);
            return true;
        } else
            return false;

    }


}

