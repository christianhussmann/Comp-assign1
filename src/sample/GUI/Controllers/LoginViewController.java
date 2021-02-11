package sample.GUI.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewController implements Initializable {
    @FXML
    private ImageView imageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            File file = new File("Billeder/EASV-med-ramme.jpg");
            Image image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }
    public void handleSelectStudent(ActionEvent actionEvent) {
        
    }


}
