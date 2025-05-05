package pacman;

import javafx.scene.image.Image;

public class NormalFood extends NonMovingObjects {

    
    public NormalFood(Image image, int[] position) {
        this.image=image;
        this.position=position;
    }

    public Image getImage() {
        return this.image;
    }



    
}
