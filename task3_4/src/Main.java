import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> listOfDeals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean open = true;
        while (open) {

            printMenuApp();

            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 0:
                    open = false;
                    break;
                case 1:
                    System.out.print("Введите название задачи:");
                    String answer = scanner.nextLine();
                    listOfDeals.add(answer);
                    System.out.println("Добавлено!");
                    System.out.println();
                    printListDeals(listOfDeals);
                    break;
                case 2:
                    printListDeals(listOfDeals);
                    break;
                case 3:
                    System.out.print("Введите номер задачи для удаления:");
                    int answerInt = scanner.nextInt();
                    int answerId;
                    answerId = answerInt - 1;
                    scanner.nextLine();
                    if (answerId < 0 || answerId >= listOfDeals.size()) {
                        System.out.println("Нет дела с номером " + answerInt);
                    } else {
                        listOfDeals.remove(answerId);
                        System.out.println("Удалено!");
                        System.out.println();
                    }
                    printListDeals(listOfDeals);
                    break;
                case 4:
                    System.out.print("Введите точное наименование задачи для удаления:");
                    String answerString = scanner.nextLine();
                    int findInd = listOfDeals.indexOf(answerString);
                    if (findInd == -1) {
                        System.out.println("Нет дела с наименованием " + answerString);
                    } else {
                        listOfDeals.remove(answerString);
                        System.out.println("Удалено!");
                        System.out.println();
                    }
                    printListDeals(listOfDeals);
                    break;
                default:
                    System.out.println("Неверный номер меню приложения.");

            }

        }

    }


    static void printMenuApp() {

        List<String> lMenu = new ArrayList<>();
        lMenu.add("Выход из программы");
        lMenu.add("Добавить дело");
        lMenu.add("Показать дела");
        lMenu.add("Удалить дело по номеру");
        lMenu.add("Удалить дело по названию");

        System.out.println("-=Выберите операцию=-");

        for (int i = 0; i < lMenu.size(); i++) {
            System.out.println("" + i + ". " + lMenu.get(i));
        }


    }

    static void printListDeals(List<String> listOfDeals) {

        System.out.println("Ваш список дел:");
        int i = 0;
        for (String deal : listOfDeals) {
            i++;
            System.out.println("" + i + ". " + deal);
        }
        System.out.println();
    }

}
