public class negativesinamatrix{
    public static int countNegatives(int[][] grid) {
        int count=0;
        int n=grid[0].length;
        for(int row[]:grid)
        {

            int s=0;
            int e=n-1;
            while(s<=e)
            {
                int m=(s+e)/2;
                if(row[m]<0)
                {
                    e=m-1;
                }
                else
                {
                    s=m+1;
                }
            }
            count=count+(n-s);

        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        countNegatives(grid);
    }
}

