public class Main {
    public static void main(String args[]){

        Grid gameOfLife = new Grid(3,3);
        gameOfLife.changeGridCell(1,0,true);
        gameOfLife.changeGridCell(1,1,true);
        gameOfLife.changeGridCell(1,2,true);

        NeighbourCalculator calculator = new NeighbourCalculator(gameOfLife.grid);
        calculator.allocateNeighbours();
        gameOfLife.printGridCells();
        System.out.println("---------------------");
        StartGame newGame = new StartGame(gameOfLife.grid,2);
        newGame.finalGrid();
        System.out.println("---------------------");


    }
}

