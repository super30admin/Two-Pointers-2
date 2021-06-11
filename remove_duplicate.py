# Time Complexity : O(n)
# Space COmplexity: O(1)
class Solution(object):
    def removeDuplicates(self, nums):
        #         initialize the pointers starting from 2nd element in an array and count as 1
        i = 1
        j = 1
        count = 1
        k = 2
        #         we will iterate untill both the pointers are less than length of an array
        while i < len(nums) and j < len(nums):
            # if current index element is same as previous element update the count
            if nums[i] == nums[i - 1]:
                count += 1
            #         if not then the current element must be new element so update count as 1
            else:
                count = 1
            # after getting count check if the current count is less than or equal to 2 (as we are allowed only 2 duplicates)
            # update the slow pointer (j) index with fast pointer(i)
            if count <= k:
                nums[j] = nums[i]
                j += 1
            #             update fast pointer at every iteration
            i += 1
        #     return the slow pointer index as it will be the number with allowed duplicate in array
        return j

        """
        :type nums: List[int]
        :rtype: int
        """
