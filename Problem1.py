# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self,nums):
        if not nums:
            return 0 
        j, count = 1, 1 
        maximumRepAllowed = 2 # maximum 2 repitition allowed. 
        for i in range(1,len(nums)): # because first element will be unique.
            if nums[i] == nums[i-1]:
                count += 1 
            else:
                count = 1 
            if count <= maximumRepAllowed:
                nums[j] = nums[i] 
                j += 1 
        return j

if __name__ == "__main__":
    s = Solution()
    nums = [0,0,1,1,1,1,2,3,3,4,5,5,5,6,7,8]
    res = s.removeDuplicates(nums)
    print("length",res)
    print(nums[:res])
