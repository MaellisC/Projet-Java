import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
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
        Canvas canvas = new Canvas(423, 699);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Image Mois_todo = new Image( "Moistodo.png" );
        gc.drawImage( Mois_todo, 0, 0 );
        
        Button button_janvier = new Button("Janvier");
        root.getChildren().add(button_janvier);
        button_janvier.setTranslateX(61);
        button_janvier.setTranslateY(107);

        Button button_fevrier = new Button("Fevrier");
        root.getChildren().add(button_fevrier);
        button_fevrier.setTranslateX(189);
        button_fevrier.setTranslateY(107);

        Button button_Mars = new Button("Mars");
        root.getChildren().add(button_Mars);
        button_Mars.setTranslateX(318);
        button_Mars.setTranslateY(107);

        Button button_Avril = new Button("Avril");
        root.getChildren().add(button_Avril);
        button_Avril.setTranslateX(61);
        button_Avril.setTranslateY(250);

        Button button_Mai = new Button("Mai");
        root.getChildren().add(button_Mai);
        button_Mai.setTranslateX(189);
        button_Mai.setTranslateY(250);

        Button button_Juin = new Button("Juin");
        root.getChildren().add(button_Juin);
        button_Juin.setTranslateX(318);
        button_Juin.setTranslateY(250);

        Button button_Juillet = new Button("Juillet");
        root.getChildren().add(button_Juillet);
        button_Juillet.setTranslateX(61);
        button_Juillet.setTranslateY(396);

        Button button_Aout = new Button("Aout");
        root.getChildren().add(button_Aout);
        button_Aout.setTranslateX(189);
        button_Aout.setTranslateY(396);

        Button button_Septembre = new Button("Septembre");
        root.getChildren().add(button_Septembre);
        button_Septembre.setTranslateX(309);
        button_Septembre.setTranslateY(396);

        Button button_Octobre = new Button("Octobre");
        root.getChildren().add(button_Octobre);
        button_Octobre.setTranslateX(61);
        button_Octobre.setTranslateY(540);


        Button button_Novembre = new Button("Novembre");
        root.getChildren().add(button_Novembre);
        button_Novembre.setTranslateX(185);
        button_Novembre.setTranslateY(540);

        Button button_Decembre = new Button("Decembre");
        root.getChildren().add(button_Decembre);
        button_Decembre.setTranslateX(310);
        button_Decembre.setTranslateY(540);

        theStage.show();
        //ok
    }
}