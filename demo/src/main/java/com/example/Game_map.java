package com.example;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;



public class Game_map {
    // s=small food, w=wall, b=big food, n=blank cell, g=blue ghost, r=red ghost, o=orange ghost, p=pink ghost, h=pacman
    Image redghostImage = new Image("redghost.png");
    Image pacmanImage = new Image("pac.png");
    Image blueghostImage = new Image("blueghost.png");
    Image orangeghostImage = new Image("orangeghost.png");
    Image pinkghostImage = new Image("pinkghost.png");
    Image small_foodImage = new Image("smallfood.png");
    Image big_foodImage = new Image("bigfood.jpg");
    Image wallImage = new Image("wall.png");



        
    char[][] game_map = {
        {'w','w','w','w','w','w','w','w','w','w','w','w','w','w','w'},
        {'w','s','s','s','s','s','s','w','s','s','s','s','s','s','w'},
        {'w','s','s','s','s','s','s','w','s','s','s','s','s','s','w'},
        {'w','b','w','w','s','w','w','w','s','w','s','w','w','b','w'},
        {'w','s','s','s','s','s','s','s','s','s','s','s','s','s','w'},
        {'w','s','s','w','w','s','s','w','w','w','s','s','s','s','w'},
        {'w','s','w','w','s','n','w','s','s','s','w','s','s','s','w'},
        {'w','s','w','s','n','w','s','w','s','s','s','w','s','s','w'},
        {'w','s','s','s','n','w','n','w','w','n','s','s','s','s','w'},
        {'w','s','s','s','n','n','o','n','w','n','s','s','s','s','w'},
        {'w','s','s','s','n','r','n','p','w','n','s','s','s','s','w'},
        {'w','s','s','s','w','n','g','n','w','n','s','s','s','s','w'},
        {'w','s','s','s','n','w','w','w','w','n','s','s','s','s','w'},
        {'w','b','w','s','s','w','s','h','s','s','s','s','s','b','w'},
        {'w','s','s','s','s','s','s','s','s','s','s','s','s','s','w'},
        {'w','w','w','w','w','w','w','w','w','w','w','w','w','w','w'}
        };

    Canvas canvas = new Canvas(650, 650);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    int tileSize = 40;

    public void drawMap() {

    for (int row = 0; row < game_map.length; row++) {
        for (int column = 0; column < game_map[0].length; column++) {
            double x = column * tileSize;
            double y = row * tileSize;

            char tile = game_map[row][column];

            switch (tile) {

                case 'n':
                    gc.fillRect(x, y, tileSize, tileSize);
                    break;

                case 'r':
                    gc.drawImage(redghostImage, x, y, tileSize, tileSize);
                    break;
                
                case 'w':
                    gc.drawImage(wallImage, x, y, tileSize, tileSize); 
                    break;
                
                case 'g':
                    gc.drawImage(blueghostImage, x, y, tileSize, tileSize);
                    break;

                case 'p':
                    gc.drawImage(pinkghostImage, x, y, tileSize, tileSize);
                    break;

                case 'o':
                    gc.drawImage(orangeghostImage, x, y, tileSize, tileSize);
                    break;

                case 'h':
                    gc.drawImage(pacmanImage, x, y, tileSize, tileSize);
                    break;

                case 'b':
                    gc.drawImage(big_foodImage, x, y, tileSize, tileSize);
                    break;

                case 's':
                    gc.drawImage(small_foodImage, x, y, tileSize, tileSize);
                    break;

            }
        }
    }
    }
}
