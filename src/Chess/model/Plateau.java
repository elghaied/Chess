package Chess.model;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Plateau {
    private static int cases = 64;
    private static int boardsize = cases/8;
    private static double boardDimensions = 600;
    private static double casesSize = boardDimensions/boardsize;


    /**
     *  64
     *  8

     */


    public static void newBoard(GridPane gameBoard) {
        /**
         * Create empty board using multidimensional loops
         * during that register the positions on an array 2D
         * then this function spread the pieces on the chess board
         */


        for (int i = 0; i < boardsize; i++) {
            for (int j = 0; j < boardsize; j++) {
                if(j % 2 == 0 & i % 2 == 1){
//                    @// TODO: 02/04/2021  
                    Rectangle noir = new Rectangle(casesSize,casesSize, Color.BLACK);
                    gameBoard.add(noir,i,j);
                    System.out.println("this is j in modulo: " + j);

                }else {
                    System.out.println("this is j in else : " + j);
                    Rectangle white = new Rectangle(casesSize,casesSize, Color.WHITE);
                    gameBoard.add(white,i,j);

                }
            }

        }

    }
    public  void possiblePath(){
        /**
         * this function calculate the position of the selected piece
         * it's type
         * and return possible path
         */
    }

}
