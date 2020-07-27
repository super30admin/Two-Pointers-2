#Two Pointers 2
#Problem1 : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
#All test cases passed on Leetcode
#Time Complexity-O(N)
#Space Complexity-O(1)

#Approach:
    # Take two pointers- slow and fast and one prev pointer for previous element and also boolean variable flag to check whether a duplicate has already
    # occurred while traversing.If prev and fast pointer values are equal, then check whether the duplicate has occurred or not. 
    # If they aren't equal, move fast pointer until it finds a non-duplicate element and put fast pointer value to slow pointer value. Finally return slow .
 

class Solution:
    def removeDuplicates(self, nums):
        prev=0
        slow=1
        fast=1
        flag=0
        while fast<len(nums):
            if nums[fast]==nums[prev]:
                if flag==0:
                    nums[slow]=nums[fast]
                    slow+=1
                    fast+=1
                    flag=1
                else:
                    fast+=1
            else:
                prev=fast
                nums[slow]=nums[fast]
                slow+=1
                fast+=1
                flag=0
                
        return slow
                    
    
            
sol = Solution()
nums=[1,1,1,2,2,3]
length=sol.removeDuplicates(nums)
print(length)



        
        















