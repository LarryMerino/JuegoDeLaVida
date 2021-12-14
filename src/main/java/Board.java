package src.main.java;
/*
 ** Está estructurado como un array de arrays de la clase
 ** Cell
 */

public class Board{

    private Cell[][] board;
    private final int size;

    public Board(int size){
        board = new Cell[size][size];  
        this.size = size;
    }

    public void setNewCell(int row, int column){
        board[row][column] = new Cell(); 
    }

    public Cell[][] getBoard() {
        return board;
    }

    public Cell getCell(int row, int column){
        return board[row][column];
    }
    
    public int getSize(){
        return size;
    }

    public void fillBoard() {
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                setNewCell(i,j);
            }
        }
    }

    public void printBoard(){
        for (int i = 0; i < size; i++ ) {
            System.out.println();
            for (int j = 0; j < size; j++){
                if (getCell(i,j).isLifeCell()){
                    System.out.print(" [o] "); 
                }else System.out.print(" [ ] ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public boolean isValidCoordinate(int coordinate) {
        if (coordinate > size || coordinate < 1) return false;
        return true;
    }

    public void comeAliveCell(int row, int column) {
        board[row][column].revive();
    }

    public void executeCell(int row, int column) {
        board[row][column].dead(); 
    }
}
