import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Render  extends Application {
  String namePage;
       public void startTodo(Stage TheStageTodo) {
        Group root = new Group();
        Scene theScene = new Scene(root);
        TheStageTodo.setScene(theScene);
        Canvas canvas = new Canvas(423, 699);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Image todo = new Image("todo.png");
        gc.drawImage(todo, 0, 0);
        gc.setStroke(Color.BLACK);
        Font theFont = Font.font("Garamond", FontWeight.SEMI_BOLD, 58);
        gc.strokeText(namePage = null, 160, 60);
        TheStageTodo.show();
       }
       public void startFete(Stage theStageF) {
        Group root = new Group();
        Scene theScene = new Scene(root);
        theStageF.setScene(theScene);
        Canvas canvas = new Canvas(423, 699);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Image fetes = new Image( "fetes.png" );
        gc.drawImage( fetes, 0, 0 );
        theStageF.show();
       }

       public void startMaison(Stage theStageM) {
        Group root = new Group();
        Scene theScene = new Scene(root);
        theStageM.setScene(theScene);
        Canvas canvas = new Canvas(423, 699);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Image maison = new Image( "maison.png" );
        gc.drawImage( maison, 0, 0 );
        theStageM.show();
        }
        public void startTravail(Stage theStageT) {
         Group root = new Group();
         Scene theScene = new Scene(root);
         theStageT.setScene(theScene);
         Canvas canvas = new Canvas(423, 699);
         root.getChildren().add(canvas);
         GraphicsContext gc = canvas.getGraphicsContext2D();
         Image travail = new Image( "travail.png" );
         gc.drawImage( travail, 0, 0 );
         theStageT.show();
       }
       public void start(Stage theStageMois) {
        Group root = new Group();
        Scene theScene = new Scene(root);
        theStageMois.setScene(theScene);
        Canvas canvas = new Canvas(423, 699);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Image Mois_todo = new Image( "Moistodo.png" );
       gc.drawImage( Mois_todo, 0, 0 );
        
        Button button_janvier = new Button("Janvier");
        root.getChildren().add(button_janvier);
        button_janvier.setTranslateX(61);
        button_janvier.setTranslateY(107);
        button_janvier.setOnMouseClicked(new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent mouseEvent) {
          namePage="janvier";
          startTodo(theStageMois);
          gc.setStroke(Color.BLACK);
          Font theFont = Font.font("Garamond", FontWeight.SEMI_BOLD, 58);
          gc.strokeText(namePage = null, 160, 60);

         }
        });

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
        theStageMois.show();
    }

}
/*
// creation de canvas
public class Render  extends Application {
    public void Start(Stage TheStage) {
        Group root = new Group();
        Scene theScene = new Scene(root);
        TheStage.setScene(theScene);
        Canvas canvas = new Canvas(423, 699);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Image todo = new Image("todo.png");
        gc.drawImage(todo, 0, 0);
//        gc.setStroke(Color.BLACK);
//        Font theFont = Font.font("Garamond", FontWeight.SEMI_BOLD, 58);
//        String namepage;
//        gc.strokeText(namepage = null, 160, 60);
        TheStage.show();
    }


//
//public class Tache {
//    public void ajouterTache()
//    TextField addToDo = new TextField();
//    TextField addDay = new TextField();
//    TextField addTime = new TextField();
//    TextField addDeadline = new TextField();
//    TextField addDescription = new TextField();
//}

}
*/