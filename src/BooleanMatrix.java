public class BooleanMatrix {

   public static void booleanMatrix(int[][] matrix)
    {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][] arr = new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==1){
                    for(int k=0; k<m; k++){
                        arr[k][j] = true;
                    }
                    for(int p=0; p<n; p++){
                        arr[i][p] = true;
                    }
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==true){
                    matrix[i][j] = 1;
                }
            }
        }

    }

    public static void printResultant(int[][] matrix)
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

       int[][] matrix = {{ 1, 0, 0},
               { 1, 0, 0},
               { 1, 0, 0},
               { 0, 0, 0}};


        booleanMatrix(matrix);

        System.out.println("The resultant matrix is: ");

        printResultant(matrix);

    }
}
