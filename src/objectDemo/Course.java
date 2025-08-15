package objectDemo;

public class Course implements Cloneable{
    private String coursenName;

    public String getCoursenName() {
        return coursenName;
    }

    public void setCoursenName(String coursenName) {
        this.coursenName = coursenName;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
