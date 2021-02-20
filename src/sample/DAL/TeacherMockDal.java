package sample.DAL;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.BE.Teacher;

public class TeacherMockDal {

    ObservableList<Teacher> allTeachers;

    public ObservableList<Teacher> getAllTeachers() {

        ObservableList<Teacher> allTeachers = FXCollections.observableArrayList();

        Teacher t1 = new Teacher("Peter", "Stegger");
        allTeachers.add(t1);
        return allTeachers;
    }

}
