/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package growsocialapp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class NewPostController extends GrowSocialApp implements Initializable {
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
    private Button Create;
    @FXML
    private Button Cancle;
    @FXML
    private StackPane mainContentPane;
    @FXML
    private Spinner<String> spinner;


    ObservableList<String> listaTamanos = FXCollections.observableArrayList("AM", "PM");


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        SpinnerValueFactory<String> valueFactory = new SpinnerValueFactory.ListSpinnerValueFactory<String>(listaTamanos);
        spinner.setValueFactory(valueFactory);
        valueFactory.setValue("AM");
    }

    public void locationPreview(MouseEvent event) throws Exception {
        AnchorPane postPreview = FXMLLoader.load(getClass().getResource("LocationPreview.fxml"));

        StackPane postPreviewHolder = new StackPane();
        postPreviewHolder.getChildren().add(postPreview);
//        postPreviewHolder.layoutXProperty().bind(mainContentPane.widthProperty().divide(2));
//        postPreviewHolder.layoutYProperty().bind(mainContentPane.heightProperty().divide(2));

        Rectangle overlay = new Rectangle();
        overlay.setOpacity(0.4);
        overlay.setFill(Color.BLACK);
        overlay.widthProperty().bind(mainContentPane.widthProperty());
        overlay.heightProperty().bind(mainContentPane.heightProperty());

        Button xButton = (Button)((HBox)((VBox)((StackPane)((HBox)postPreview.getChildren().get(0)).getChildren().get(1)).getChildren().get(0)).getChildren().get(0)).getChildren().get(0);
        xButton.setOnAction(e -> {
            mainContentPane.getChildren().remove(overlay);
            mainContentPane.getChildren().remove(postPreviewHolder);
        });

        Button saveButton = (Button)((StackPane)((VBox)((StackPane)((HBox)postPreview.getChildren().get(0)).getChildren().get(1)).getChildren().get(0)).getChildren().get(5)).getChildren().get(0);
        saveButton.setOnAction(e -> {
            mainContentPane.getChildren().remove(overlay);
            mainContentPane.getChildren().remove(postPreviewHolder);
        });

        Button cancelButton = (Button)((StackPane)((VBox)((StackPane)((HBox)postPreview.getChildren().get(0)).getChildren().get(1)).getChildren().get(0)).getChildren().get(4)).getChildren().get(0);
        cancelButton.setOnAction(e -> {
            mainContentPane.getChildren().remove(overlay);
            mainContentPane.getChildren().remove(postPreviewHolder);
        });


        mainContentPane.getChildren().addAll(overlay, postPreviewHolder);
    }

    public void placeButton(MouseEvent event) throws Exception {
        try {

            changeScreen(event, "Place.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Profilebtn(MouseEvent event) throws Exception {
        try {

            changeScreen(event, "Profile.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Postbtn(MouseEvent event) throws Exception {
        try {

            changeScreen(event, "Scheduler.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void Storybtn(MouseEvent event) throws Exception {               
    try {
       
        changeScreen(event, "StoryScheduler.fxml");
             
    } catch(Exception e) {
        e.printStackTrace();
        }
    }

    public void Stbtn(MouseEvent event) throws Exception {
        try {

            changeScreen(event, "Story.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Repostbtn(MouseEvent event) throws Exception {
        try {

            changeScreen(event, "Repost.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
