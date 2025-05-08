package pacman;

import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Pacman extends MovingObjects {

    private String direction;

    public Pacman(int speed, ImageView image, int[] position, String direction) {
        this.speed=speed;
        this.image=image;
        this.position=position;
        this.direction=direction;

    }

    public ImageView getImage() {
        return this.image;
    }
    

    public void checkDirection(KeyEvent event) {
        if (event.getCode() == KeyCode.UP) {
            this.direction = "UP";
        }
        else if (event.getCode() == KeyCode.DOWN) {
            this.direction = "DOWN";
        }
        else if (event.getCode() == KeyCode.LEFT) {
            this.direction = "LEFT";
        }
        else if (event.getCode() == KeyCode.RIGHT) {
            this.direction = "RIGHT";
        }
    }

    public boolean wallAtPosition(Model board, int x, int y) {
        if (y < 0 || y >= board.getBoard().length || x < 0 || x >= board.getBoard()[0].length) {
            return true;
        }
        return board.getBoard()[y][x] == 'w';
    }

    //board.length = antal rækker
    //board[0].length = antal kolonner i første række
    //y er rækkeindeks, x er kolonneindeks
    //rækker først, derefter kolonner

    public void move(Model board) {
        int tileSize = 40;
        int tileX = (int) (this.image.getX() / tileSize);
        int tileY = (int) (this.image.getY() / tileSize);

        switch (direction) {
            case "UP":
                if (!wallAtPosition(board, tileX, tileY-1)) {
                    this.image.setRotate(270);
                    this.image.setY(this.image.getY() - this.speed);
                }
                break;

            case "DOWN":
                if (!wallAtPosition(board, tileX, tileY+1)) {
                    this.image.setRotate(90);
                    this.image.setY(this.image.getY() + this.speed);
                }
                break;

            case "LEFT":
                if (!wallAtPosition(board, tileX-1, tileY)) {
                    this.image.setRotate(180);
                    this.image.setX(this.image.getX() - this.speed);
                }
                break;

            case "RIGHT":
                if (!wallAtPosition(board, tileX+1, tileY)) {                   
                    this.image.setRotate(0);
                    this.image.setX(this.image.getX() + this.speed);
                }
                break;
                
            default:
                break;
        }
    }



    public void move2(Model board, Controller direction) {

        int tileSize = 40;
        int tileX = (int) (this.image.getX() / tileSize);
        int tileY = (int) (this.image.getY() / tileSize);

        int i=0;
        while (i<40) {

            switch (direction.getDirection()) {
                case "UP":
                    if (!wallAtPosition(board, tileX, tileY-1)) {
                        this.image.setRotate(270);
                        this.image.setY(this.image.getY() - this.speed);
                    }
                    break;

                case "DOWN":
                    if (!wallAtPosition(board, tileX, tileY+1)) {
                        this.image.setRotate(90);
                        this.image.setY(this.image.getY() + this.speed);
                    }
                    break;

                case "LEFT":
                    if (!wallAtPosition(board, tileX-1, tileY)) {
                        this.image.setRotate(180);
                        this.image.setX(this.image.getX() - this.speed);
                    }
                    break;

                case "RIGHT":
                    if (!wallAtPosition(board, tileX+1, tileY)) {                   
                        this.image.setRotate(0);
                        this.image.setX(this.image.getX() + this.speed);
                    }
                    break;
                    
                default:
                    break;
            }
            i=i+1;

        }
    }
    




    public void checkForFood(Model board, RenderBoard view) {
        int tileSize = 40;
        int tileX = (int) (this.image.getX() / tileSize);
        int tileY = (int) (this.image.getY() / tileSize);

    
        char currentTile = board.getBoard()[tileY][tileX];
        if (currentTile == 's' || currentTile == 'b') {
            board.getBoard()[tileY][tileX] = 'n';    
            view.clearTileAt(tileX, tileY);                 
        }
    }


    public String getDirection() {
        return this.direction;
    }
}
    

    



