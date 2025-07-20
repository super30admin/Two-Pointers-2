# Time Complexity : It is O(n) since we are iterating length of the list.
# Space Complexity : It is O(1) not creating the extra.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : traversing from n lenght to 0. Comparing two values whichever is greater place that value.

from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        if len(nums2) ==0:
            return nums1
        num1Length = len(nums1)
        num2Length = len(nums2)
        validNumberLength = num1Length-num2Length -1
        
        for i in range(m+n -1,0,-1):  
            if m ==0:
                break          
            if nums1[validNumberLength] < nums2[num2Length-1]:
                nums1[i]=nums2[num2Length-1]
                num2Length=num2Length-1
                if num2Length <=0:
                    break
            else:
                nums1[i] = nums1[validNumberLength]
                validNumberLength=validNumberLength-1
                if validNumberLength < 0:
                    break
        
        for i in range(num2Length):
            validNumberLength=validNumberLength+1               
            nums1[validNumberLength]=nums2[i] 
        
              
        return nums1
        
        
obj = Solution()
print(obj.merge([0,0,0,0,0],0,[1,2,3,4,5],5))
# print(obj.merge([1,2,3,0,0,0],3,[4,5,6],3))
# print(obj.merge([4,0,0,0,0,0],1,[1,2,3,5,6],5))
# print(obj.merge([3,4,0,0,0,0],2,[2,3,5,6],4))
# print(obj.merge([1,2,3,0,0,0],3,[2,5,6],3))
# print(obj.merge([1],1,[],0))
# print(obj.merge([4,5,6,0,0,0],3,[1,2,3],3))