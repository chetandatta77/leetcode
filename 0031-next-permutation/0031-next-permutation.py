class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        pivot = -1

        for i in range(len(nums)-1, 0,-1):
            if nums[i-1]<nums[i]:
                pivot = i
                break

        if pivot == -1:
            nums.sort()
            return
        
        # print(pivot)
        for i in range(len(nums)-1,pivot-1,-1):
            if nums[pivot-1]<nums[i]:
                # print(i)
                nums[pivot-1],nums[i] = nums[i], nums[pivot-1]
                break
        nums[pivot:] = sorted(nums[pivot:])