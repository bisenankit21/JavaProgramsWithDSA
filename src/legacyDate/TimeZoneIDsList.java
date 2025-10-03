package legacyDate;

import java.util.TimeZone;

public class TimeZoneIDsList {
    public static void main(String[] args) {
        String[] timeZoneIDs = TimeZone.getAvailableIDs();
        for (String timeZoneID : timeZoneIDs) {
            System.out.println(timeZoneID);
        }
    }
}
