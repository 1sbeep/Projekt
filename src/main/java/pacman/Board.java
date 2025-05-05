package pacman;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Board {



    Pacman pacman = new Pacman(0,new ImageView("pac.png") , null, null);
    Ghost redGhost = new Ghost(0, new ImageView("redghost.png"), null);
    Ghost blueGhost = new Ghost(0, new ImageView("blueghost.png"), null);
    Ghost orangeGhost = new Ghost(0, new ImageView("orangeghost.png"), null);
    Ghost pinkGhost = new Ghost(0, new ImageView("pinkghost.png"), null);
    Wall wall = new Wall(new Image("wall.png"), null);
    BigFood bigFood = new BigFood(new Image("bigfood.jpg"), null);
    NormalFood normalFood = new NormalFood(new Image("normalfood.png"), null);

    
    ImageView pacmanImage = pacman.getImage();
    ImageView redGhostImage = redGhost.getImage();
    ImageView blueGhostImage = blueGhost.getImage();
    ImageView orangeGhostImage = orangeGhost.getImage();
    ImageView pinkGhostImage = pinkGhost.getImage();
    Image wallImage = wall.getImage();
    Image bigFoodImage = bigFood.getImage();
    Image normalFoodImage = normalFood.getImage();







        
        
        

    // s=small food, w=wall, b=big food, n=blank cell, g=blue ghost, r=red ghost, o=orange ghost, p=pink ghost, h=pacman   
    
  
        
        
                
    char[][] board = {
                {'w','w','w','w','w','w','w','w','w','w','w','w','w','w','w'},
                {'w','s','s','s','s','s','s','w','s','s','s','s','s','s','w'},
                {'w','s','s','s','s','s','s','w','s','s','s','s','s','s','w'},
                {'w','b','w','w','s','w','w','w','s','w','s','w','w','b','w'},
                {'w','s','s','s','s','s','s','s','s','s','s','s','s','s','w'},
                {'w','s','s','w','w','s','s','w','w','w','s','s','s','s','w'},
                {'w','s','w','w','s','n','w','s','s','s','w','s','s','s','w'},
                {'w','s','w','s','n','s','s','s','s','s','s','w','s','s','w'},
                {'w','s','s','s','n','n','n','n','s','n','s','s','s','s','w'},
                {'w','s','s','s','w','w','n','w','w','n','s','s','s','s','w'},
                {'w','s','s','s','w','n','o','n','w','n','s','s','s','s','w'},
                {'w','s','s','s','w','r','g','p','w','n','s','s','s','s','w'},
                {'w','s','s','s','w','w','w','w','w','n','s','s','s','s','w'},
                {'w','b','w','s','s','s','s','h','s','s','s','s','s','b','w'},
                {'w','s','s','s','s','s','s','s','s','s','s','s','s','s','w'},
                {'w','w','w','w','w','w','w','w','w','w','w','w','w','w','w'}
                };
        
    Canvas canvas = new Canvas(620, 650);
    GraphicsContext graphics = canvas.getGraphicsContext2D();
    int tile_size = 40;

    public void drawMap() {
        for (int row = 0; row < board.length; row++) {
                for (int column = 0; column < board[0].length; column++) {
                    double x = column * tile_size;
                    double y = row * tile_size;
        
                    char tile = board[row][column];
        
                    switch (tile) {
        
                        case 'n':
                            graphics.fillRect(x, y, tile_size, tile_size);
                            break;
        
                        case 'r':
                            redGhostImage.setX(column*tile_size);
                            redGhostImage.setY(row*tile_size);
                            redGhostImage.setFitHeight(tile_size-5);
                            redGhostImage.setFitWidth(tile_size-5);
                            break;
                        
                        case 'w':
                            graphics.drawImage(wallImage, x, y, tile_size, tile_size); 
                            break;
                        
                        case 'g':
                            blueGhostImage.setX(column*tile_size);
                            blueGhostImage.setY(row*tile_size);
                            blueGhostImage.setFitHeight(tile_size-5);
                            blueGhostImage.setFitWidth(tile_size-5);                            
                            break;
        
                        case 'p':
                            pinkGhostImage.setX(column*tile_size);
                            pinkGhostImage.setY(row*tile_size);
                            pinkGhostImage.setFitHeight(tile_size-5);
                            pinkGhostImage.setFitWidth(tile_size-5);
                            break;
        
                        case 'o':
                            orangeGhostImage.setX(column*tile_size);
                            orangeGhostImage.setY(row*tile_size);
                            orangeGhostImage.setFitHeight(tile_size-5);
                            orangeGhostImage.setFitWidth(tile_size-5);


                            break;
        
                        case 'h':
                            pacmanImage.setX(column*tile_size);
                            pacmanImage.setY(row*tile_size);
                            pacmanImage.setFitHeight(tile_size);
                            pacmanImage.setFitWidth(tile_size);


                            break;
        
                        case 'b':
                            graphics.drawImage(bigFoodImage, x, y, tile_size, tile_size);
                            break;
        
                        case 's':
                            graphics.drawImage(normalFoodImage, x, y, tile_size, tile_size);
                            break;
        
                    }
            }
        }
    }

    public void updateMap() {


    }

    public void resetAfterDeath() {
        
    }

}