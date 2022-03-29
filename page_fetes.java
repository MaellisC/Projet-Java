import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class page_fetes extends Application {
    public void start(Stage theStage) {
        Group root = new Group();
        Scene theScene = new Scene(root);
        theStage.setScene(theScene);
        Canvas canvas = new Canvas(423, 669);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Image fetes = new Image( "fetes.png" );
        gc.drawImage( fetes, 0, 0 );
//        gc.fillText( "Lundi", 71, 125 );
//        gc.strokeText( "Lundi", 71, 125 );

                theStage.show();
    }
}