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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
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
public class RepostController extends GrowSocialApp implements Initializable {
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
    private Spinner<String> spinner;

       
       
       ObservableList<String> listaTamanos = FXCollections.observableArrayList("AM", "PM");
       

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         SpinnerValueFactory<String> valueFactory = new SpinnerValueFactory.ListSpinnerValueFactory<String>(listaTamanos);        
        spinner.setValueFactory(valueFactory);        
        valueFactory.setValue("AM");
    }    

       public void Profilebtn(MouseEvent event) throws Exception {               
    try {
       
        changeScreen(event, "Profile.fxml");
             
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
       
     public void Stbtn(MouseEvent event) throws Exception {               
    try {
       
        changeScreen(event, "Story.fxml");
             
    } catch(Exception e) {
        e.printStackTrace();
        }
    }
   
      public void placeButton(MouseEvent event) throws Exception {
        try {

            changeScreen(event, "Place.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
