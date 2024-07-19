import java.util.*;
public class BoundaryTraversalOfMatrix {

    public static ArrayList<Integer> boundaryTraversal(int[][] matrix, int n, int m)
    {

        ArrayList<Integer> list = new ArrayList<Integer>();

        if(n==1)
        {
            int i=0;
            for(int j=0;j<m;j++)
            {
                list.add(matrix[i][j]);
            }

            return list;
        }

        if(m==1)
        {
            int j=0;
            for(int i=0;i<n;i++)
            {
                list.add(matrix[i][j]);
            }

            return list;
        }

        int i=0;
        int k=m-1;
        int l=0;

        for(int j=0;j<m;j++)
        {
            list.add(matrix[i][j]);
        }

        i++;

        while(i<n-1)
        {
            list.add(matrix[i][k]);
            i++;
        }

        for(l=m-1;l>=0;l--)
        {
            list.add(matrix[i][l]);
        }

        l++;
        i--;

        while(i>0)
        {
            list.add(matrix[i][l]);
            i--;
        }

        return list;
    }
    public static void main(String[] args) {

        int[][] matrix =  {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};

        int n = matrix.length;
        int m = matrix[0].length;

        ArrayList<Integer> res = boundaryTraversal(matrix, n, m);

        System.out.println(res);


    }
}
