import java.time.LocalDateTime;

public class SmartLogger implements Logger {

    private int num;
    private String pref = "INFO";

    public SmartLogger(int num) {
        this.num = num;
    }

    @Override
    public void log(String msg) {

        String msgcopy = msg.toUpperCase();
        if (msgcopy.contains("ERROR")) {
            pref = "ERROR";
        }
        System.out.println(pref + "#" + num + "[" + LocalDateTime.now() + "] " + msg);
        num++;
    }
}
