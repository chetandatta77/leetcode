class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        int count1 = 0;
        int count2 = 0;

        int army1 = nums[0];
        int army2 = nums[0];

        for(int i=0; i<n; i++){
            if(count1==0 && nums[i]!=army2){
                army1=nums[i];
                count1+=1;
            } 
            else if(count2==0 && nums[i]!=army1){
                army2=nums[i];
                count2+=1;
            }
            else if(army1==nums[i]) count1+=1;
            else if(army2==nums[i]) count2+=1;
            else{
                count1-=1;
                count2-=1;
            }
        }

        List<Integer> ans = new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0; i<n; i++){
            if(nums[i]==army1) count1+=1;
            else if(nums[i]==army2) count2+=1;
        }

        if(count1>n/3)
            ans.add(army1);
        if(count2>n/3)
            ans.add(army2);

        return ans;
    }
}