class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int army = nums[0];

        for(int member: nums){
            if(army==member) count+=1;
            else if(count!=0) count-=1;
            else army = member;
        }

        int actualCount = 0;
        for(int member:nums){
            if(army==member) actualCount+=1;
        }

        if(actualCount<n/2) return -1;

        return army;
    }
}