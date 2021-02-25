package sample.GUI.Controllers;

import com.sun.jdi.Value;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import sample.BE.CurrentClass;
import sample.BE.Student;
import sample.BLL.ClassBLLManager;
import sample.BLL.StudentBLLManager;


import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class TeacherViewController implements Initializable {

    public ComboBox<Student> cmboxStudent;


    // Line chart
    public CategoryAxis x;
    public NumberAxis y;
    public LineChart<?, ?> chartAttendance;

    // Bar chart
    public BarChart barChart;
    public NumberAxis yAxis;
    public CategoryAxis xAxis;
    
    public PieChart pieChart;

    public Label labelName;
    public Label labelEducation;
    public Label labelClass;
    public Label labelYear;
    public Label labelSemester;
    public ComboBox<CurrentClass> cmboxClasses;
    public Button btnClassList;

    private ClassBLLManager classBLLManager;
    private StudentBLLManager studentBLLManager;
    private Student selectedStudent = null;

    public TeacherViewController() {
        studentBLLManager = new StudentBLLManager();
        classBLLManager = new ClassBLLManager();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        // Line chart
        XYChart.Series series = new XYChart.Series();

        series.getData().add(new XYChart.Data("1", 5));
        series.getData().add(new XYChart.Data("2", 10));
        series.getData().add(new XYChart.Data("3", 8));
        series.getData().add(new XYChart.Data("4", 12));
        series.getData().add(new XYChart.Data("5", 10));

        chartAttendance.getData().addAll(series);

        // Bar chart
        XYChart.Series series2 = new XYChart.Series();

        series2.getData().add(new XYChart.Data("Mandag", 15));
        series2.getData().add(new XYChart.Data("Tirsdag", 20));
        series2.getData().add(new XYChart.Data("Onsdag", 5));
        series2.getData().add(new XYChart.Data("Torsdag", 7));
        series2.getData().add(new XYChart.Data("Fredag", 2));

        barChart.getData().add(series2);


        // Pie chart
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("SCO", 3000),
                new PieChart.Data("ITO", 1500),
                new PieChart.Data("DBOS", 500),
                new PieChart.Data("SDE", 800)
        );

        pieChart.setClockwise(true);
        pieChart.setLabelLineLength(50);
        pieChart.setLabelsVisible(true);
        pieChart.setStartAngle(180);
        pieChart.setData(pieChartData);

        // Fills the combobox with a list of classes
        try {
            cmboxClasses.setItems(classBLLManager.loadClasses());
        } catch (Exception e){
            e.printStackTrace();
        }

        // Converting CurentClass object to string
        cmboxClasses.setConverter(new StringConverter<CurrentClass>() {
            @Override
            public String toString(CurrentClass currentClass) {
                return currentClass.getClassYear();
            }

            @Override
            public CurrentClass fromString(String s) {
                return null;
            }
        });

        // Fills the combobox with a list of students
        try {
            cmboxStudent.setItems(studentBLLManager.loadStudents());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Converting student object to string
        cmboxStudent.setConverter(new StringConverter<Student>() {
            @Override
            public String toString(Student student) {
                return student.getName() + " " + student.getLastName();
            }

            @Override
            public Student fromString(String s) {
                return null;
            }
        });

        // Listener for the combobox
        cmboxStudent.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
            selectedStudent = newValue;
            updateInformation();
        });
    }


    // Update the labels
    public void updateInformation() {
        if (selectedStudent != null) {
            labelName.setText(selectedStudent.getName() + " " + selectedStudent.getLastName());
            labelEducation.setText(selectedStudent.getEducation());
            labelClass.setText(selectedStudent.getClassYear());
            labelYear.setText(Integer.toString(selectedStudent.getSemester()));
        }
    }

    public void handleSelectStudent(ActionEvent actionEvent) {
    }


    public void handleSelectClasses(ActionEvent actionEvent) {

    }

    public void handleSelectClassList(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/GUI/ClassListView.FXML"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Class List");
        stage.show();

    }
}
