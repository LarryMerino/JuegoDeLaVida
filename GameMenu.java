/*
 ** GameMenu recibe una instancia de la clase board
 ** y se encarga de ser el intermediario entre el usuario
 ** y la instacia
 */

public class GameMenu {

    private Board board;

    public GameMenu(Board board) {
        this.board = board;
    }

    public void startGameMenu() {
        runOption();
    }

    private void printMenu() {
        System.out.println("Escoja una de las siguientes opciones:");
        System.out.println("1. Imprimir tablero");
        System.out.println("2. Activar célula");
        System.out.println("3. Desactivar célula");
        System.out.println("4. Limpiar panatalla");
        System.out.println("5. Salir");
        System.out.println();
    }

    private void runOption(){
        while (true) {
            System.out.println();
            printMenu(); 
            System.out.print("Opción: ");
            String chosenOption = UtilitiesStrings.readLine();
            if (isValidFormat(chosenOption)){
                int integerChosenOption = Integer.parseInt(chosenOption.trim());
                if (integerChosenOption == 1){
                    board.printBoard(); 
                }else if(integerChosenOption == 2){
                    activateCell();
                }else if(integerChosenOption == 3){
                    defuseCell();
                }else if(integerChosenOption == 4){
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }else if(integerChosenOption == 5){
                    return;
                }
            }else{
                printErrorOptionMessage();
                printMenu();
            }
        }
    }

    private int getValidFormatCoordinate(String dataName){
        System.out.print("Introduzca la " + dataName + ": ");
        String input = UtilitiesStrings.readLine();
        boolean isFormatAndValidInput = false;
        while (!isFormatAndValidInput){
            if (!isValidFormat(input)) {
                System.out.print("Introduzca un formato válido: ");
                input = UtilitiesStrings.readLine();
                continue;
            }
            if (!board.isValidCoordinate(Integer.parseInt(input.trim()))){
                System.out.print("Introduzca un número entre 1 y " + board.getSize() + ": ");
                input = UtilitiesStrings.readLine();
                continue;
            }
            isFormatAndValidInput = true;
        }
        return Integer.parseInt(input);
    }

    private void activateCell(){
        int row = getValidFormatCoordinate("fila") - 1;
        int column = getValidFormatCoordinate("columna") - 1;
        board.comeAliveCell(row, column);
        System.out.println();
        PrintSuccessMessaage();
        System.out.println("¡NUEVA CÉLULA ACTIVADA!");

    }

    private void defuseCell(){
        int row = getValidFormatCoordinate("fila") - 1;
        int column = getValidFormatCoordinate("columna") - 1;
        board.executeCell(row, column);
        System.out.println();
        PrintSuccessMessaage();
        System.out.println("CÉLULA DESACTIVADA");
    }

    private boolean isValidFormat(String chosenOption){
        char[] chosenOptionArray = chosenOption.trim().toCharArray();
        for (char c : chosenOptionArray){
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    private void printErrorOptionMessage() {
        System.out.println("Opción no válida");
    }

    private void PrintSuccessMessaage() {
        System.out.println("Hecho!");
    }

}
