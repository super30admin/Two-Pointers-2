'''
We will use a slow pointer and fast pointer approach to do this problem. As we only care about the order till k numebr of elements our approach would be to overwrite elements using our slow and fast pointers and thus acheive the sorted array with elements at max getting repeated k times in order as intended.
'''
'''
Time Complexity: O(n)
Space Complexity: O(1)
'''


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # null case
        if (nums == None or len(nums) == 0):
            return 0

        slow = 1
        # as count of every new element has to be 1
        count = 1
        # here i is our fast pointer basically
        for i in range(1, len(nums)):

            # checking th current element with previous to see if the element has changed
            # we do this to manipulate the count

            if (nums[i] == nums[i - 1]):
                # increase count as the elements are same and no new element is found
                count += 1
            else:
                # new element is found
                count = 1

            if (count <= 2):
                # overwriting the element
                nums[slow] = nums[i]
                slow += 1
        return slow

