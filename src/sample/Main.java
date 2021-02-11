package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI/login.fxml"));
        primaryStage.setTitle("Attendance Taking");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

        public static void main(String[] args) {
            launch(args);
        }
    }

