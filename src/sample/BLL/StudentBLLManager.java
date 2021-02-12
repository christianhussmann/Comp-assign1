package sample.BLL;

import javafx.collections.ObservableList;
import sample.BE.Student;
import sample.DAL.StudentMockDAL;

public class StudentBLLManager {
    private final StudentMockDAL studentMockDAL;

    public StudentBLLManager(StudentMockDAL studentMockDAL) {
        this.studentMockDAL = studentMockDAL;
    }

    public ObservableList<Student> loadStudents() throws Exception {
        return StudentMockDAL.loadStudents();
    }
}
