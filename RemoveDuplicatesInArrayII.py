#All TC on leetcode passed

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        #Here we use 2 pointers techinque. We place i and j pointers at the start. 
        #Each time we check if jth element is same as its previous. If yes then we increment count 
        #else we initialise count to 1 as its start of new element. We check if count value is lesser 
        #or equal to 2. If yes then we put jth values into ith position and increment ith position. 
        #This can be used as generic algorithm for any no. of duplicates, in this case 2.
        #Time complexity - O(n)
        #Space complexity - O(1)

        count=1
        i=1

        for j in range(1,len(nums)):
            if nums[j]==nums[j-1]:
                count+=1
            else:
                count=1
            
            if count<=2:
                nums[i] = nums[j]
                i+=1
        return i
        