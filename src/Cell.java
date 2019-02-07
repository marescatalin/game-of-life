public class Cell {

    boolean cellState;
    int neighbours;

    //Default cell will be constructed with cellState = false and 0 neighbours
    public Cell() {
        this.cellState = false;
        this.neighbours = 0;
    }


    public boolean isCellState() {
        return cellState;
    }


    public void printCell() {
        System.out.println("Cell State: " + this.cellState);
        System.out.println("Cell Neighbours: " + this.neighbours);
    }
}