'''
Time complexity: O(n)
Space complexity: O(1)
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)== 1:
            return 1
        p1 = 1
        p2 = 1 
        count = 1

        while p2 < len(nums):
            if nums[p2] == nums[p2-1]:
                count += 1

                if count <=2:
                    nums[p1] = nums[p2]
                    p1 +=1 
                    p2 +=1 
                else:
                    p2 +=1 

            else:
                nums[p1] = nums[p2]
                count = 1
                p1 +=1 
                p2 +=1 
        return p1 
        