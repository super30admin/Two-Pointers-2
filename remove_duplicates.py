#Time complexity: O(n)
#Space complexity: O(1)
#Worked on leetcode: yes
# This algorithm uses 3 pointers approach. Everything before slow pointer is valid. We also
# keep a check on the number of duplicates with a flag. A previous pointer is being compared with
# the slow pointer.
# We keep on comparing the values at the fast pointer with the values at the previous pointer. If the value is
# same, we make flag as 1, and increments both the slow and fast pointer.
# If the fast and prev pointer values are different, prev pointer goes to fast pointer,
# slow pointer gets the value at the fast pointer.


def removeDuplicates(nums):
    prev_ptr = 0
    slow_ptr = 1  # indicator which shows everything before this is valid
    fast_ptr = 1
    flag = 0

    while (fast_ptr < len(nums)):
        if nums[fast_ptr] == nums[prev_ptr]:  # duplicate
            if flag == 0:  # there is no duplicate before
                nums[slow_ptr] = nums[fast_ptr]
                slow_ptr = slow_ptr + 1
                fast_ptr = fast_ptr + 1
                flag = 1

            else:  # if duplicates already exists
                fast_ptr = fast_ptr + 1

        else:
            prev_ptr = fast_ptr
            nums[slow_ptr] = nums[fast_ptr]
            slow_ptr = slow_ptr + 1
            fast_ptr = fast_ptr + 1
            flag = 0

    return slow_ptr



print(removeDuplicates([1,1,1,2,2,3]))
