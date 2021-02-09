package sample.BE;

import java.util.ArrayList;

public class Student {
    
    private int semester;
    private String name;
    private String classYear;
    private String education;
    private ArrayList<String> subjects;
    private int attendance;

    public Student(int semester, String name, String classYear, String education, int attendance) {
        setAttendance(attendance);
        setSemester(semester);
        setClassYear(classYear);
        setName(name);
        setEducation(education);
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
