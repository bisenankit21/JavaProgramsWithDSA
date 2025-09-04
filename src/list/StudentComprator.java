package list;

import java.util.Comparator;

public class StudentComprator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int marksComparison = Integer.compare(o1.marks, o2.marks);
        if (marksComparison == 0) {
            return Integer.compare(o1.rollNum, o2.rollNum);
        }
        return marksComparison;
    }
}
