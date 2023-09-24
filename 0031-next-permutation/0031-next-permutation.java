class Solution {
   public void nextPermutation(int[] nums) {
        int pivot = -1;

        // Find the pivot
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i-1]) {
                pivot = i - 1;
                break;
            }
        }
        
        if (pivot == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Find the first element that is larger than pivot
        int firstLarger = -1;
        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                firstLarger = i;
                break;
            }
        }

        // Swap pivot and firstLarger
        swap(nums, pivot, firstLarger);

        // Reverse the subarray after pivot
        reverse(nums, pivot + 1, nums.length - 1);
        return;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
        return;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i++] = nums[j];
        nums[j--] = tmp;
        return;
    }
}