import java.util.*;

class Student {
    String name;
    String id;
    int marks;
    int rollNo;

    Student(String name, String id, int marks, int rollNo) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.rollNo = rollNo;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Marks: " + marks + ", Roll No: " + rollNo;
    }
}
class marksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.marks, s1.marks);
    }
}

public class Qu {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Akash", "S001", 85, 207));
        students.add(new Student("Kishan", "S002", 92, 200));
        students.add(new Student("Divyansh", "S003", 99, 231));
        students.add(new Student("David", "S004", 90, 208));

        Comparator<Student> byMarks = new marksComparator();

        Collections.sort(students, byMarks);


        for (Student student : students) {
            System.out.println(student);
        }




    }

}
