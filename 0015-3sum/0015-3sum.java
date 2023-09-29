class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if(i>0 && nums[i-1]==nums[i]) continue;

            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int total = nums[i] + nums[j] + nums[k];

                if(total<0) {
                    j+=1;
                } else if(total > 0) {
                    k-=1;
                } else {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                    set.add(triplet);
                    j+=1;
                    k-=1;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }

        }
        return new ArrayList<>(set);
    }
}