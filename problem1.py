#remove duplicate from sorted array
# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this :no

      

def removeDuplicates( nums) :
    if len(nums)==1:
        return 1
    slow=1
    fast=1
    count=1
    while(fast<len(nums)):
        if(nums[fast]!=nums[fast-1]):                       #if the current element is not the same as the last one, then change the count to 1 and copy the value to slow and increment both slow and fast
            count=1
            nums[slow]=nums[fast]
            slow+=1
            fast+=1
        else:
            if(count<2):                                    #if the element is the same but the count is less than 2, then copy the value and increments the values
                nums[slow]=nums[fast]
                slow+=1
                fast+=1
            else:                                              #if count is greater than 2, then just increment fast value
                fast+=1
            count+=1
    return nums


#testing
print(removeDuplicates([1,1,1,2,2,3]))