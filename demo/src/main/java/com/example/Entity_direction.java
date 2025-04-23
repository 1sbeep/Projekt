package com.example;

import javafx.scene.input.KeyEvent;

interface Entity_direction {
    void face_up(KeyEvent e);
    void face_down(KeyEvent e);
    void face_right(KeyEvent e);
    void face_left(KeyEvent e);

}