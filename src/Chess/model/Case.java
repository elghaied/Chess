package Chess.model;

public class Case {
    Boolean state;

    public Case(Boolean state) {
        this.state = state;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
