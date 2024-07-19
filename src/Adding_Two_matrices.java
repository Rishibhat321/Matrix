
public class Adding_Two_matrices {

    public static int[][] sumMatrix(int[][] A, int[][] B)
    {

        if (A.length != B.length || A[0].length != B[0].length) {
            return new int[0][0]; // returning empty matrix if dimensions are different.
        }

        int n = A.length;
        int m = A[0].length;

        // creating a new matrix to store the result.
        int[][] res = new int[n][m];

        // traversing each cell and adding corresponding elements of A and B.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = A[i][j] + B[i][j];
            }
        }

        return res;

    }

    public static void printMatrix(int[][] output){

        for(int i=0;i<output.length;i++)
        {
            for(int j=0;j<output[0].length;j++)
            {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] A = {{1, 2, 3},
                {4, 5, 6}};

        int[][] B = {{1, 3, 3},
                {2, 3, 3}};

        int[][] output =  sumMatrix(A, B);

        // Print the resultant matrix

        System.out.println("The output is: ");

        printMatrix(output);




    }
}