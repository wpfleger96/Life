

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
     * This method constructs the Game of Life using the information provided by
     * the seed file.
     *
     * @param seedFile the seed file
     */
	public Life(int rows, int cols) {

		// 1. Set the instance variables rows and cols appropriately

		// 2. Create the 2-dimensional array with the appropriate size

	} // Life


	/**
	 * Generates the initial population randomly
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
	 * Updates the grid.
	 *
	 * Updates the grid according to the following rules:
	 * <ol>
	 *   <li>Any live cell with fewer than two live neighbours dies, as if 
	 *   caused by under-population.</li>
     *   <li>Any live cell with two or three live neighbours lives on to the 
     *   next generation.</li>
     *   <li>Any live cell with more than three live neighbours dies, as if by 
     *   overcrowding.</li>
     *   <li>Any dead cell with exactly three live neighbours becomes a live 
     *   cell, as if by reproduction.</li>
     * </ol>
	 */
	public void update() {

	} // update

	/**
	 * Returns true if the game is running, false otherwise.
	 */
	public boolean isRunning() {
		return this.running;
	} // isRunning

	/** 
	 * Returns the number of rows in the grid.
	 */
	public int getRows() {
		return this.rows;
	} // getRows

	/** 
	 * Returns the number of columns in the grid.
	 */
	public int getCols() {
		return this.cols;
	} // getCols

	/**
	 * Returns the value of the cell at the specified location within the grid.
	 */
	public boolean getCell(int row, int col) {
		// HINT: You can modify this method to make your algorithm a lot easier
		return this.grid[row][col];
	} // getCell

	/**
	 * Sets the value of the cell at the specified location within the grid.
	 */
	public void setCell(int row, int col, boolean alive) {
		// HINT: You can modify this method to make your algorithm a lot easier
		this.grid[row][col] = alive;
	} // setCell

} // Life