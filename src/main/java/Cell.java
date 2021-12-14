package src.main.java;
public class Cell{

    private boolean state = false;

    public Cell() {
        setState(false);
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return this.state;
    }

    public void revive() {
        setState(true);
    }

    public boolean isLifeCell() {
        return this.state;
    }

    public void dead() {
        setState(false);
    }
}
