def removeDuplicates(nums):
    """
    :type nums: List[int]
    :rtype: int
    """

    # inititalize two pointers
    j, count = 1, 1

    '''
    iterate through every element and check for its count 
    incremeent its count only if equal to previous value
    
    for every element till count is less than 2, replace the element of what is present at i 
    '''
    for i in range(1, len(nums)):

        if nums[i] == nums[i - 1]:
            count += 1
        else:
            count = 1

        # For a count <= 2, we copy the element over thus
        # overwriting the element at index "j" in the array
        if count <= 2:
            nums[j] = nums[i]
            j += 1

    return j

print(removeDuplicates([1,1,1,2,2,3]))
print(removeDuplicates([0,0,1,1,1,1,2,3,3]))

'''
Time complexity : O(N) N - number of elements in the array
Space complexity: O(1) 
'''