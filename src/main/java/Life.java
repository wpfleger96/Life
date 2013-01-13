

public class Life {

    private boolean running;
    private boolean[][] grid;

    /**
     * The Constructor
     *
     * This method constructs the Game of Life using the information provided by
     * the seed file.
     *
     * @param seedFile the seed file
     */
	public Life(String seedFile) {

	} // Life

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

	} // isRunning

} // Life