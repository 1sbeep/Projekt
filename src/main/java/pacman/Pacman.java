package pacman;

import javafx.scene.image.Image;

public class Pacman extends MovingObjects {

    private String direction;
    





    //Image image = new Image("pac.png");

    public Pacman(int speed, Image image, int[] position, String direction) {
        this.speed=speed;
        this.image=image;
        this.position=position;
        this.direction=direction;

    }
    
    public void move() {

    }

    public Image getImage() {
        return this.image;
    }
}
