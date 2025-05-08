package pacman;


public class Model {

    private char[][] board = {
        {'w','w','w','w','w','w','w','w','w','w','w','w','w','w','w'},
        {'w','s','s','s','s','s','s','w','s','s','s','s','s','s','w'},
        {'w','s','s','s','s','s','s','w','s','s','s','s','s','s','w'},
        {'w','b','w','w','s','s','w','w','s','w','s','w','w','b','w'},
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

    public boolean wallAtPosition(int x, int y) {
        if (y < 0 || y >= board.length || x < 0 || x >= board[0].length) {
            return true;
        }
        return this.board[y][x] == 'w';
    }

    public char[][] getBoard() {
        return this.board;
    }
    
}
