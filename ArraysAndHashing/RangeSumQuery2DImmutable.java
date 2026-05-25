package ArraysAndHashing;

import java.util.*;

public class RangeSumQuery2DImmutable {
    private int[][] matrix;

    public RangeSumQuery2DImmutable(int[][] matrix) {
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] grid = new int[rows][cols];

        // 2. Populate the matrix
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // Initialize the object with user data
        RangeSumQuery2DImmutable numMatrix = new RangeSumQuery2DImmutable(grid);

        // 3. Get query coordinates
        System.out.println("\n--- Define your Sum Region ---");
        System.out.print("Enter row1: ");
        int row1 = scanner.nextInt();
        System.out.print("Enter col1: ");
        int col1 = scanner.nextInt();
        System.out.print("Enter row2: ");
        int row2 = scanner.nextInt();
        System.out.print("Enter col2: ");
        int col2 = scanner.nextInt();

        // 4. Calculate and output result
        int result = numMatrix.sumRegion(row1, col1, row2, col2);
        System.out.println("The sum of the region is: " + result);

        scanner.close();
    }

}
