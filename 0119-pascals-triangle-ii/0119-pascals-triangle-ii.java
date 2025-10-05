class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 0; row<=rowIndex; row++)
        {
            List<Integer> currrow = new ArrayList<>();
            
            for(int col=0;col<row+1;col++)
            {
                if(col==0||col==row)
                {
                    currrow.add(1);
                }
                else
                {
                    int val = ans.get(row-1).get(col-1)+ ans.get(row-1).get(col);
                    currrow.add(val);
                }
            }
            ans.add(currrow);
        }
        
        return ans.get(rowIndex);
    }
}