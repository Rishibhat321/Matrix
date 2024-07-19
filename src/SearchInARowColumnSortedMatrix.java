public class SearchInARowColumnSortedMatrix {

    public static boolean search(int[][] matrix, int n, int m, int x)
    {
        // only one row

        if(n==1){

            for(int i=0;i<m;i++)
            {
                if(matrix[0][i]==x)
                {
                    return true;
                }
            }
        }

        if(m==1)
        {
            for(int i=0;i<n;i++)
            {
                if(matrix[i][0]==x)
                {
                    return true;
                }
            }
        }

        int i=0,j=m-1;

        while(i<n && j>=0)
        {
            if(matrix[i][j]==x)
            {
                return true;
            }

            else if(matrix[i][j]<x)
            {
                i++;
            }
            else{
                j--;
            }
        }

        return false;
    }
    public static void main(String[] args) {

  /*     int[][] matrix = {{18, 21, 27},
                           {38, 55, 67}};

       int x = 55;
       int n = matrix.length;
       int m = matrix[0].length; */


        int[][] matrix = {{ 3, 30, 38},
                          {36, 43, 60},
                          {40, 51, 69}};

        int n = matrix.length;
        int m = matrix[0].length;
        int x = 62;

        boolean res = search(matrix, n, m, x);

        if(res){
            System.out.println("Element exists");
        }
        else{
            System.out.println("Element does not exists");
        }


    }
}
