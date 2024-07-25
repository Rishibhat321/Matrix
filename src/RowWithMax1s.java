public class RowWithMax1s {
    public static int rowWithMax1s(int[][] arr) {

        int row = arr.length;
        int col = arr[0].length;
        int c = 0;
        int res = 0;
        int index = -1;


        for(int i=0;i<row;i++)
        {
            c=0;
            for(int j=col-1;j>=0;j--)
            {
                if(arr[i][j]==1){
                    c++;
                }
                else{
                    break;
                }
            }

            if(res<c){
                index = i;
                res= c;
            }

        }

        return index;
    }
    public static void main(String[] args) {

        int[][] matrix = {{0, 1, 1, 1},
                          {0, 0, 1, 1},
                          {1, 1, 1, 1},
                          {0, 0, 0, 0}};

        int res = rowWithMax1s(matrix);

        System.out.println(res);

    }
}
