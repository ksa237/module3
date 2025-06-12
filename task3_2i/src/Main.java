public class Main {

    public static void main(String[] args) {

         SimpleLogger simpleLogger = new SimpleLogger();
         simpleLogger.log("начало обмена данными с источником");
         simpleLogger.log("прочитан файл обмена, будет загружено 6 объектов");
         simpleLogger.log("данные успешно прочитаны");


         SmartLogger smartLogger = new SmartLogger(1);
         smartLogger.log("начало обмена данными с источником");
         smartLogger.log("ошибка чтения файла обмена. error");

    }
}
