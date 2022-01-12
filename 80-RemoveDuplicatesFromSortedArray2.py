class Solution:
    def removeDuplicates(self, nums: List[int]):
        x,y,z=0,1,2
        while(z<len(nums)):
            if nums[x] == nums[y] and nums[y] == nums[z]:
                nums.remove(nums[x])
            else:
                x += 1
                y += 1
                z += 1
                
                
# T.C => O(n)
# S.C => O(1)
#approach => Here three pointers are inatialized at the index 0,1,2.
#  Since array is sorted and if all the three elements are same just remove one element from starting index. 
# Continue this process until the last index appears till the last of the array