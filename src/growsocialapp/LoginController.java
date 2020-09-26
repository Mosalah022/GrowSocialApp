/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package growsocialapp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class LoginController extends GrowSocialApp implements Initializable {
    @FXML
    private AnchorPane root;
      
    @FXML
    private TextField User;

    @FXML
    private PasswordField Pass;

    @FXML
    private Button Login;

    @FXML
    private Button Proxy;

   
      public void LoginButton(ActionEvent event) throws Exception {               
    try {
       
        changeScreen(event, "Profile.fxml");
             
    } catch(Exception e) {
        e.printStackTrace();
        }
    }
    
     public void ProxyButton(ActionEvent event) throws Exception {               
    try {
       
        changeScreen(event, "Proxy.fxml");
             
    } catch(Exception e) {
        e.printStackTrace();
        }
    }
  
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }
    
}
