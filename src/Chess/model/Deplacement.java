package Chess.model;

public class Deplacement {
    private Case departCase;
    private Case destinedCase;

    /**
     * The deplacement process will go as the following
     * check if there's a piece on the destined case
     * if yes and the piece from the other color
     * Mince -1 piece from the opponent
     * take opponent place
     * if yes and the piece from your color
     * movement can't be done
     * if no
     * just move
     * @param departCase
     * @param destinedCase
     */
    public Deplacement(Case departCase, Case destinedCase) {
        this.departCase = departCase;
        this.destinedCase = destinedCase;
    }
}
