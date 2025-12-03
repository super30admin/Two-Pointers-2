'''
In this problem I took 2 pointers, stating both the pointers at index 1.
For i pointer I am moving for every element and comparing it with before element to check the uniqueness.
For slowPointer I am moving it only when the elements are repeated not more than twice and placing them at the begining of the same array.
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slowPointer = 1
        count = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                # placing unique elements at the slow pointer position
                nums[slowPointer] = nums[i]
                slowPointer += 1
        return slowPointer
        
'''
Time Complexity: O(n)
I am iterating on the array of length n once, which would take O(n) time
Space Complexity: O(1)
I am not using any extra space, I am placing the elements in the begining of the same array.
'''