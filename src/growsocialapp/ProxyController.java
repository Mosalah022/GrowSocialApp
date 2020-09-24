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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class ProxyController extends GrowSocialApp implements Initializable {
    ObservableList list = FXCollections.observableArrayList();

    @FXML
    private TextField User;
    @FXML
    private PasswordField Pass;
    @FXML
    private Button Save;
    @FXML
    private Button Login;
    @FXML
    private ChoiceBox<?> proxyType;

    private void loaddata() {
        list.removeAll(list);
        String a = "Https";
        String b = "Socks5";
        String c = "Http";

        list.addAll(a, b, c);
        proxyType.setTooltip(new Tooltip("Proxy Type"));
        proxyType.getItems().addAll(list);
    }

    public void LoginButton(ActionEvent event) throws Exception {
        try {

            changeScreen(event, "Login.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SaveButton(ActionEvent event) throws Exception {
        try {

            changeScreen(event, "Login.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loaddata();
    }

}
