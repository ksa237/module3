import taxes.IncCostTaxSystem;
import taxes.IncTaxSystem;

public class Main {

    public static void main(String[] args) {

        Company almazLTD = new Company("Алмаз ООО", new IncTaxSystem() );
        almazLTD.shiftMoney(2000);
        almazLTD.shiftMoney(50000);
        almazLTD.shiftMoney(15000);
        almazLTD.shiftMoney(-12000);
        almazLTD.shiftMoney(60000);
        almazLTD.payTaxes();
        System.out.println();

        Company ipPetrov = new Company("Петров ИП", new IncCostTaxSystem() );
        ipPetrov.shiftMoney(2000);
        ipPetrov.shiftMoney(50000);
        ipPetrov.shiftMoney(15000);
        ipPetrov.shiftMoney(-12000);
        ipPetrov.shiftMoney(60000);
        ipPetrov.payTaxes();
        System.out.println();

        System.out.println("Рекомендуется сменить систему НО для "+ ipPetrov.getTitle() );
        ipPetrov.setTaxSystem( new IncTaxSystem() );
        System.out.println("СНО изменена на [6% на Доход]");

        ipPetrov.shiftMoney(2000);
        ipPetrov.shiftMoney(50000);
        ipPetrov.shiftMoney(15000);
        ipPetrov.shiftMoney(-12000);
        ipPetrov.shiftMoney(60000);
        ipPetrov.payTaxes();

    }

}
