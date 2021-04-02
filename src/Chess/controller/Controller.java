package Chess.controller;

import Chess.model.Plateau;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;


import static Chess.model.Plateau.newBoard;
import static javafx.application.Platform.exit;

public class Controller implements Initializable {
    @FXML
    public Pane gridPaneContainer;


    @FXML
    public GridPane gameBoard;

    @FXML
    public Label timer;

    public void start(ActionEvent e){
        System.out.println("start");
        newBoard(gameBoard);

        }
    public void reStart(ActionEvent e){
        System.out.println("Restart");
    }
    public void quit(ActionEvent e){

        exit();
        System.out.println("Quit");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
