/**
 *Summary: Sudoku
 *Author: Tomasz Baj s20499
 */

package sudoku;

public class Board {
    private int emptyCell = 0;
    private boolean isCorrect = true;
    private Cell[][] board = new Cell[9][9];

    public Board(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    this.board[i][j] = new Cell();
                    emptyCell++;
                } else this.board[i][j] = new Cell(board[i][j]);
            }
        }
    }

    public Board(Cell[][] board) {
        this.board = board;
        for (int i = 0; i < 81; i++) {
            if (board[i / 9][i % 9].getValue() == 0) emptyCell++;
        }
    }

    public int getEmptyCell() {
        return emptyCell;
    }

    public void setEmptyCell(int emptyCell) {
        this.emptyCell = emptyCell;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }

    public void print() {
        System.out.println("___________________");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) System.out.print("|");
                else System.out.print(" ");
                System.out.print(board[i][j].getValue());
            }
            System.out.println("|");
            if (i % 3 == 2) System.out.println("___________________");
        }
    }

    public boolean check() {
        //horizontal
        outerlooph:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < j; k++) {
                    if ((board[i][j].getValue() == board[i][k].getValue()) && j != k) {
                        isCorrect = false;
                        System.out.println("horizontal, wiersz=" + i + " " + j + " " + k);
                        break outerlooph;
                    }
                }
            }
        }
        //vertical
        outerloopv:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < j; k++) {
                    if ((board[i][j].getValue() == board[k][j].getValue()) && i != k) {
                        isCorrect = false;
                        System.out.println("vertical, kolumna=" + j + " " + i + " " + k);
                        break outerloopv;
                    }
                }
            }
        }
        //box 3x3
        outerloopb:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < j; k++) {
                    if (board[3 * (i / 3) + (j / 3)][3 * (i % 3) + (j % 3)].getValue() ==
                            board[3 * (i / 3) + (k / 3)][3 * (i % 3) + (k % 3)].getValue()) {
                        isCorrect = false;
                        System.out.println("box nr:");
                        break outerloopb;
                    }
                }
            }
        }
        return isCorrect;
    }

    public void method1(int i, int j) {
        int value =board[i][j].getValue();
        for (int k = 0; k < 9; k++) {
            if (k != j && !board[i][k].isFull() && board[i][k].checkCapabilities(value)) {
                method1(i, k);
                emptyCell--;
            }
            if (k != i && !board[k][j].isFull() && board[k][j].checkCapabilities(value)) {
                method1(k, j);
                emptyCell--;
            }
            int x = 3 * (i / 3) + k / 3;
            int y = 3 * (j / 3) + k % 3;
            if (y != j && x != i && !board[x][y].isFull() && board[x][y].checkCapabilities(value)) {
                method1(x, y);
                emptyCell--;
            }
        }
    }

    public void method2() {
        int quantity;
        for (int x = 1; x <= 9; x++) {//iteruje po cyfrach 1 2 3 4 5 6 7 8 9
            for (int i = 0; i < 9; i++) { //sprawdza po liniach
                quantity = 0;
                int column = -1;
                line:
                for (int j = 0; j < 9; j++) {
                    if (!board[i][j].isFull()) {
                        for (int n = 0; n < board[i][j].getCapabilities().length; n++) {
                            if (board[i][j].getCapabilities()[n] == x) {
                                ++quantity;
                                column = j;
                            }
                            if (quantity > 1) break line;
                        }
                    }
                }
                if (quantity == 1) {
                    board[i][column].setValue(x);
                    emptyCell--;
                    method1(i, column);

                }
            }

            for (int j = 0; j < 9; j++) { //sprawdza po kolumnach
                quantity = 0;
                int line = -1;
                column:
                for (int i = 0; i < 9; i++) {
                    if (!board[i][j].isFull()) {
                        for (int n = 0; n < board[i][j].getCapabilities().length; n++) {
                            if (board[i][j].getCapabilities()[n] == x) {
                                ++quantity;
                                line = i;
                            }
                            if (quantity > 1) break column;
                        }
                    }
                }
                if (quantity == 1) {
                    board[line][j].setValue(x);
                    emptyCell--;
                    method1(line, j);

                }
            }

            for (int k = 0; k < 9; k++) { //sprawdza po kwadratach
                quantity = 0;
                int line = -1;
                int column = -1;
                square:
                for (int l = 0; l < 9; l++) {
                    int i = 3 * (k / 3) + l / 3;
                    int j = 3 * (k / 3) + l % 3;
                    if (!board[i][j].isFull()) {
                        for (int n = 0; n < board[i][j].getCapabilities().length; n++) {
                            if (board[i][j].getCapabilities()[n] == x) {
                                ++quantity;
                                line = i;
                                column = j;
                            }
                            if (quantity > 1) break square;
                        }
                    }
                }
                if (quantity == 1) {
                    board[line][column].setValue(x);
                    emptyCell--;
                    method1(line, column);

                }
            }
        }
    }

    public void fix() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j].isFull()) {
                    method1(i, j);
                }
            }
        }
        do {
            method2();
        }
        while (emptyCell != 0);
    }
}