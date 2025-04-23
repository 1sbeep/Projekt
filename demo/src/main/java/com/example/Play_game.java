package com.example;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class Play_game extends Application {

    @Override
    public void start(Stage stage) {
        Game_map map = new Game_map();
        map.drawMap(); 
        

        FlowPane pane = new FlowPane(map.canvas);
        Scene scene = new Scene(pane, 600, 600,Color.BLACK);
    

        stage.setTitle("Pacman game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
