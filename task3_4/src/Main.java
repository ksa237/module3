import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> listD = new ArrayList<>();
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
                    listD.add(answer);
                    System.out.println("Добавлено!");
                    System.out.println();
                    printListDeals(listD);
                    break;
                case 2:
                    printListDeals(listD);
                    break;
                case 3:
                    System.out.print("Введите номер задачи для удаления:");
                    int answerInt = scanner.nextInt();
                    int answerId;
                    answerId = answerInt - 1;
                    scanner.nextLine();
                    if (answerId < 0 || answerId >= listD.size()) {
                        System.out.println("Нет дела с номером " + answerInt);
                    } else {
                        listD.remove(answerId);
                        System.out.println("Удалено!");
                        System.out.println();
                    }
                    printListDeals(listD);
                    break;
                case 4:
                    System.out.print("Введите точное наименование задачи для удаления:");
                    String answerString = scanner.nextLine();
                    int findInd = listD.indexOf(answerString);
                    if (findInd == -1) {
                        System.out.println("Нет дела с наименованием " + answerString);
                    } else {
                        listD.remove(answerString);
                        System.out.println("Удалено!");
                        System.out.println();
                    }
                    printListDeals(listD);
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

    static void printListDeals(List<String> l) {

        System.out.println("Ваш список дел:");
        int i = 0;
        for (String d : l) {
            i++;
            System.out.println("" + i + ". " + d);
        }
        System.out.println();
    }

}
