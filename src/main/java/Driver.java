public class Driver {
	
	public static void main(String[] args) {

		Life game = new Life("seeds/seed1.txt");

		// game loop
		while (game.isRunning()) {
			game.display();
			game.prompt();
			game.update();
		} // while

	} // main
	
} // Driver