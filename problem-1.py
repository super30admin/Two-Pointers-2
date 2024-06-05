# Time Complexity
# O(n)
# Space Complexity
# O(1)


# Approach :

# initialize a count value to 1 and j to 1
# check if i and i-1th index is same, if yes increment count else make count =1
# if count is less than or equal to 2, assign arr[j]=arr[i] and increment j
# if duplicates are more than 2, after count has exceeded the value 2, just increment i, and keep j as it is
# upon the next new element, move it to jth index


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        if not nums:
            return -1

        count = 1
        j = 1

        for i in range(1, len(nums)):

            if nums[i] == nums[i-1]:
                count = count+1
            else:
                count = 1

            if (count <= 2):
                nums[j] = nums[i]
                j = j+1

        return j
