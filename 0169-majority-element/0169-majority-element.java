class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int votes = 0;
        int leader = nums[0];

        for(int member: nums){
            if(member==leader) votes+=1;
            else if(votes!=0) votes-=1;
            else leader = member;
        }
        return leader;
    }
}