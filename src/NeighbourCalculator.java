public class NeighbourCalculator {
    public Cell[][] grid;

    NeighbourCalculator(Cell[][] grid) {
        this.grid = grid;
    }

    // Work out how many neighbours each cell has
    public void allocateNeighbours(){
        for (int x = 0; x < this.grid.length; x++){
            for (int y = 0; y < this.grid[0].length; y++){
                this.grid[x][y].neighbours = checkNeighbours(x, y);
            }
        }
    }

    // Check neighbours around a cell
    public int checkNeighbours(int xPos, int yPos){
        int neighbours = 0;
        int startPosX = (xPos - 1 < 0) ? xPos : xPos-1; // top
        int startPosY = (yPos - 1 < 0) ? yPos : yPos-1; // left
        int endPosX =   (xPos + 1 > this.grid.length - 1) ? xPos : xPos+1; // bottom
        int endPosY =   (yPos + 1 > this.grid[0].length - 1) ? yPos : yPos+1; // right


        for (int rowNum=startPosX; rowNum<=endPosX; rowNum++) {
            // All the neighbors will be grid[rowNum][colNum]
            for (int colNum=startPosY; colNum<=endPosY; colNum++) {
                if (this.grid[rowNum][colNum].cellState) {
                    neighbours++;
                }
            }
        }

        //Making sure current cell is not taken into the neighbour calculation
        if (this.grid[xPos][yPos].cellState) {
            return neighbours - 1;
        }
        else{
            return neighbours;
        }

    }

}
