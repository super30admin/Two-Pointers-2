# June 11, 2020
# Yet to code O(n^2) approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        # Method 2 : one pass

        # Time complexity : O(N)
        # Even if we have two poiners, we pass through the array only once
        # Space complexity : O(1)
        # No extra space needed, in place sorting
        '''
        - in-place sorting
        - the intuition for overwriting comes because the question says, it does not matter what you leave beyond
          the returned length does not matter
          - Two pointer: i - current position, j
          Problem:
          - input array passed by reference not clear
          - took some time to figure out time complexity, though it could be O(N^2)
        '''
        # works in leetcode

        count = 1
        j = 1

        for i in range(0, len(nums) - 1):

            if nums[i] == nums[i + 1]:  # duplicate elements
                count += 1  # so we keep increasing the count for a series of same elements
            else:
                count = 1  # a different element is found, here [i+1] is the different elemenet, i is the same element as before

            if count <= 2:  # Do not increment j once the count is 2, wait for the count to reset in else part
                nums[j] = nums[i + 1]  # once the count is reset, we again copy the different element (i+1)
                j += 1

            print(j)

        return j

        # Method 1 : two pass

        # Yet to code

        '''
        - Since we remove the element from array here, implicitly we are running a for loop there to pop
        - hence the complexity O(n^2)

        '''