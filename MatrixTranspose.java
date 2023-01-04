import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixTranspose(int[][] matrix)
    {
        int rows;
        int columns;
        int [][] transposeMatrix;

        rows = matrix.length;
        columns =  matrix[0].length;

        transposeMatrix  = new int[columns][rows];
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }
    public static void main(String[] args) {
        int[][] m;
        int rows;
        int columns;

        Scanner s = new Scanner(System.in);
        
        System.out.println("Transpozu alinacak matrixin sira sayisini giriniz.");
        rows = s.nextInt();
        System.out.println("Transpozu alinacak matrixin sutun sayisini giriniz.");
        columns = s.nextInt();

        m = new int[rows][columns];

        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                System.out.println("Bir deger giriniz.");
                m[i][j] = s.nextInt();
            }
        }

        System.out.println("Girilen matrix.\n");
        printMatrix(m);

        int[][] t = matrixTranspose(m);
        
        System.out.println("\nTranspose matrix.\n");
        printMatrix(t);
    }
}
