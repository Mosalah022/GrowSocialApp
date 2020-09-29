package growsocialapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Place extends GrowSocialApp {
    @FXML StackPane mainContentPane;

    public void locationPreview(MouseEvent event) throws Exception {
        AnchorPane postPreview = FXMLLoader.load(getClass().getResource("LocationPreview.fxml"));

        StackPane postPreviewHolder = new StackPane();
        //postPreviewHolder.getChildren().add(postPreview);

        //postPreviewHolder.layoutXProperty().bind(mainContentPane.widthProperty());
        //postPreviewHolder.layoutYProperty().bind(mainContentPane.heightProperty());

        Rectangle overlay = new Rectangle();
        overlay.setOpacity(0.4);
        overlay.setFill(Color.BLACK);
        overlay.widthProperty().bind(postPreviewHolder.widthProperty());
        overlay.heightProperty().bind(postPreviewHolder.heightProperty());


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

        postPreviewHolder.getChildren().addAll(overlay, postPreview);


        mainContentPane.getChildren().addAll(postPreviewHolder);
    }

    public void Profilebtn(MouseEvent event) throws Exception {
        try {

            changeScreen(event, "Profile.fxml");

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
         
      
    public void applyButton(MouseEvent event) throws Exception {
        try {

            changeScreen(event, "NewPost.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
