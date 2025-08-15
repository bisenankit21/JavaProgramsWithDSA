package objectDemo;

public final class ImmutablePerson {
    private final String name;
    private final String occupation;

    public ImmutablePerson(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

   /* public void setName(String name) {
        this.name = name;
    }*/

    public String getOccupation() {
        return occupation;
    }

   /* public void setOccupation(String occupation) {
        this.occupation = occupation;
    }*/
}
