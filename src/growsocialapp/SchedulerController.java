/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package growsocialapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

        public void Profilebtn(MouseEvent event) throws Exception {               
    try {
       
        changeScreenn(event, "Profile.fxml");
             
    } catch(Exception e) {
        e.printStackTrace();
        }
    }
    
          public void Photobtn(MouseEvent event) throws Exception {               
    try {
       
        changeScreenn(event, "NewPost.fxml");
             
    } catch(Exception e) {
        e.printStackTrace();
        }
    }
       
   
    
}
