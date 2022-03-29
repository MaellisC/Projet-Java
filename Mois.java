import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Mois  extends Application {
    public void start(Stage theStage) {
        Group root = new Group();
        Scene theScene = new Scene(root);
        theStage.setScene(theScene);
        Canvas canvas = new Canvas(423, 669);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Image Moistodo = new Image( "Moistodo.png" );
        gc.drawImage( Moistodo, 0, 0 );
        Button button_janvier = new Button("Janvier");
        root.getChildren().add(button_janvier);
        button_janvier.setTranslateX(64);
        button_janvier.setTranslateY(120);
        Button button_fevrier = new Button("Fevrier");
        root.getChildren().add(button_fevrier);
        button_fevrier.setTranslateX(189);
        button_fevrier.setTranslateY(120);
        Button button_Mars = new Button("Mars");
        root.getChildren().add(button_Mars);
        button_Mars.setTranslateX(318);
        button_Mars.setTranslateY(120);
        theStage.show();
        //ok
    }
}