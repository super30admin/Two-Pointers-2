#Time: O(n) 
#Space O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 1
        fast = 1
        count =1
        k=2

        if(len(nums) ==0 or nums == 0):
            return 0
        while fast< len(nums):
            if (nums[fast] == nums[fast-1]):
                #print(count)
                count +=1
            #fast+=1
            else:
                count =1 
            #print(nums)

            #overwriting the repeated elements which are more than k 
            if(count <= k):
                nums[slow] = nums[fast]
                slow +=1
            #fast+=1
            fast +=1
        #we have to return the slow pointer and not the len(nums)
        return slow
