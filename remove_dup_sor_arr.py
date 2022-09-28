#time complexity: o(n), going th 1 for loop
#space complexity:o(1), done in place
#passed all cases on LeetCode:yes
#difficulty faced:-
# comments:in the code
#https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

class Solution:
    def removeDuplicates(self, nums: 'List[int]') -> int:
        
        
        j = 1
        #since cnt for 1st new element is 1 and we are startint from 2nd position
        cnt = 1
        
        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                cnt+=1
            else:
                cnt = 1
            #j ptr is the place where we want to insert new element
            #so when we find a new element with count <= 2 we move them in jth pos
            if cnt <= 2:
                nums[j] = nums[i]
                j+=1
            
        return j
                
            