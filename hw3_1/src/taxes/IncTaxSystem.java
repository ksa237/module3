package taxes;

public class IncTaxSystem extends TaxSystem {

    private final int RATE = 6;

    @Override
    public int calcTaxFor(int debit, int credit) {

        if (debit <= 0) {
            return 0;
        }

        return (debit * 6) / 100;

    }

}
