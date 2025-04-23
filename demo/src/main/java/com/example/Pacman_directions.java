package com.example;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


class Pacman_directions implements Entity_direction {

    Image pacmanImage = new Image("pac.png");
    ImageView pacman = new ImageView(pacmanImage);

    
    @Override
    public void face_up(KeyEvent e) {
        if (e.getCode()==KeyCode.UP) {
            pacman.setRotate(270);
            
        }
        
    }

    @Override
    public void face_down(KeyEvent e) {
        if (e.getCode()==KeyCode.DOWN) {
            pacman.setRotate(90);
        }
        
    }

    @Override
    public void face_right(KeyEvent e) {
        if (e.getCode()==KeyCode.RIGHT) {
            pacman.setRotate(0);
        }
    }

    @Override
    public void face_left(KeyEvent e) {
        if (e.getCode()==KeyCode.LEFT) {
            pacman.setRotate(180);
        }
    }
}