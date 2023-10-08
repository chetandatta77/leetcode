class Solution {
    public int maxSubArray(int[] nums) {
        int acc = nums[0];
        int ans = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(acc+nums[i]>nums[i]) {
                acc+=nums[i];
            } else{
                acc = nums[i];
            }
            ans = Math.max(ans,acc);
            // System.out.println(ans+" "+ acc);
        }
        return ans;
    }

}