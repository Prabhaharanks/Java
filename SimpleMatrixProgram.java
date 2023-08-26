public class SimpleMatrixProgram {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        
        int[][] matrix = new int[rows][cols];
        
        // Populate the matrix with values
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value;
                value++;
            }
        }
        
        // Print the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
