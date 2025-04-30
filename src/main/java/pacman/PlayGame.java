package pacman;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;



public class PlayGame extends Application {



    @Override
    public void start(Stage stage) {

        Board board = new Board();
        board.drawMap();  
                
        Pane pane = new Pane();
        pane.getChildren().addAll(board.canvas,board.pacmanImage,board.blueGhostImage,board.orangeGhostImage,board.pinkGhostImage,board.redGhostImage);



      

        

        //FlowPane pane = new FlowPane(board.canvas);
        Scene scene = new Scene(pane, 620, 650,Color.BLACK);




        stage.setTitle("Pacman game");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }


    public static void main(String[] args) {        
        launch();
    }
}