package Chess.model;

public class Party {
    private Plateau plateau;
    private String[] deplacement;
    private boolean turn;

    public Party(Plateau plateau, String[] deplacement, boolean turn) {
        this.plateau = plateau;
        this.deplacement = deplacement;
        this.turn = turn;
    }

    /**
     * the Getters
     * @return  Class properties
     */
    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public String[] getDeplacement() {
        return deplacement;
    }

    /**
     * The setters
     *
     */

    public void setDeplacement(String[] deplacement) {
        this.deplacement = deplacement;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    /**
     * Methodes
     */

    public void newParty() {
        /**
         * a method that will start a new party
         */
    }
    public void makeMove() {
        /**
         * Move pieces while recording each step on the list of @param deplacement
         */
    }

    public void cancelMove() {
        /**
         * cancel the last move and recover the previous position using the deplacement list
         */

    }
}
