public class Main {
    public static void main(String args[]){

        // Example grid from document
        Grid gameOfLife = new Grid(3,3);
        gameOfLife.changeGridCell(1,0,true);
        gameOfLife.changeGridCell(1,1,true);
        gameOfLife.changeGridCell(1,2,true);

        // Computing neighbours for each cell in the grid
        NeighbourCalculator calculator = new NeighbourCalculator(gameOfLife.grid);
        calculator.allocateNeighbours();

        // Print initial grid configuration
        System.out.println("Initial configuraiton");
        System.out.println("---------------------");
        gameOfLife.printGridCells();
        System.out.println("");
        System.out.println("");
        System.out.println("Final Configuration");
        System.out.println("---------------------");

        // Start game with 2 iterations
        StartGame newGame = new StartGame(gameOfLife.grid,2);
        newGame.finalGrid();



        // Print final grid configuration
        gameOfLife.printGridCells();



    }
}

