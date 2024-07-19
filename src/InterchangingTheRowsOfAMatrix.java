public class InterchangingTheRowsOfAMatrix {

    public static void interchangeRows(int[][] matrix)
    {
        int row = matrix.length;
        int col = matrix[0].length;

        if(row==1){
            return;
        }

        for(int i=0;i<col;i++){

            int low=0,high=row-1;

            while(low<high){
                int temp = matrix[low][i];
                matrix[low][i] = matrix[high][i];
                matrix[high][i] = temp;

                low++;
                high--;
            }
        }
    }

    public static void printMatrix(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {13, 14, 15}};

        interchangeRows(matrix);

        System.out.println("Resultant matrix is: ");

        printMatrix(matrix);


    }
}
