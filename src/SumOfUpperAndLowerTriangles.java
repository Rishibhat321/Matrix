import java.util.*;
public class SumOfUpperAndLowerTriangles {

    public static ArrayList<Integer> sumTriangles(int[][] matrix, int n)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();

        int sum_upper=0,sum_lower=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                sum_upper += matrix[i][j];
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                sum_lower += matrix[i][j];
            }
        }

        list.add(sum_upper);
        list.add(sum_lower);

        return list;
    }
    public static void main(String[] args) {

        int[][] matrix = {{6, 5, 4},
                {1, 2, 5},
                {7, 9, 7}};

        int n = matrix.length;

        ArrayList<Integer> res = sumTriangles(matrix,n);

        System.out.println(res);
    }
}
