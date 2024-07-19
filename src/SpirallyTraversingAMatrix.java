import java.util.*;
public class SpirallyTraversingAMatrix {

   public static ArrayList<Integer> spirallyTraverse(int[][] matrix, int r, int c)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // only one row
        if(r==1)
        {
            for(int i=0;i<c;i++)
            {
                list.add(matrix[0][i]);
            }

            return list;
        }


        // only one column
        if(c==1)
        {
            for(int i=0;i<r;i++)
            {
                list.add(matrix[i][0]);
            }

            return list;
        }

        int top=0, bottom=r-1, right=c-1, left=0;

        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(matrix[top][i]);
            }

            top++;

            for(int i=top;i<=bottom;i++)
            {
                list.add(matrix[i][right]);
            }

            right--;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(matrix[bottom][i]);
                }

                bottom--;
            }

            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    list.add(matrix[i][left]);
                }

                left++;
            }
        }

        return list;
    }
    public static void main(String[] args) {

      int[][] matrix = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15,16}};

      int r = 4;
      int c = 4;

      ArrayList<Integer> res =  spirallyTraverse(matrix, r, c);

        System.out.println(res);


    }
}
