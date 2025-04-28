package pacman;

import javafx.scene.image.Image;

abstract class MovingObjects {
    public int speed;
    public Image image;
    public int[] position;
    abstract void move();
    
}
