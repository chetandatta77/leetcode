class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i=0; i< nums.length; i++){
            Set<Integer> tempSet = new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                int thirdValue = -(nums[i] + nums[j]);
                if(tempSet.contains(thirdValue)){
                    tempSet.remove(thirdValue);
                    List<Integer> triplet = Arrays.asList(nums[i],nums[j],thirdValue);
                    Collections.sort(triplet);
                    set.add(triplet);
                } else {
                    tempSet.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}