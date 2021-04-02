package Chess.model.piece;

public class Piece {
    private String name;
    private String color;
    private String imgSrc;

    public Piece(String name, String color, String imgSrc) {
        this.name = name;
        this.color = color;
        this.imgSrc = imgSrc;
    }

    public void movePiece() {
        /**
         * Move the piece according to it's position and the state of the Board
         */
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }
}
