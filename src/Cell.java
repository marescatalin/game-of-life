public class Cell {

    boolean cellState;
    int neighbours;

    //Default cell will be constructed with cellState = false and 0 neighbours
    public Cell() {
        this.cellState = false;
        this.neighbours = 0;
    }

    public int getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(int neighbours) {
        this.neighbours = neighbours;
    }

    public boolean isCellState() {
        return cellState;
    }

    public void setCellState(boolean cellState) {
        this.cellState = cellState;
    }

    
    public void printCell() {
        System.out.println("Cell State: " + this.cellState);
        System.out.println("Cell Neighbours: " + this.neighbours);
    }
}