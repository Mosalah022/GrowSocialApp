/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package growsocialapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class SplashController  extends GrowSocialApp implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    AnchorPane mainPane;

    @FXML
    AnchorPane splashPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        FadeTransition fade = new FadeTransition(Duration.seconds(2), splashPane);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.setCycleCount(1);
        fade.setDelay(Duration.seconds(1));

        fade.setOnFinished(e -> {
            try {
                AnchorPane profileContents = FXMLLoader.load(getClass().getResource(("Login.fxml")));
                mainPane.getChildren().setAll(profileContents);

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        fade.play();

    }    
    
}
