from pip import List
#Time Complexity = O(n)
#Space Complexity = O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        n = len(nums)
        low, mid, high = 0,0,n-1
        while(low<high and mid<=high):
            if(nums[mid]==0):
                nums[low], nums[mid]= nums[mid], nums[low]
                low+=1
                mid+=1
            elif(nums[mid]==1):
                mid+=1
            else:
                nums[mid], nums[high] = nums[high], nums[mid]
                high-=1
        
        
        