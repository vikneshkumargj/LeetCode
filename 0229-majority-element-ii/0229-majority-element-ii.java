class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0;
        int ele1 = -1;
        int count2 = 0;
        int ele2 = -1;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(count1==0 && (ele2 != nums[i])){
                ele1 = nums[i];
                count1=1;
            }
            else if(count2==0 && (ele1 != nums[i])){
                ele2 = nums[i];
                count2=1;
            }
            else if(nums[i] == ele1){
                count1++;
            }
            else if(nums[i] == ele2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1){
                count1++;
            }
            if(nums[i]==ele2)count2++;
        }
        if(count1>(n/3))ans.add(ele1);
        if(count2>(n/3) && ele1 != ele2)ans.add(ele2);

        return ans;
    }
}