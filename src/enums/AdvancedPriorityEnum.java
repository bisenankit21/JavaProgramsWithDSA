package enums;

public enum AdvancedPriorityEnum {
    LOW(7),
    MEDIUM(5),
    HIGH(2),
    URGENT(1);

    private int estimatedCompletionDays;

    private AdvancedPriorityEnum(int estimatedCompletionDays) {
        this.estimatedCompletionDays = estimatedCompletionDays;
    }

    public int getEstimatedCompletionDays() {
        return estimatedCompletionDays;
    }
}
