package sample.DAL;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.BE.Student;

public class StudentMockDAL {
    ObservableList<Student> allStudents;

    public static ObservableList<Student> loadStudents() {
        ObservableList<Student> allStudents = FXCollections.observableArrayList();

        Student s1 = new Student(2, "Mathias", "Kristensen", "CSe_20A", "Datamatiker", 12);
        allStudents.add(s1);
        Student s2 = new Student(2, "Haraldur", "Jóhannesson", "CSe_20A", "Datamatiker", 67);
        allStudents.add(s2);
        Student s3 = new Student(2, "Trine", "Knudsen", "CSe_20A", "Datamatiker", 6);
        allStudents.add(s3);
        Student s4 = new Student(2, "Julian", "Petersen", "CSe_20A", "Datamatiker", 1);
        allStudents.add(s4);
        Student s5 = new Student(2, "Christian", "Hussmann", "CSe_20A", "Datamatiker", 34);
        allStudents.add(s5);
        return allStudents;
    }
}
