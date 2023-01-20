#80. Remove Duplicates from Sorted Array II


# using Two pointers
# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No 
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n= len(nums)
        if nums == None or n == 0:return 0
        p1 = 0 # slow pointer
        p2 = 0 # fast pointer
        k = 2 # find apearing 
        count = 1
        for p2 in range(n):
            if p2 > 0 and nums[p2-1] == nums[p2]: # if same number faster pointer ++
                count +=1
            else: count = 1
            if count<=k:
                nums[p1] = nums[p2]
                p1 +=1
        return p1




#2 # using hashmap
# // Time Complexity : 2n -> O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No 


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n= len(nums)
        hashmap = dict() #space; O(n)
        k = 2
        for i in nums: #O(n)
            if i in hashmap:
                hashmap[i] = hashmap[i]+1
            else:
                hashmap[i] = 1
        i = 0
        for key in hashmap:# O(n)
            print(key)
            if hashmap[key] >= k:
                for _ in range(k):
                    nums[i] = key
                    i+=1
            else:
                for _ in range(hashmap[key]):
                    nums[i] = key
                    i+=1
        return i