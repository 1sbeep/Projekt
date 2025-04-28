package pacman;

import javafx.scene.image.Image;

public class Ghost extends MovingObjects {

    private int ghostState;



    public Ghost(int speed, Image image, int[] position) {
        this.speed=speed;
        this.image=image;
        this.position=position;
    }


    

    public void move() {

    }

    public void scared() {

    }

    public void chase() {

    }

    public Image getImage() {
        return this.image;
    }
    
}
