import taxes.TaxSystem;

public class Company {

    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;

    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public String getTitle() {
        return title;
    }

    public int getDebit() {
        return debit;
    }

    public int getCredit() {
        return credit;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }

    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int totalTax;
        totalTax = taxSystem.calcTaxFor(getDebit(), getCredit());
        System.out.println("Компания " + getTitle() + " уплатила налог в размере: " + totalTax + " руб.");
        setDebit(0);
        setCredit(0);

    }
}
