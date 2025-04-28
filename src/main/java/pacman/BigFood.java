package pacman;

import javafx.scene.image.Image;

public class BigFood extends NonMovingObjects {


    public BigFood(Image image, int[] position) {
        this.image=image;
        this.position=position;
    }

    public Image getImage() {
        return this.image;
    }


    
}
