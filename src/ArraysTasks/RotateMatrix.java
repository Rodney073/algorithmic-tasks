package ArraysTasks;

public class RotateMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        rotateMatrix(matrix);
    }

    private static int[][] rotateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                System.out.print(matrix[j][matrix.length-1-i]+" ");
            }
            System.out.println();
        }
        return matrix;
    }

}
