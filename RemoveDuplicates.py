"""
The approach here is to iterate through the array and at each ith index check if i+1 and i -1 are equal.
if so then it means there are more than 2 similar elements. so keep no moving in the array until we find
a condition where the i-1 and i+1 indexes are not equal, this means we have encountered a unique element
 and we increase the count in this way we just maintain the len of array with max two entries of each element.
Leetcode - Running
Time complexity - O(N)
Space complexity - O(1)
example - [1,1,1,2,2,2,2,3,3,4]
position at 0 - continue
position at 1 - i+1 = i-1 -> count = 1 
postion at 2 - i+1 != i-1 -> count += 1 = 2
position at 3 - i +1 != i-1 -> count += 2 = 3
position at 4 - i+1 == i -1 -> count  = 3
position at 5 - i+1 == i -1 -> count = 3 
position at 6 - i+1 != i -1 -> count += 3 = 4
position at 7 - i+1 != i -1 -> count += 4 = 5
position at 8 - i+1 != i -1 -> count += 5 = 6

           |   | |     | | | |   ----> '|' indicates the elements considered.
example - [1,1,1,2,2,2,2,3,3,4]

finally take into account the last index also so return count+1 = 7 = [1,1,2,2,3,3,4]
Basically we are just taking into account the first and last index elements of the repeated sub-arrays in
the main array.
"""

def removeDuplicates(self, nums):
        if len(nums) < 3: 
            return len(nums)
        pos = 1
        for i in range(1, len(nums)-1):
            if nums[i-1] != nums[i+1]:
                nums[pos] = nums[i]
                pos += 1
        nums[pos] = nums[-1]
        return pos + 1