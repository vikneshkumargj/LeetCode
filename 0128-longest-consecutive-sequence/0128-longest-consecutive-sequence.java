class Solution {
    public int longestConsecutive(int[] nums) {
       int n = nums.length;
       if(n==0)return 0;
       int cnt=1;
       int longest = 1;
       HashSet<Integer> map = new HashSet<>();
       for(int i=0;i<n;i++){
        map.add(nums[i]);
       } 

       for(int num : map){
        if(!map.contains(num-1)){
            int x = num;
            cnt = 1;
        
        while(map.contains(x+1)){
            cnt++;
            x=x+1;
        }
        }
        longest = Math.max(longest,cnt);
       }
       return longest;
    }
}