package sample.GUI.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class TeacherViewController implements Initializable {

    public ComboBox cmboxStudent;

    // Line chart
    public CategoryAxis x;
    public NumberAxis y;
    public LineChart<?, ?> chartAttendance;

    // Bar chart
    public BarChart barChart;
    public NumberAxis yAxis;
    public CategoryAxis xAxis;


    public PieChart pieChart;

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
    }


    public void handleSelectStudent(ActionEvent actionEvent) {
        
    }


}
