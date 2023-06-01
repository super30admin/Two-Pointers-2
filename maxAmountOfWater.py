class Solution:
    def maxArea(self, height: list[int]) -> int:
        if height == None or len(height)==0:
            return 0
    
        left = 0
        right = len(height)-1
        Max=0
        while left < right:
            Max= max(Max,min(height[left],height[right])*(right-left))
            if height[left]<=height[right]:
                left+=1
            else:
                right-=1
        return Max
    
    
    
#time complexity -> O(n)
#space complexity -> O(1)