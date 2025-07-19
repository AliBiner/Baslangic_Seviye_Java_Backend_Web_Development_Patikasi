package MineSwepper;

import java.util.Arrays;
import java.util.Random;

public class MineSweeper {
    private int sweeperRowCount;
    private int sweeperColumnCount;
    private int mineCount;
    private char[][] invisibleSweeper;
    private CustomScanner scanner;
    private String[] mineLocations;
    private String[][] visibleSweeper;
    private int unopenedCount;

    public MineSweeper() {
        this.scanner = new CustomScanner();
        setSweeperRowCount();
        setSweeperColumnCount();
        setEmptySweeper();
        setMineCount();
        calculateMineLocation();
        setVisibleSweeper();
        setUnopenedCount();
    }

    public String[] calculateMineLocation() {
        this.mineLocations = new String[mineCount];
        Random random = new Random();
        for (int i = 0; i < mineLocations.length; i++) {
            mineLocations[i] = String.valueOf(random.nextInt(sweeperRowCount)).concat(String.valueOf(random.nextInt(sweeperColumnCount)));
            int whileIndex = 0;
            while (whileIndex < mineLocations.length) {
                if (i == whileIndex) whileIndex++;
                else if (mineLocations[i].equals(mineLocations[whileIndex])) {
                    mineLocations[i] = String.valueOf(random.nextInt(sweeperRowCount)).concat(String.valueOf(random.nextInt(sweeperColumnCount)));
                    whileIndex = 0;
                } else {
                    whileIndex++;
                }
            }
            if (mineLocations[i].length() < 2) {
                mineLocations[i] = "0" + mineLocations[i];
            }
        }
        Arrays.sort(mineLocations);
        return mineLocations;
    }

    private void setSweeperRowCount() {
        this.sweeperRowCount = scanner.getAbsoluteRange("Satır sayısı giriniz : ", 2);
    }

    private void setSweeperColumnCount() {
        this.sweeperColumnCount = scanner.getAbsoluteRange("Sütun Sayısı giriniz : ", 2);
    }

    private void setMineCount() {
        this.mineCount = (sweeperColumnCount * sweeperRowCount) / 4;
    }

    public void setEmptySweeper() {
        this.invisibleSweeper = new char[sweeperRowCount][sweeperColumnCount];
    }

    private void setVisibleSweeper() {
        this.visibleSweeper = new String[sweeperRowCount][sweeperColumnCount];
        for (int i = 0; i < visibleSweeper.length; i++) {
            for (int j = 0; j < visibleSweeper[i].length; j++) {
                visibleSweeper[i][j] = "-";
            }
        }
    }

    private void setUnopenedCount() {
        this.unopenedCount = (sweeperRowCount*sweeperColumnCount) - mineCount;
    }

    public char[][] getInvisibleSweeper() {
        return invisibleSweeper;
    }

    public String[][] getVisibleSweeper() {
        return visibleSweeper;
    }

    public void fillMineSweeper() {
        if (mineLocations == null)
            System.out.println("Mayın konumları bulunamadı. Lütfen mayın konumlarını hesaplayın.");
        else {
            for (int i = 0; i < invisibleSweeper.length; i++) {
                for (int j = 0; j < invisibleSweeper[i].length ; j++) {
                    for (String mineLocation : mineLocations){
                        if ((String.valueOf(i)+String.valueOf(j)).contains(mineLocation)){
                            invisibleSweeper[i][j] = '*';
                            break;
                        }
                        else
                            invisibleSweeper[i][j] = '-';
                    }
                }
            }
        }
    }

    public void showMineSweeper(char[][] mineSweeper) {
        for (int i = 0; i < mineSweeper.length; i++) {
            for (int j = 0; j < mineSweeper[i].length; j++) {
                System.out.print(mineSweeper[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void showMineSweeper(String[][] mineSweeper) {
        for (int i = 0; i < mineSweeper.length; i++) {
            for (int j = 0; j < mineSweeper[i].length; j++) {
                System.out.print(mineSweeper[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isMineHere(String location) {
        for (String mineLocation : mineLocations) {
            if (location.contains(mineLocation)){
                return true;
            }
        }
        return false;
    }

    public int areThereMinesAround(int x, int y) { //1,2
        int mineCountAround = 0;
        for (int j = x - 1; j <= x + 1; j++) {
            for (int k = y - 1; k <= y + 1; k++) {
                for (String mineLocation : mineLocations){
                    if (mineLocation.contains(String.valueOf(j) + String.valueOf(k) ))
                        mineCountAround++;
                }
            }
        }
        return mineCountAround;
    }

    public void run(){
        String xyLocation;
        int xAxis;
        int yAxis;
        do {
             xAxis = scanner.getAbsoluteRange("Açmak istediğiniz satır numarasını giriniz (1 ile "+ sweeperColumnCount +" arasında) : "  ,1,
                    sweeperRowCount) -1;
             yAxis = scanner.getAbsoluteRange("Açmak istediğiniz sütun numarasını giriniz ( 1 ile "+ sweeperColumnCount + " arasında) : ",1,
                    sweeperColumnCount) -1;
            xyLocation = String.valueOf(xAxis) + String.valueOf(yAxis);
            if (!isOpened(xAxis,yAxis)){
                openIndex(xAxis,yAxis);
                unopenedCount--;
                showMineSweeper(visibleSweeper);
            }
            else {
                System.out.println("Bu konum açılmıştır. Başka bir konum giriniz.");
            }
        }while (!isMineHere(xyLocation) && !isWin());
        if (isWin())
            System.out.println("Kazandınız!");
        else
            System.out.println("Kaybettiniz!");
        showMineSweeper(getInvisibleSweeper());

    };

    public boolean isWin(){
        return unopenedCount <= 0;
    }

    public void openIndex(int x, int y){
        if (!isOpened(x,y)){
            int mineCountAround = areThereMinesAround(x,y);
            visibleSweeper[x][y] = String.valueOf(mineCountAround);
        }
        else
            System.out.println("Bu konum açılmıştır. Başka bir konum giriniz.");
    }

    public boolean isOpened(int x, int y){
        return visibleSweeper[x][y].equals("-") ? false : true;
    }
}
