/**
 * This class represents an implementation of Conway's Game of Life.
 */
public class Life {

    // is the game running?
    private boolean running = true;

    // the number of rows
    private int rows;

    // the number of columns
    private int cols;

    // the 2-dimensional grid
    private boolean[][] grid;

    /**
     * The Constructor
     *
     * @param rows the number of rows in the grid
     * @param cols the number of columns in the grid
     */
    public Life(int rows, int cols) {

	// 1. Set the instance variables for rows and cols appropriately

	// 2. Create the 2-dimensional array with the appropriate size

    } // Life


    /**
     * Generates the initial population randomly
     *
     * @param numCells the number of initial cells
     */
    public void init(int numCells) {

    } // init

    /**
     * Displays the grid.
     */
    public void display() {

    } // display

    /**
     * Prompts the user for input.
     */
    public void prompt() {

    } // prompt

    /**
     * Updates the grid according to the rules.
     */
    public void update() {

    } // update

    /**
     * Returns true if the game is running, false otherwise.
     *
     * @return true if the game is running, false otherwise.
     */
    public boolean isRunning() {
	return this.running;
    } // isRunning

    /** 
     * Returns the number of rows in the grid.
     * 
     * @return the number of rows in the grid
     */
    public int getRows() {
	return this.rows;
    } // getRows

    /** 
     * Returns the number of columns in the grid.
     *
     * @return the number of columns in the grid
     */
    public int getCols() {
	return this.cols;
    } // getCols

    /**
     * Returns the value of the cell at the specified location within the grid.
     *
     * @return the value of the cell at the specified location within the grid
     */
    public boolean getCell(int row, int col) {
	// HINT: You can modify this method to make your algorithm a lot easier
	return this.grid[row][col];
    } // getCell

    /**
     * Sets the value of the cell at the specified location within the grid.
     *
     * @param row the row index of the cell
     * @param col the col index of the cell
     * @param alive true if you the specified cell should be made alive, false
     *        otherwise.
     */
    public void setCell(int row, int col, boolean alive) {
	// HINT: You can modify this method to make your algorithm a lot easier
	this.grid[row][col] = alive;
    } // setCell

} // Life
