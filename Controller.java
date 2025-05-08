package pacman;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

    private String direction;

    public Controller() {
        this.direction="RIGHT";
    }

    public void checkDirection(KeyEvent event) {

        if (event.getCode() == KeyCode.UP) {
            this.direction = "UP";
        }
        else if (event.getCode() == KeyCode.DOWN) {
            this.direction = "DOWN";
        }
        else if (event.getCode() == KeyCode.LEFT) {
            this.direction = "LEFT";
        }
        else if (event.getCode() == KeyCode.RIGHT) {
            this.direction = "RIGHT";
        }
    }






    public void checkDirection2(KeyEvent event,Pacman pacman) {

        if (event.getCode() == KeyCode.UP) {
            //
        }
        else if (event.getCode() == KeyCode.DOWN) {
            pacman.getDirection();
        }
        else if (event.getCode() == KeyCode.LEFT) {
            pacman.getDirection();
        }
        else if (event.getCode() == KeyCode.RIGHT) {
            pacman.getDirection();
        }
    }

    public String getDirection() {
        return this.direction;
    }
}
