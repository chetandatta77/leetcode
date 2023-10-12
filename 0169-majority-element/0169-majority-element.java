class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int key: nums){
            if(!freqMap.containsKey(key)){
                freqMap.put(key, 0);
            }
            int value = freqMap.get(key);
            freqMap.put(key, value+1);
        }

        for(int key: freqMap.keySet()){
            int value = freqMap.get(key);
            if(value>n/2) return key;
        }
        return -1;
    }
}