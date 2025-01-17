############# Remove duplicates in sorted array inplace ############

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Using two pointers one to keep track of the element and the other the location to write and based on the count write the element

def remove_duplicates(nums):
    if not nums:
        return 0
    
    i = 1
    j =  1
    cnt = 1
    
    for j in range(1,len(nums)):
        if nums[j] == nums[j-1]:
            cnt +=1
        else:
            cnt = 1
        
        if cnt <= 2:
            nums[i] = nums[j]
            i+=1
    return i
