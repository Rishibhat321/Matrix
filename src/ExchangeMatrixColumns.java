public class ExchangeMatrixColumns {

    public static void exchangeColumns(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (col == 1) {
            return;
        }

        int low = 0, high = col - 1;

        for (int i = 0; i < row; i++) {

            int temp = matrix[i][low];
            matrix[i][low] = matrix[i][high];
            matrix[i][high] = temp;
        }
    }

    public static void main(String[] args) {

        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};

        exchangeColumns(mat);

        System.out.println("Resultant matrix is: ");

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }

    }
}
