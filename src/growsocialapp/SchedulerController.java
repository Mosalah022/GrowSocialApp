/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package growsocialapp;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class SchedulerController extends GrowSocialApp implements Initializable {
    @FXML
    private AnchorPane mainPane;
    @FXML
    private BorderPane borderPane;
    @FXML
    private StackPane profileStackPane;
    @FXML
    private ImageView profilePicture;
    @FXML
    private Label profileLabel;
    @FXML
    private VBox contentVBox;

    @FXML
    private Button newPostButton;
    @FXML
    private Button xButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button undeleteButton;
    @FXML
    private Button editButton;
    @FXML
    private Button previewButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        editButton.setVisible(true);
        previewButton.setVisible(true);
        xButton.setVisible(false);
        undeleteButton.setVisible(false);
        deleteButton.setVisible(false);



        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int roll = random.nextInt(3) + 1;
            try {
                StackPane row = FXMLLoader.load(getClass().getResource("DateRow.fxml"));

                HBox container = (HBox) ((ScrollPane) ((VBox) row.getChildren().get(0)).getChildren().get(1)).getContent();

                for (int j = 0; j < roll; j++) {
                    AnchorPane entry = FXMLLoader.load(getClass().getResource("ScheduledEvent.fxml"));
                    container.getChildren().add(entry);
                }

                contentVBox.getChildren().add(row);
            } catch (IOException exception) {
                exception.printStackTrace();
            }

        }
    }

    public void editButton(MouseEvent event) throws Exception {

        editButton.setVisible(false);
        previewButton.setVisible(false);
        xButton.setVisible(true);
        undeleteButton.setVisible(true);
        deleteButton.setVisible(true);
    }

    public void xButton(MouseEvent event) throws Exception {

        editButton.setVisible(true);
        previewButton.setVisible(true);
        xButton.setVisible(false);
        undeleteButton.setVisible(false);
        deleteButton.setVisible(false);
    }

    public void Profilebtn(MouseEvent event) throws Exception {
        try {

            changeScreenn(event, "Profile.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Photobtn(MouseEvent event) throws Exception {
        try {

            changeScreenn(event, "NewPost.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
