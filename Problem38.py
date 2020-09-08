nums = [1,1,1,2,2,3,3,4,5,5,5]

def MergeSorted(nums):
    i = 1
    count = 1

    while i < len(nums):
        if nums[i] == nums[i-1]:
            count += 1

            if count > 2:

                nums.pop(i)
                i= i-1
        else:

            count = 1

        i = i +1

    return(nums)


"""
1) Comparing the current element with its previous element.
2) Keeping a count of the number of times an element is encountered.
3)If count is more than 2, then element is deleted else continued.

"""

"""
Time Complexity: 0(n)

Space: O(1)

"""
