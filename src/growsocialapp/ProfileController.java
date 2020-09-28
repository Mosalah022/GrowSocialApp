/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package growsocialapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class ProfileController  extends GrowSocialApp implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private FlowPane flowPane;

    @FXML
    private BorderPane borderPane;

    @FXML
    private Label profileLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        // THIS IS DRIVER CODE
        // This fills the FlowPane with PostPreview objects so you have something to click
        try {
            for (int i = 0; i < 50; i++) {
                AnchorPane PostPreview = FXMLLoader.load(getClass().getResource("PostPreview.fxml"));

                flowPane.getChildren().add(PostPreview);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    
        public void NotificationButton(MouseEvent event) throws Exception {               
    try {
//        Image img = new Image("/1 to 7 Screen/NOTIFICATION.png");
        Notifications.create()
                .title("New Webinar Coming Soon")
                .text("Combin growth: workshop for Newbies")
//                .graphic(new ImageView(img))
                .hideAfter(Duration.seconds(7))
                .position(Pos.BOTTOM_LEFT)
                .showWarning();
                
    } catch(Exception e) {
        e.printStackTrace();
    }
}
    
         public void Postbtn(MouseEvent event) throws Exception {               
    try {
       
        changeScreen(event, "Scheduler.fxml");
             
    } catch(Exception e) {
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
         
         public void Photobtn(MouseEvent event) throws Exception {               
    try {
       
        changeScreen(event, "NewPost.fxml");
             
    } catch(Exception e) {
        e.printStackTrace();
        }
    }
        
    public static class Post{
        ImageView mainImage;

    }
}
