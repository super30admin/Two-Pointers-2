"""
Make use of slow pointer i to track the position of valid elements.
For each number n in the array, if i < 2 or n > nums[i - 2], enter n at nums[i].
Return i which is the new length of the updated array.
"""
"""
Time Complexity:  O(n) - Single Pass
Space Complexity: O(1) (in-place)
"""

class removeDup:
    def removeDuplicates(self, nums: list[int]) -> int:
        i = 0
        for n in nums:
            if i < 2 or n > nums[i - 2]:
                nums[i] = n
                i += 1
        return i
        
    
if __name__=="__main__":
    obj = removeDup()
    nums = [1,1,1,2,2,3]
    print(obj.removeDuplicates(nums))
