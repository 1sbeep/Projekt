package pacman;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;

public class Play2 extends Application {



    @Override
    public void start(Stage stage) {

        Board board = new Board();
        board.drawMap();  
        Pacman pacman = new Pacman(2, board.pacmanImage,null, null);  
                
        Pane pane = new Pane();
        pane.getChildren().addAll(board.canvas,board.pacmanImage,board.blueGhostImage,board.orangeGhostImage,board.pinkGhostImage,board.redGhostImage);



        ImageView pacmanImage = pacman.getImage();

        Scene scene = new Scene(pane, 620,650 ,Color.BLACK);


        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            
            public void handle(KeyEvent event) {
                pacman.move(event);
            }
        });

        //scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
          //  @Override
            
            //public void handle(KeyEvent event) {
              //  pacman.move3(event);
            //}
        //});






        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (pacman.direction=="UP") {
                    pacmanImage.setRotate(270);
                    pacmanImage.setY(pacmanImage.getY() - pacman.speed);
                }
               

                if (pacman.direction=="DOWN") {
                    pacmanImage.setRotate(90);
                    pacmanImage.setY(pacmanImage.getY() + pacman.speed);
                }

                if (pacman.direction=="LEFT") {
                    pacmanImage.setRotate(180);
                    pacmanImage.setX(pacmanImage.getX() - pacman.speed);
                }

                if (pacman.direction=="RIGHT") {
                    pacmanImage.setRotate(0);
                    pacmanImage.setX(pacmanImage.getX() + pacman.speed);
                }

                //if (pacmanImage.getX() >= 620 || pacmanImage.getX() <= 0) {
                  //  pacmanImage.setX(pacmanImage.getX() - pacman.speed);
                    //pacman.speed *= 0.5;
                //}


                //test

                if (pacmanImage.getX() >= 400) {
                    pacmanImage.setX(pacmanImage.getX() - pacman.speed);

                
                }

                if (pacmanImage.getX() <= 100) {
                    pacmanImage.setX(pacmanImage.getX() + pacman.speed);

                
                }

                if (pacmanImage.getY() >= 610) {
                    pacmanImage.setY(pacmanImage.getY() - pacman.speed);
                }
                
                if (pacmanImage.getY() <= 0) {
                    pacmanImage.setY(pacmanImage.getY() + pacman.speed);
                }
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