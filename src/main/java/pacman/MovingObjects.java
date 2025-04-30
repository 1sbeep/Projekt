package pacman;

import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

abstract class MovingObjects {
    public int speed;
    public ImageView image;
    public int[] position;
    abstract void move();
    
}
