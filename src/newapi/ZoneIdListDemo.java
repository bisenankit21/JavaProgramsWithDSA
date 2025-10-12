package newapi;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdListDemo {
    public static void main(String[] args) {
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        for (String zone : allZones) {
            System.out.println(zone);
        }
    }
}
