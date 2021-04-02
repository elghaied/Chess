package Chess;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

try {


        Parent root = FXMLLoader.load(getClass().getResource("view/chessView.fxml"));
        Scene scene = new Scene(root);

        /**
         * Set title and Logo
         */
        stage.setTitle("Chess");
        Image icon = new Image("logo.png");
        stage.getIcons().add(icon);

    /**
     * Create the Board
     */





    /**
     * Add Css style sheet
     */
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());


        /**
         * Final step
         */
        stage.setScene(scene);
        stage.show();

}catch (Exception e) {
    System.out.println(e.getMessage());

}
    }


    public static void main(String[] args) {
        launch(args);
    }
}
