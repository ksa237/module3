public class Main {

    public static void main(String[] args) {

        PasswordChecker myPassword = new PasswordChecker();

        myPassword.setMinLenght(9);
        myPassword.setMaxRepeats(3);

        System.out.println(myPassword.verify("алооооооупоррврв"));

    }

}
