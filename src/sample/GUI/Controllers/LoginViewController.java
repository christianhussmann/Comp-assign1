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
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import sample.DAL.StudentMockDAL;

import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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
    @FXML
    private Label ErrorLabel;
    StudentMockDAL studentMockDAL = new StudentMockDAL();




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            File file = new File("Billeder/EASV-med-ramme.jpg");
            Image image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }

        @FXML
        public void login(ActionEvent event) throws Exception {

            String Name = UserName.getText();
            String Code = PassWord.getText();
            boolean LoginData = false;


            for(int i = 0; i < StudentMockDAL.loadStudents().size(); i++){
                if(StudentMockDAL.loadStudents().get(i).getName().equals(Name) && StudentMockDAL.loadStudents().get(i).getCodeword().equals(Code)){
                    LoginData = true;
                }
            }


            if (LoginData) {
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("/sample/GUI/StudentView.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.setTitle("Elev");
                    stage.show();
                } catch (IOException e){
                    e.printStackTrace();
                }

            } else if (UserName.getText().equals("lærer") && PassWord.getText().equals("lærer")) {
                try{
                    Parent root = FXMLLoader.load(getClass().getResource("/sample/GUI/TeacherView.FXML"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.setTitle("Attendence");
                    stage.show();
                }catch (IOException e){
                    e.printStackTrace();
                }
            } else {
                ErrorLabel.setText("Wrong Username ore Password");
            }

        }

    public void reset(ActionEvent actionEvent) {
        UserName.setText("");
        PassWord.setText("");
        ErrorLabel.setText("");
    }
}
