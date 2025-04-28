package pacman;

import javafx.scene.image.Image;

public class Wall extends NonMovingObjects {


    public Wall(Image image, int[] position) {
        this.image=image;
        this.position=position;
    }

    public Image getImage() {
        return this.image;
    }
    
}
