#Time Complexity:O(n)
#Space Complexity:O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)==0:                        #if List is empty return 0
            return 0
        count=1                                 #initialize count and j pointer
        j=1
        for i in range(1,len(nums)):            #while the i pointer stays within the array
            if nums[i]==nums[i-1]:              # if the current element of i pointer and previous element are same
                count+=1                        #increment the count value
            else:                               #else reinitialize count to 1
                count=1
            if count<=2:                        #if the count is less than two
                nums[j]=nums[i]                 # move the element at i pointer to j pointer and increment j 
                j+=1
        return j                                # return the poistion of j pointer which is also the length of the output slice