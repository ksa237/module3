import java.sql.Array;

public class PasswordChecker {

    private int minLenght;
    private int maxRepeats;

    public void setMinLenght(int minLenght) throws IllegalStateException {

        if (minLenght < 0) {
            String msg = """
                    Передано неверное значение в параметр [минимальная_длина]
                    значение :""" + minLenght;
            throw new IllegalStateException(msg);
        } else
            this.minLenght = minLenght;


    }

    public void setMaxRepeats(int maxRepeats) throws IllegalStateException {

        if (maxRepeats <= 0) {
            String msg = """
                    Передано неверное значение в параметр [доп_кол_повтора_симв]
                    значение:""" + maxRepeats;
            throw new IllegalStateException(msg);
        } else
            this.maxRepeats = maxRepeats;


    }


    public boolean verify(String password) {

        // проверим пароль на длину
        if (password.length() < minLenght) {
            return false;
        }

        // проверим пароль на повторы симв.
        char[] charArray = password.toCharArray(); // алллоооооооооуууу
        int lenghtArray = charArray.length;

        char[] charCloneArray = new char[lenghtArray];
        for (int c=0; c < lenghtArray; c++){
            charCloneArray[c]=' ';
        }

        int[] numRptArray = new int[lenghtArray];

        int i = 0;
        do {
            char ch = charArray[i]; // а

            boolean isFind = false;

            for (int c=0; c < lenghtArray; c++){
                if (charCloneArray[c] == ch) {
                    numRptArray[c] = numRptArray[c] + 1;
                    isFind = true;
                }
            }

            if (!isFind) {
               charCloneArray[i] = ch;
               numRptArray[i] ++;
            }

            i++;
        } while (i < lenghtArray);

        for (int num = 0 ; num < numRptArray.length; num ++ ) {
            System.out.println(numRptArray[num]);
        }


        return false;

    }

}