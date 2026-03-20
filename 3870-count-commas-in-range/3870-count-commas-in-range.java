class Solution {
    public int countCommas(int n) {
        int count =(int) Math.log10(n)+1;
        int comma=0;
        if(count<4)return 0;
        else
        {
            for(int i=1000;i<=n;i++)
            {
                comma++;
            }
        }
        return comma;
    }
}