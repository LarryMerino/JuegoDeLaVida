package src.main.java;

/*
 ** Es el contexto general de todo el juego
 ** Implementa el método startGame() que es el encargado
 ** de instanciar las clases para arrancar el juego
 */

public class LifeGame {

    private Board board;
    private GameMenu gameMenu;

    public void startGame() {
        board = new Board(getBoardExtension());
        board.fillBoard();
        board.printBoard();
        gameMenu = new GameMenu(board);
        gameMenu.startGameMenu();
    }

    private int getBoardExtension() {
        while (true) {
            System.out.print("Introduzca la longitud del tablero: ");
            String input = UtilitiesStrings.readLine();
            if (UtilitiesStrings.isValidBoardExtension(input)) {
                return Integer.parseInt(input);
            } else System.out.println("Intrduzca un valor mayor que 0");
        }
    }
}
