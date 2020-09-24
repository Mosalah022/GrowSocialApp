package growsocialapp;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;

public class TimeoutDialog extends Alert {
    public TimeoutDialog() {
        super(AlertType.INFORMATION);

        super.setTitle(null);

        super.setHeaderText("Your session has timed out. Please login again.");
        super.setContentText("Placeholder.");

        ImageView image = new ImageView("growsocialapp\\1 to 7 Screen\\NOTIFICATION .HELP COLOR.png");
        image.setFitWidth(50);
        image.setFitHeight(50);
        super.getDialogPane().setGraphic(image);
        super.getDialogPane().getStylesheets().add(getClass().getResource("TimeoutDialog.css").toExternalForm());
        ((Button)super.getDialogPane().lookupButton(ButtonType.OK)).setText("Re-Login");
        super.getDialogPane().setMaxSize(400,200);


    }
}
