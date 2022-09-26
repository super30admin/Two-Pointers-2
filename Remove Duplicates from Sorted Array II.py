# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach

# hashmap approach-maintain key as elements and values as counters(for getting max 2)
# TC - O(n)
# SC - O(n)

# two pointers(slow-fast): move fast pointer for checking the no of occurance and if >2 then 
# move slow pointer and when unique ele found then swap with slow pointer
# TC - O(n)
# SC - O(1)

def removeDuplicates(self, nums: List[int]) -> int:
    if nums == None or len(nums) == 0:
        return 0
    
    count = 1
    slow = 1
    fast = 1
    for fast in range(1,len(nums)):
        if nums[fast] == nums[fast-1]:
            count += 1
        else:
            count = 1
        if count <= 2: #count<= k(in general because here in the question k=2)
            nums[slow] = nums[fast]
            slow += 1
    return slow