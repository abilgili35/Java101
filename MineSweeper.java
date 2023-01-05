import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    
    private int rowCount;
    private int columnCount;
    private int mineCount;
    private int[][] gameBoard;


    private void initializeGameBoard(){
        this.gameBoard = new int[this.rowCount][this.columnCount];
        for(int i=0; i<this.rowCount; i++)
        {
            for(int j=0; j<this.columnCount; j++){
                gameBoard[i][j] = -1;
            }
        }
    }

    public void printBoard(int[][] matrix){
        
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] < 0){
                    System.out.print("- ");
                }
                else{
                    System.out.print(matrix[i][j] + " ");
                }
                
            }
            System.out.println();
        }
    
    }

    public void printMines(int[][] matrix){
        System.out.println("Mayinlarin Konumu");
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == -2)
                {  
                    System.out.print("* ");
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        for(int k=0; k<30; k++){
            System.out.print("=");
        }
        System.out.println();

    }

    private void setMineLocations(){
        
        Random r = new Random();
        int row;
        int column;
        
        this.mineCount = (int)Math.floor((this.rowCount * this.columnCount)/4);
        System.out.println(mineCount);

        int i = 0;
        while(i < mineCount){
            row = Math.abs(r.nextInt() % this.rowCount);
            column = Math.abs(r.nextInt() % this.columnCount);
            if(!(this.gameBoard[row][column] == -2))
            {
                this.gameBoard[row][column] = -2;
                i++;
            }
        }
        }
    
    private boolean playTurn(){
        Scanner s = new Scanner(System.in);
        int row;
        int column;

        System.out.println("Satir giriniz.");
        row = s.nextInt();
        System.out.println("Sutun giriniz.");
        column = s.nextInt();

        if( (row >= this.rowCount) || (column >= this.columnCount)){
            System.out.println("Gecersiz koordinat!");
            return false;
        }
        else{
            if(this.gameBoard[row][column] == -2){
                loseGame();
                return false;
            }else if(this.gameBoard[row][column] == -1){
                this.gameBoard[row][column] = getMineCount(row, column);
                return true;
            }else{
                System.out.println("Bu koordinat için daha önce deger girildi.");
                return false;
            }
        }
    }

    private int getMineCount(int r, int c){
        int rowStart;
        int columnStart;
        int rowEnd;
        int columnEnd;
        int mineCount=0;

        if(r == 0)
        {
            rowStart = 0;
        }
        else{
            rowStart = r -1;
        }

        if(c == 0){
            columnStart = 0;
        }
        else{
            columnStart = c -1;
        }

        if(r == (this.rowCount - 1)){
            rowEnd = this.rowCount - 1;
        }
        else
        {
            rowEnd = r + 1;
        }

        if(c == (this.columnCount-1)){
            columnEnd = this.columnCount - 1;
        }
        else{
            columnEnd = c + 1;
        }

        for(int i=rowStart; i<=rowEnd; i++)
        {
            for(int j=columnStart; j<=columnEnd; j++){
                if((i == r) && (j == c)){
                    continue;
                }
                if(this.gameBoard[i][j] == -2)
                {
                    mineCount++;
                }
            }
        }

        return mineCount;
    }

    private void loseGame(){
        System.out.println("Game Over!");
        System.exit(0);
    }

    private void winGame(){
        System.out.println("Oyunu Kazandiniz!");
        printBoard(gameBoard);
        System.exit(0);
    }

    public void run(){
        int remainingTurns = (this.rowCount * this.columnCount) - this.mineCount;

        printMines(gameBoard);

        System.out.println("Mayin tarlasi oyununa hos geldiniz.");

        while(remainingTurns > 0)
        {   
            printBoard(gameBoard);
            if(playTurn()){
                remainingTurns--;
            }
            for(int k=0; k<30; k++){
                System.out.print("=");
            }
            System.out.println();
            
        }
        winGame();
    }
    

    public MineSweeper(int rowCount, int columnCount)
    {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        initializeGameBoard();
        setMineLocations();
    }
}
