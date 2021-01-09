class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        pointer1, pointer2 = 0, 0
        
        nums = []
        while pointer1 < m and pointer2 < n:
            if nums1[pointer1] <= nums2[pointer2]:
                nums.append(nums1[pointer1])
                pointer1 += 1
            else:
                nums.append(nums2[pointer2])
                pointer2 += 1
        
        while pointer1 < m:
            nums.append(nums1[pointer1])
            pointer1 += 1
        while pointer2 < n:
            nums.append(nums2[pointer2])
            pointer2 += 1
        
        for i in range(len(nums)):
            nums1[i] = nums[i]
        
        return