/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package growsocialapp;

import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author DELL
 */
public class GrowSocialApp extends Application {


    @Override
    public void start(Stage primaryStage) {

        try {
            Platform.setImplicitExit(false);

            Parent par = FXMLLoader.load(getClass().getResource("Splash.fxml"));

            Scene scene = new Scene(par, 825, 470);

            primaryStage.setResizable(false);
            primaryStage.setTitle("Splash");
            primaryStage.initStyle(StageStyle.DECORATED);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException ex) {
        }

    }


    public void changeScreen(ActionEvent actionEvent, String FXML) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource(FXML));

        Scene scene = new Scene(parent);
        Stage stage;

        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        if (!FXML.equals("Login.fxml") && !FXML.equals("Proxy.fxml")) {
            stage.setResizable(true);
        }

        stage.setScene(scene);
        stage.show();
    }
    
public void changeScreenn(MouseEvent actionEvent, String FXML) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource(FXML));

        Scene scene = new Scene(parent);
        Stage stage;

        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        if (!FXML.equals("Login.fxml") && !FXML.equals("Proxy.fxml")) {
            stage.setResizable(true);
        }

        stage.setScene(scene);
        stage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
