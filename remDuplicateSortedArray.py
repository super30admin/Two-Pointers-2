# // Time Complexity : O(n) for traversal
# // Space Complexity :O(1) for no extra space
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# We have to remove duplicate eliments in an array while keeping atleast k copies and not beyond k.
# We initialize a slow pointer and a fast pointer. slow pointer will be where the swapping will happen and fast point will check the element.
# if we find the same element previosuly we will now check the count,( if c > k  elsif count < k swap s++) . fast pointer keeps moving.
# finally we return SLOW pointer index. // also check k-2 i algorithm.

# // Your code here along with comments explaining your approach
class Solution:
    def removeDuplicates(self, nums: list[int]):
        # hmap = {}
        # dont use hmap it is wrong use algorithms
        n =len(nums)
        s,f = 0,0
        target = 2
        count = 0
        while f < n:                                # fast inbound of maxsize
            if f > 0 and nums[f] == nums[f-1]:      # if same keep counter
                count +=1
            else:
                count = 1
            
            if count <= target:                     # count <= 2 -> swap; count > 2: pass
                nums[s] = nums[f]
                s+=1
            f+=1                                    #fast moves on every step
        return s