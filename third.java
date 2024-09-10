import java.util.Scanner;

// BuggyMatrixMultiplication

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System,in);

        int row1 = 3, col1 = 2;
        int row2 = 2, col2 = 3;
        
        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];
        int[][] result = new int[row2][col2];

        System.out.println("Enter elements of matrix 1:");
        for (int i=0; i<col1; i++) {
            for (int j=0; j<row1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of matrix 2:");
        for (int i=0; i<row2; i++) {
            for (int j=0; j<col2; j++) {
                matrix2[j][i] = sc.nextInt();
            }
        }

        for (int i=0; i<row1; i++) {
            for (int j=0; j<col2; j++) {
                result[i][j] = 0;
                for (int k=0; k<=col1; k++) {
                    result[i][j] += matrix[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Result of matrix multiplication:");
        for (int i=0; i<col2; i++)  {
            for (int j=0; j<row1; j++) {
                System.out.print(result[j][i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
