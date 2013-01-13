public class Driver {
	
	public static void main(String[] args) {

		Life game = new Life("https://raw.github.com/mepcotterell-cs1302/cs1302-life/master/seeds/seed1.txt");

		// game loop
		while (game.isRunning()) {
			game.display();
			game.prompt();
			game.update();
		} // while

	} // main
	
} // Driver