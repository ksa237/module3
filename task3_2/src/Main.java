public class Main {

    public static void main(String[] args) {

        System.out.println("Основная карта, операции");
        SimpleAccount myCard = new SimpleAccount();
        myCard.add(10000L);
        myCard.add(3000L);
        System.out.println(myCard.getBalance());
        myCard.pay(5000L);
        System.out.println(myCard.getBalance());
        myCard.pay(9000L);
        System.out.println(myCard.getBalance());
        System.out.println();
        System.out.println();

        long limit = 10_000L;
        CreditAccount myCredit = new CreditAccount(limit);
        System.out.println("Лимит кредитной карты = " + limit);
        System.out.println("Баланс кредитной карты = " + myCredit.getBalance());

        System.out.println("Покупка1: 8000");
        myCredit.pay(8000L);
        System.out.println("Баланс = " + myCredit.getBalance());

        System.out.println("Покупка2: 1500");
        myCredit.pay(1500L);
        System.out.println("Баланс = " + myCredit.getBalance());

        System.out.println("Покупка3: 1000");
        myCredit.pay(1000);
        System.out.println("Баланс = " + myCredit.getBalance());


        System.out.println();
        System.out.println("Погашение1: 9400");
        myCredit.add(9400);
        System.out.println("Баланс = " + myCredit.getBalance());

        System.out.println("Погашение2: 500");
        myCredit.add(500);
        System.out.println("Баланс = " + myCredit.getBalance());

        System.out.println("Перевод с myCard на myCredit, сумма: 200");
        myCard.transfer(myCredit, 200);
        System.out.println("Баланс = " + myCredit.getBalance());

        System.out.println("Перевод с myCard на myCredit, сумма: 100");
        myCard.transfer(myCredit, 100);
        System.out.println("Баланс = " + myCredit.getBalance());

    }

}
