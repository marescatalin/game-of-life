public class StartGame {

    Cell[][] grid;
    int iterations;

    //Default cell will be constructed with cellState = false and 0 neighbours
    public StartGame(Cell[][] grid,int iterations) {
        this.grid = grid;
        this.iterations = iterations;
    }

    public Cell[][] finalGrid(){
        Cell[][] oldGrid = createOldGrid(this.grid);
        for (int i = 0; i<this.iterations; i++) {
            for (int row = 0; row < this.grid.length; row++) {
                for (int col = 0; col < this.grid[0].length; col++) {
                    int neighbours = oldGrid[row][col].neighbours;
                    boolean cellState = oldGrid[row][col].cellState;
                    this.grid[row][col].cellState = applyRule(neighbours,cellState);
                }
            }
            NeighbourCalculator calculator = new NeighbourCalculator(this.grid);
            calculator.allocateNeighbours();
            oldGrid = createOldGrid(this.grid);
        }
        return this.grid;
    }

    public boolean applyRule(int neighbours,boolean alive){
        if(neighbours==0){
            return false;
        }
        if(neighbours<2){
            return false;
        }
        if(neighbours>3 && alive){
            return false;
        }
        if((neighbours==2 || neighbours==3) && alive) {
            return true;
        }
        if(neighbours==3 && !alive) {
            return true;
        }
        return false;
    }

    public Cell[][] createOldGrid(Cell[][] oldGrid){
        Cell[][] grid = new Cell[oldGrid.length][oldGrid[0].length];
        for (int row = 0; row < grid.length; row ++)
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = new Cell();
                grid[row][col].cellState = oldGrid[row][col].cellState;
                grid[row][col].neighbours = oldGrid[row][col].neighbours;
            }

        return grid;
    }


}
