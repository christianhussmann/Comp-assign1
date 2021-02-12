package sample.GUI.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewController implements Initializable {
    @FXML
    private ImageView imageView;
    @FXML
    public Button logIn;
    @FXML
    private TextField UserName;
    @FXML
    private TextField PassWord;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            File file = new File("Billeder/EASV-med-ramme.jpg");
            Image image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }

        @FXML
        public void login(ActionEvent event) throws Exception {
            if (UserName.getText().equals("elev") && PassWord.getText().equals("elev")) {
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/sample/GUI/StudentView.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.close();
                stage.setTitle("Attendance");
            }


        else if (UserName.getText().equals("lærer") && PassWord.getText().equals("lærer"));
            Parent root = FXMLLoader.load(getClass().getResource("/sample/GUI/TeacherView.FXML"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Attendance");
        }


}
