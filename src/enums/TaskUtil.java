package enums;

public class TaskUtil {
    public static  int getEstimatedCompletionTime(int priority) {
        return switch (priority){
            case Priority.LOW->7;
            case Priority.MEDIUM->5;
            case Priority.HIGH->3;
            case Priority.URGENT->1;
            default -> throw new IllegalStateException("Unexpected value: " + priority);
        };
    }
}
