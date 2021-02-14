package sample.BE;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class Student {
    
    private int semester;
    private StringProperty name;
    private String lastName;
    private String classYear;
    private String education;
    private ArrayList<String> subjects;
    private int attendance;
    private String codeword;

    public String getCodeword() {
        return codeword;
    }

    public void setCodeword(String codeword) {
        this.codeword = codeword;
    }




    public Student(int semester, String name, String lastName, String classYear, String education, int attendance, String codeword) {
        setAttendance(attendance);
        setSemester(semester);
        setClassYear(classYear);
        this.name = new SimpleStringProperty(name);
        setLastName(lastName);
        setEducation(education);
        setCodeword(codeword);
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public StringProperty nameProperty() {
        return name;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getClassYear() {
        return classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }




}
