package list;

public class Student implements Comparable<Student>{
    String name;
    int rollNum;
    int marks;

    public Student(String name, int rollNum, int marks) {
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int marksComparison = Integer.compare(this.marks, o.marks);
        if (marksComparison == 0) {
            return Integer.compare(this.rollNum, o.rollNum);
        }
        return marksComparison; // currently it will be ascending order. to make it in descending order just makeit in reverse.

    }
}
