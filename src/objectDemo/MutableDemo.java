package objectDemo;

public class MutableDemo {
    public static void main(String[] args) {
        MutablePerson p1 = new MutablePerson("John Doe", "Software Engineer");

        System.out.println(p1.getOccupation()); // Software Engineer

        p1.setOccupation("Doctor");
        System.out.println(p1.getOccupation()); // Doctor
    }

}
