## Game of Life



`Grid gameOfLife = new Grid(3,3);`
Declaring a grid of size 3X3

 `gameOfLife.changeGridCell(1,0,true);`
 Changing cell at position (1,0) to true (alive)
 
 `NeighbourCalculator calculator = new NeighbourCalculator(gameOfLife.grid);
 calculator.allocateNeighbours();`
 Computing neighbours for each cell
 
 `StartGame newGame = new StartGame(gameOfLife.grid,2);
 newGame.finalGrid();`
 Start game with number of iterations 2 and return the final grid configuration to terminal output
