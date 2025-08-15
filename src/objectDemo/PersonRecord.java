package objectDemo;

/**
 *  1) making class as final
 *  2) make the field as final and private
 *  3) generate the getter methods without any get prefix
 *  4) Generate the constructor with the fields mentioned inside the record header.
 *  5) toString, equals and hashcode methods are generated automatically
 * @param name
 * @param occupation
 */
public record PersonRecord(String name, String occupation) {
    private static String country = "India";
    public PersonRecord {
        if (name == null || occupation == null) {
            throw new IllegalArgumentException();
        }
    }
}
