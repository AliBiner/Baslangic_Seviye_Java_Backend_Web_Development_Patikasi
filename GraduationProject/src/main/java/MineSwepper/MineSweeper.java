package MineSwepper;

import java.util.Arrays;
import java.util.Random;

public class MineSweeper {
    private int rowCount;
    private int columnCount;
    private int mineCount;
    private Character[][] mineGrid;
    private String[] mineCoordinates;
    private String[][] gameBoard;
    private int safeCellsToReveal;
    private final boolean cheatMode;

    private final CustomScanner scanner;

    public MineSweeper(boolean cheatMode) {
        this.cheatMode = cheatMode;
        this.scanner = new CustomScanner();
        promptBoardDimensions();
        initializeGameBoard();
        calculateMineCoordinates();
        this.safeCellsToReveal = (rowCount*columnCount) - this.mineCount;
    }

    private void promptBoardDimensions() {
        this.rowCount = scanner.getAbsoluteRange("Satır sayısı giriniz (en az 2): ", 2);
        this.columnCount = scanner.getAbsoluteRange("Sütun sayısı giriniz (en az 2): ", 2);
    }

    private void initializeGameBoard() {
        this.gameBoard = new String[rowCount][columnCount];
        this.mineGrid = new Character[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            Arrays.fill(gameBoard[i], "-"); // Oyuncu tahtasındaki tüm hücreler kapalı
            Arrays.fill(mineGrid[i],'-');
        }
    }

    private void calculateMineCoordinates() {
         this.mineCount = (rowCount * columnCount) / 4; // calculate mine count

        this.mineCoordinates = new String[mineCount];

        Random random = new Random();

        for (int rowIteratorOfOuter = 0; rowIteratorOfOuter < mineCoordinates.length; rowIteratorOfOuter++) {

            mineCoordinates[rowIteratorOfOuter] = String.valueOf(random.nextInt(rowCount)) + String.valueOf(random.nextInt(columnCount));

            int rowIteratorOfInner = 0;
            while (rowIteratorOfInner < mineCoordinates.length) {

                if (rowIteratorOfOuter == rowIteratorOfInner) rowIteratorOfInner++;
                else if (mineCoordinates[rowIteratorOfOuter].equals(mineCoordinates[rowIteratorOfInner])) {
                    mineCoordinates[rowIteratorOfOuter] = String.valueOf(random.nextInt(rowCount)).concat(String.valueOf(random.nextInt(columnCount)));
                    rowIteratorOfInner = 0;
                } else {
                    rowIteratorOfInner++;
                }
            }

            if (mineCoordinates[rowIteratorOfOuter].length() < 2) {
                mineCoordinates[rowIteratorOfOuter] = "0" + mineCoordinates[rowIteratorOfOuter];
            }
        }
        placeMines();
    }

    private void placeMines() {
        if (mineCoordinates == null)
            calculateMineCoordinates();
        else {
            for (int rowIterator = 0; rowIterator < mineGrid.length; rowIterator++) {
                for (int columnIterator = 0; columnIterator < mineGrid[rowIterator].length ; columnIterator++) {
                    for (String mineLocation : mineCoordinates){
                        if ((String.valueOf(rowIterator)+String.valueOf(columnIterator)).contains(mineLocation)){
                            mineGrid[rowIterator][columnIterator] = '*';
                            break;
                        }
                        else
                            mineGrid[rowIterator][columnIterator] = '-';
                    }
                }
            }
        }
    }

    private boolean isMineAt(String location) {
        return Arrays.stream(mineCoordinates).anyMatch(element -> element.contains(location));
    }

    private void revealCell(int x, int y){
        if (isCellRevealed(x,y)){
            System.out.println("Bu konumu daha önce açtınız. Lütfen başka bir konum seçin.");
            return;
        }
        int mineCountAround = countAdjacentMines(x,y);
        gameBoard[x][y] = String.valueOf(mineCountAround);
        safeCellsToReveal--;
    }

    private boolean isCellRevealed(int x, int y){
        return !gameBoard[x][y].equals("-");
    }

    private int countAdjacentMines(int row, int column) {
        int mineCountAround = 0;
        for (int rowIterator = row - 1; rowIterator <= row + 1; rowIterator++) {
            for (int columnIterator = column - 1; columnIterator <= column + 1; columnIterator++) {
                String xyAxis = String.valueOf(rowIterator) + String.valueOf(columnIterator);
                boolean isMatch = Arrays.stream(mineCoordinates).anyMatch(element -> element.contains(xyAxis));
                if (isMatch)
                    mineCountAround++;
            }
        }
        return mineCountAround;
    }

    private boolean isGameWon(){
        return safeCellsToReveal <= 0; 
    }

    private <T> void printBoard(T[][] matris){
        for (T[] row : matris){
            for (T cell : row){
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

//    private void printBoard(char[][] board) {
//        for (char[] row : board) {
//            for (char cell : row) {
//                System.out.print(cell + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    private void printBoard(String[][] board) {
//        for (String[] row : board) {
//            for (String cell : row) {
//                System.out.print(cell + " ");
//            }
//            System.out.println();
//        }
//    }

    public void play(){
        if (cheatMode){
            printBoard(mineGrid);

            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println();
        }
        String xyAxis;
        int selectedRow;
        int selectedColumn;

        do {
            printBoard(gameBoard);
            selectedRow = scanner.getAbsoluteRange("Açmak istediğiniz satır numarasını giriniz (1 ile "+ rowCount +" arasında) : "  ,1,
                    rowCount) -1;
            selectedColumn = scanner.getAbsoluteRange("Açmak istediğiniz sütun numarasını giriniz ( 1 ile "+ columnCount + " arasında) : ",1,
                    columnCount) -1;
            xyAxis = String.valueOf(selectedRow) + String.valueOf(selectedColumn);
            if (isMineAt(xyAxis)){
                System.out.println("Mayına bastınız! Oyunu kaybettiniz. \uD83D\uDCA3");
                break;
            }
            revealCell(selectedRow,selectedColumn);
            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println();
        }while (!isGameWon());

        if (isGameWon())
            System.out.println("Tebrikler, tüm güvenli hücreleri açtınız! Kazandınız! \uD83C\uDF89");
        System.out.println("--- Mayınların Gerçek Konumu ---");
        printBoard(mineGrid);
    }
}
