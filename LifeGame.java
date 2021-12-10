/*
 ** Es el contexto general de todo el juego
 ** Implementa el método startGame() que es el encargado
 ** de instanciar las clases para arrancar el juego
 */

public class LifeGame{

    private Board board;
    private GameMenu gameMenu;

    public void startGame(){
        System.out.print("Introduzca la longitud del tablero: ");
        int size = Integer.parseInt(Entrada.readLine());
        board = new Board(size);
        board.fillBoard(); 
        board.printBoard();
        gameMenu = new GameMenu(board);
        gameMenu.startGameMenu();
    }

}
