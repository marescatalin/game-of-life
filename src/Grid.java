import java.util.Arrays;

public class Grid {
    int rows,cols;
    Cell[][] grid;

    public Grid(int rows,int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = initialiseGrid();
    }
    

    public Cell[][] initialiseGrid(){
        Cell[][] grid = new Cell[this.rows][this.cols];
        for (int row = 0; row < this.rows; row ++)
            for (int col = 0; col < this.cols; col++)
                grid[row][col] = new Cell();

        return grid;
    }

    public void changeGridCell(int xPos,int yPos,boolean alive){
        this.grid[xPos][yPos].cellState = alive;
    }

    public void printGridNeighbours() {
        for (int x = 0; x < this.rows; x++) {
            for (int y = 0; y < this.cols; y++) {
                System.out.print(this.grid[x][y].neighbours);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

        public void printGridCells(){
            for (int x = 0; x < this.rows; x++){
                for (int y = 0; y < this.cols; y++){
                    System.out.print(this.grid[x][y].isCellState());
                    System.out.print(" ");
                }
                System.out.println(" ");
            }

    }

}
