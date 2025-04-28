package pacman;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Board {



    Pacman pacman = new Pacman(0,new Image("pac.png") , null, null);

    Ghost redGhost = new Ghost(0, new Image("redghost.png"), null);

    Ghost blueGhost = new Ghost(0, new Image("blueghost.png"), null);

    Ghost orangeGhost = new Ghost(0, new Image("orangeghost.png"), null);

    Ghost pinkGhost = new Ghost(0, new Image("pinkghost.png"), null);

    Wall wall = new Wall(new Image("wall.png"), null);

    BigFood bigFood = new BigFood(new Image("bigfood.jpg"), null);

    NormalFood normalFood = new NormalFood(new Image("normalfood.png"), null);

    Image pacmanImage = pacman.getImage();
    Image redGhostImage = redGhost.getImage();
    Image blueGhostImage = blueGhost.getImage();
    Image orangeGhostImage = orangeGhost.getImage();
    Image pinkGhostImage = pinkGhost.getImage();
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
                            graphics.drawImage(redGhostImage, x, y, tile_size, tile_size);
                            break;
                        
                        case 'w':
                            graphics.drawImage(wallImage, x, y, tile_size, tile_size); 
                            break;
                        
                        case 'g':
                            graphics.drawImage(blueGhostImage, x, y, tile_size, tile_size);
                            break;
        
                        case 'p':
                            graphics.drawImage(pinkGhostImage, x, y, tile_size, tile_size);
                            break;
        
                        case 'o':
                            graphics.drawImage(orangeGhostImage, x, y, tile_size, tile_size);
                            break;
        
                        case 'h':
                            graphics.drawImage(pacmanImage, x, y, tile_size, tile_size);
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
