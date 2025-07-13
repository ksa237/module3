import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<Address, Integer> costPerAddress = new HashMap<>();

        //uContryList - список стран с уникальными, неповторяющимися названиями
        HashSet<String> uContryList = new HashSet<>();

        initCostPerAddress(costPerAddress);

        Scanner scanner = new Scanner(System.in);

        int tolalAmount=0;
        while (true) {

            System.out.println();
            System.out.println("Заполнение нового заказа.");
            System.out.println("Введите страну:");
            String userCountry = scanner.nextLine();

            if ( "end".equals(userCountry) ) {
                System.out.println("Программа завершена по команде пользователя.");
                break;
            }

            System.out.println("Введите город:");
            String userCity = scanner.nextLine();

            Address userAddress = new Address(userCountry, userCity);
            boolean noDelivery = !costPerAddress.containsKey(userAddress);
            if (noDelivery) {
                System.out.println("Доставки по этому адресу нет");
                continue;
            }

            System.out.println("введите вес:");
            int userAmmount = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            int price = costPerAddress.get(userAddress);
            int userSumm = price * userAmmount;
            System.out.println("Стоимость доставки составит: "+ userSumm + " руб.");
            tolalAmount=tolalAmount+userSumm;
            System.out.println("Общая стоимость всех доставок: "+tolalAmount+ " руб.");

            uContryList.add(userCountry);
            System.out.println("Список всех стран, где были оформлены заказы: " + uContryList);
        }

    }



    static void initCostPerAddress(Map<Address, Integer> costPerAddress) {

        costPerAddress.put(new Address("Россия", "Владивосток"), 250);
        costPerAddress.put(new Address("Россия", "Москва"), 177 );
        costPerAddress.put(new Address("Россия", "Суражевка"), 235);
        costPerAddress.put(new Address("Китай", "Дальянь"), 108);
        costPerAddress.put(new Address("Сербия", "Приштина"), 300);
        costPerAddress.put(new Address("США", "Панксатони"), 900);
    }

}
