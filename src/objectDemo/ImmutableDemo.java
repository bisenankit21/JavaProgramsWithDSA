package objectDemo;

public class ImmutableDemo {
    public static void main(String[] args) {
        ImmutablePerson p1 = new ImmutablePerson("John Doe", "Software Engineer");

        System.out.println(p1.getOccupation()); // Software Engineer

        //p1.setOccupation("Doctor");
        System.out.println(p1.getOccupation()); // Software Engineer
    }

}
