# Not discussed in class yet, hence the brute force approach

# // Time Complexity : O(n^2), as the pop() in array takes O(n) time
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Problems, if any? No

# // Your code here along with comments explaining your approach
# 1. Start a counter that keeps count of the elements up until 2
# 2. if the element is encountered more than twice, pop out that element, and reduce xurrent index value by 1
# 3. reset the counter to one if the value of previous element is not equal to current element
# 4. increase the counter and repeat until the whole nums array is traversed. 

class Solution:
    
    def removeDuplicates(self, nums: List[int]) -> int:
        
        cnt = 1
        i = 1
        
        while i< len(nums):
            if nums[i-1] == nums[i]:
                cnt +=1
                if cnt >= 3:
                    nums.pop(i)
                    i -= 1
            else:
                cnt = 1
            
            i+=1
            
        return len(nums)