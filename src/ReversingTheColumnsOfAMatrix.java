public class ReversingTheColumnsOfAMatrix {

   public static void reverseCol(int[][] matrix)
    {
        int row = matrix.length;
        int col = matrix[0].length;

        if(col==1)
        {
            return;
        }

        for(int i=0;i<row;i++)
        {
            int low=0,high=col-1;

            while(low<high)
            {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;

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

       int[][] matrix = {{ 1, 2, 3, 4, 5},
               { 6, 7, 8, 9, 10}};

       reverseCol(matrix);

        System.out.println("The resultant matrix is: ");

        printMatrix(matrix);
    }
}
