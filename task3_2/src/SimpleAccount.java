public class SimpleAccount extends Account {

    @Override
    public boolean add(long amount) {
        amount = getBalance() + amount;
        setBalance(amount);
        return true;
    }

    @Override
    public boolean pay(long amount) {

        long value;
        value = getBalance() - amount;
        if (value >= 0) {
            setBalance(value);
            return true;
        } else
            return false;

    }
}
