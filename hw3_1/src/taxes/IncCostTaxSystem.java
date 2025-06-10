package taxes;

public class IncCostTaxSystem extends TaxSystem {

    private final int RATE = 15;

    @Override
    public int calcTaxFor(int debit, int credit) {

        if (debit - credit < 0) {
            return 0;
        }

        return ((debit - credit) * 15) / 100;
    }

}
