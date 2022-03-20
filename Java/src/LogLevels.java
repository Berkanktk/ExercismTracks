public class LogLevels {

    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(' ')).trim();
    }
    public static String logLevel(String logLine) {
        return logLine.substring(1, logLine.indexOf(']')).toLowerCase();
    }
    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }

    public static void main(String[] args) {
        System.out.println(message("[INFO]: Hello world"));
        System.out.println(logLevel("[INFO]: Hello world"));
        System.out.println(reformat("[INFO]: Hello world"));
    }
}
