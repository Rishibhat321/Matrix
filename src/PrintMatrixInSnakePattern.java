import java.util.*;
public class PrintMatrixInSnakePattern {

  public static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int m= matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<n;j++)
                {
                    list.add(matrix[i][j]);
                }
            }

            else
            {
                for(int j=n-1;j>=0;j--)
                {
                    list.add(matrix[i][j]);
                }
            }
        }

        return list;

    }
    public static void main(String[] args) {

      int[][] matrix = {{45, 48, 54},
              {21, 89, 87},
              {70, 78, 15}};

      ArrayList<Integer> res = snakePattern(matrix);

        System.out.println(res);

    }
}
