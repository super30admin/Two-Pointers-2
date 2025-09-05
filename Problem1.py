class Solution(object):
    # tc = O(n) 
    # sc = O(1)  
    # ran successfully in leetcode
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # output expected is to return k where the first k elements in the nums array will have a unique element atmost twice 
        # lets take an example [1,2,2,3,3,3,4,5] at index till 0 to 4 they are same but at index 5 3 is alreay seen 2 times
        # and here it should be overwite with the next unique element at this index so the next unique element is 4 
        # approach : will use 3 pointers prev, next, index

        n = len(nums)

        cnt = 1 # intial count of the element seen 1's 
        prev_p = 0
        next_p = 1
        index = 1

        while (next_p < len(nums)):
            if nums[next_p] != nums[prev_p]: # if the nextpointer value is not equal to prev nums value, write that value at the index
                nums[index] = nums[next_p] # at prev_p = 0, next_p = 1, index = 1 now the arr = [1,2]
                cnt = 1 # since this is a new unique element the cnt of this element seen is 1 
                # move all the indexs 1 point to the right
                index +=1 
            else : # if the prev and the next pointer values are equal
                cnt +=1 
                if cnt <= 2: 
                    nums[index] = nums[next_p] # add the value so at prev_p = 1, index = 2, next_p = 2 the arr = [1,2,2]
                    index +=1
                # if the cnt if greater then we will move the next_p, prev_p  but not the index because at this index it has be overwrite with the next unique 
                # element in the arr, so at prev_p = 4, index = 5, next_p = 5 arr = [1,2,2,3,3,?] will later be updated to 4
            prev_p +=1
            next_p +=1

        return index 


        
        