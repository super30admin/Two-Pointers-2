# APPROACH  1 : BRUTE FORCE SOLUTION
# Time Complexity : O(max(nums))
# Space Complexity : O(n), n: len(nums)
# Did this code successfully run on Leetcode : No (TIME LIMIT EXCEEDED)
# Any problem you faced while coding this : None (forgot that negative numbers can be there so second for loop shld start from min(nums) instead of default 0)
#
#
# Your code here along with comments explaining your approach
# 1. Build a hashmap - count of occurrence of unique elements
# 2. Go through hashmap in increasing order - for loop from min(nums) till max(nums) 
# 3. If hashmap count <= 2, place the element that many times in nums
#    Else, place the element twice in nums

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        if len(nums) < 1:
            return 0
        
        hashmap = defaultdict(int)
        for num in nums:
            hashmap[num] += 1
        
        curr_ptr = 0
        for key in range(min(nums), max(nums) + 1):
            if key in hashmap:
                if hashmap[key] <= 2:
                    nums[curr_ptr : curr_ptr + hashmap[key]] = [key for _ in range(hashmap[key])]
                    curr_ptr = curr_ptr + hashmap[key]
                else:
                    nums[curr_ptr : curr_ptr + 2] = [key for _ in range(2)]
                    curr_ptr = curr_ptr + 2
                
        return curr_ptr
        
        

# APPROACH 2: OPTIMAL SOLUTION
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Have 2 pointers - curr to go through nums and insert - indicate the position to insert the next valid element
# 2. As curr goes through, have count of current element
# 3. If counter > 2 and insert is not set yet, then set insert to curr
# 4. Else if counter <= 2 keep placing the valid elment on insert
# 5. Return insert as the new length (if insert was never set, maybe the nums is already satisfying the constarints, so return the length of nums itself).


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        counter, curr_ptr, insert_ptr = 1, 1, -1
        
        while curr_ptr < len(nums):
            if nums[curr_ptr] == nums[curr_ptr - 1]:
                counter += 1
            else:
                counter = 1
            
            if counter > 2 and insert_ptr == -1:
                insert_ptr = curr_ptr
            elif insert_ptr != -1 and counter <= 2:
                nums[insert_ptr] = nums[curr_ptr]
                insert_ptr += 1
                
            curr_ptr += 1
         
        if insert_ptr != -1:
            return insert_ptr
        
        elif len(nums) >= 1:
            return len(nums) 
