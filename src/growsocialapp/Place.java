package growsocialapp;

import javafx.scene.input.MouseEvent;

public class Place extends GrowSocialApp {
    public void Profilebtn(MouseEvent event) throws Exception {
        try {

            changeScreen(event, "Profile.fxml");

        } catch (Exception e) {
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
