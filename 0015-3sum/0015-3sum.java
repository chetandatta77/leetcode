class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        int i = 0;
        int j = i+1;
        int k = nums.length-1;
        while( i< nums.length-2){


            int total = nums[i]+nums[j]+nums[k];
            if(total<0){
                j+=1;
            } else if(total>0){
                k-=1;
            } else{
                List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
                set.add(triplet);
                j+=1;
                k-=1;
            }

            // while(j<k && nums[j]==nums[j+1]) j++;
            // while(j<k && nums[k-1]==nums[k]) k--;

            if(j>=k){
                i++;
                j = i+1;
                k = nums.length-1;
            } 
        }

        return new ArrayList<>(set);
    }
}