class Solution {
    public long countCommas(long n) {
        if(n<999)return 0;
        long sum = 0;
        long startrange = 1000;
        while(startrange<=n){
            sum+=n-startrange+1;
            startrange*=1000;
        }
        return sum;
    }
}