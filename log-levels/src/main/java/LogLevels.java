import java.util.Arrays;
import java.util.List;

public class LogLevels {
    
    public static String message(String logLine) {
            List<String> logLineSplited = Arrays.stream(logLine.split(":")).toList();
        return logLineSplited.get(1).trim();
    }

    public static String logLevel(String logLine) {
        List<String> logLineSplited = Arrays.stream(logLine.split(":")).toList();

        String finalMessage = logLineSplited.get(0)
                .replaceAll("\\[", "")
                .replaceAll("\\]", "");

        return finalMessage.toLowerCase().trim();
    }

    public static String reformat(String logLine) {
        List<String> logLineSplited = Arrays.stream(logLine.split(":")).toList();

        String finalMessage = logLineSplited.get(1).trim()
                + " "
                + logLineSplited.get(0).replaceAll("\\[", "(").replaceAll("\\]", ")").toLowerCase();

        return finalMessage;
    }
}
