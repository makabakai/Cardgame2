import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class CardGame2 extends Application {
    Image image = new Image("file:.\\src\\Icon.jpeg");
    List<Image> cardList = new ArrayList<>();

    public void start(Stage stage) throws Exception {
        stage.setTitle(" ");
        stage.getIcons().add(image);
        HBox box = new HBox();
        GridPane pane = new GridPane();

        for (int i = 1; i <= 54; ++i) {
            cardList.add(new Image("file:.\\src\\card\\"+i+".png"));
        }

        pane.setAlignment(Pos.CENTER);
        box.getChildren().addAll(new ImageView(image), new ImageView(image));
        box.setSpacing(10);
        pane.add(box, 0, 0, 8, 8);
        Scene scene = new Scene(pane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



