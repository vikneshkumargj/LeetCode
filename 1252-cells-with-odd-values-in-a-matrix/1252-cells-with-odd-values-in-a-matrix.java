class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        int count=0;
        for(int[] temp : indices)
        {
            int row = temp[0];
            int col = temp[1];
            for(int i=0;i<n;i++)
            {
                ans[row][i]++;
            }
            for(int i=0;i<m;i++)
            {
                ans[i][col]++;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ans[i][j] % 2 !=0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}