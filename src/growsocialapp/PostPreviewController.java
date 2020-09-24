package growsocialapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class PostPreviewController extends GrowSocialApp implements Initializable {
    @FXML
    AnchorPane anchorPane;

    public void previewPost(MouseEvent event) throws Exception {
        StackPane holder = (StackPane)anchorPane.getParent().getParent().getParent();

        AnchorPane postPreview = FXMLLoader.load(getClass().getResource("FullPostPreview.fxml"));

        StackPane postPreviewHolder = new StackPane();
        postPreviewHolder.getChildren().add(postPreview);
        postPreviewHolder.layoutXProperty().bind(holder.widthProperty().divide(2));
        postPreviewHolder.layoutYProperty().bind(holder.heightProperty().divide(2));

        Rectangle overlay = new Rectangle();
        overlay.setOpacity(0.4);
        overlay.setFill(Color.BLACK);
        overlay.widthProperty().bind(holder.widthProperty());
        overlay.heightProperty().bind(holder.heightProperty());
        overlay.setOnMouseClicked(e -> {
            holder.getChildren().remove(overlay);
            holder.getChildren().remove(postPreviewHolder);
        });

        holder.getChildren().addAll(overlay, postPreviewHolder);

    }

        @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO:

    }
}
