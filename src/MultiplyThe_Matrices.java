public class MultiplyThe_Matrices {

   public static int[][] multiplyMatrix(int[][] A, int[][] B)
    {
        if(A[0].length!=B.length)
        {
            return new int[0][0];
        }

        int m=A.length;
        int n= B[0].length;

        int p=B.length;

        int[][] res= new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i][j]=0;

                for(int k=0;k<p;k++)
                {
                    res[i][j] = res[i][j] + A[i][k]*B[k][j];
                }
            }
        }

        return res;
    }

    public static void printMatrix(int[][] output)
    {
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

       int[][] A = {{4, 8},
               {0, 2},
               {1, 6}};

       int[][] B =  {{5, 2},
               {9, 4}};

       int[][] output = multiplyMatrix(A, B);

        System.out.println("The resultant matrix after multiplication is: ");

        printMatrix(output);

    }
}
