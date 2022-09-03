"""
Time Complexity : O(n) where n is the array length
Space Complexity : O(n) where n is the number of elements in the array
Did this code successfully run on Leetcode : Yes
Three line explanation of solution in plain english : 
Brute Force : Create an Hashmap to store the frequency of the numbers.
              Replace the elements in the array by referring to the hashmap. Maximum 2 elements if more than 2 elements are present or if less than 2 then its actual value
              Keep the counter and increment +2 if frequence > 2 or by 1 otherwise. Return the counter
"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return []
        hashMap = {}
        index = 0
        k = 0
        for i in range(len(nums)):
            if nums[i] not in hashMap.keys():
                hashMap[nums[i]] = 1
            else:
                hashMap[nums[i]] = hashMap[nums[i]] + 1
        print(hashMap)
        for key, value in hashMap.items():
            if value >= 2:
                nums[index] = key
                nums[index+1] = key
                index += 2
                k += 2
            else:
                nums[index] = key
                index += 1
                k += 1
        return k
                
        
                
                

