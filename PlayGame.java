package pacman;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.util.Duration;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

public class PlayGame extends Application {

    @Override
    public void start(Stage stage) {

        RenderBoard drawBoard = new RenderBoard(); 
        Model board = new Model();
        drawBoard.drawMap(board);
        Controller controller = new Controller();

        Pacman pacman = new Pacman(1, drawBoard.pacmanImage,null, null); 
        //pacman.getImage().setX(80);
        //pacman.getImage().setY(80);





        Pane pane = new Pane();

        pane.getChildren().addAll(drawBoard.canvas,drawBoard.pacmanImage,drawBoard.blueGhostImage,drawBoard.orangeGhostImage,drawBoard.pinkGhostImage,drawBoard.redGhostImage);

        Scene scene = new Scene(pane, 620,650 ,Color.BLACK);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            
            @Override
            public void handle(KeyEvent event) {
                //pacman.checkDirection(event);
                controller.checkDirection(event);
            }
        });

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                pacman.move2(board, controller);
                pacman.checkForFood(board, drawBoard);
            }
        };

        timer.start();  

        
        

        stage.setTitle("AnimationTimer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
}