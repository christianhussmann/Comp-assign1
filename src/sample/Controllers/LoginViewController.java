package sample.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewController implements Initializable {
    @FXML
    private TextField UserName;

    @FXML
    private TextField PassWord;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    public void login(ActionEvent event) throws Exception {
        if (UserName.getText().equals("elev") && PassWord.getText().equals("elev")) {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("../GUI/StudentView.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else if (UserName.getText().equals("lærer") && PassWord.getText().equals("lærer"));
        Parent root = FXMLLoader.load(getClass().getResource("../GUI/TeacherView.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void handleSelectStudent(ActionEvent actionEvent) {
    }

}
