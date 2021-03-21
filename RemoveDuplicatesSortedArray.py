"""
TC: O(n)
SC: O(1)
Leetcode: Success!
Problem: None except how does it work behind the scene to return the desired nums array in O(1) space????.
"""

class Solution:
    def removeDuplicates(self, nums) -> int:
        # Initialize pointer, fast: i and slow: j
        i = 1
        j = 1

        # Initialize Counter count = 1
        count = 1
        n = len(nums)
        # Out conditions to traverse through nums
        while(i<n):

            # check if the prev element is equal to the current element
            # if True: increment Counter
            # else: Reset Counter to 1
            if nums[i]==nums[i-1]:
                count += 1
            else:
                count = 1

            # Check the condition for at most 2 duplicates k = 2
            if count <= 2:
                nums[j]=nums[i]
                j +=1
            i += 1
        self.displayArray(nums,j)
        #print("After: ",nums)
        # Return j to indicate the new length of the changed nums | elements only till j to be considered
        return j

    def displayArray(self, arr, n):
        #print("Array::::::",arr)
        res = []
        for i in range(n):
            res.append(arr[i])
        print("New Array:",res," of length ", n)
        pass


s = Solution()

nums = [1,1,1,2,2,3]
nums = [0,0,1,1,1,1,2,3,3]
print("Before: ",nums)
s.removeDuplicates(nums)

