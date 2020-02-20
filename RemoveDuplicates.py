class RemoveDuplicates(object):
    '''
    Solution:
    1.  Maintain two pointers, one slow and one fast along with maintaining a flag to check whether a duplicate has already
        occurred while traversing.
    2. Split the scenarios in 2 cases - if slow and fast pointer values are equal, then this will turn into 2 more cases
        whther the duplicate has occurred or not. If they aren't equal, this will also turn into 2 more cases.
    3. Manipulate slow and fast pointers such that slow pointer doesn't contain more than one duplicate element and move
        fast pointer until it finds a non-duplicate element. Finally return elements till slow pointer only.

    --- Passed all test cases on Leetcode successfully
    O(n) Time Complexity | O(1) Space Complexity
    '''

    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        if (nums == None or len(nums) == 0):
            return 0

        duplicateOccurred = False
        slowId = 0;
        fastId = 1

        while (fastId < len(nums)):
            if (nums[fastId] == nums[slowId]):                  # case 1 -- slow and fast equal
                if (duplicateOccurred == False):                # case 1.1 - duplicate isn't seen yet
                    slowId += 1
                    nums[slowId] = nums[fastId]
                    duplicateOccurred = True
                    fastId += 1
                else:                                           # case 1.2 - duplicate is seen and so move fast till unique element
                    while (fastId < len(nums) and nums[fastId] == nums[fastId - 1]):
                        fastId += 1
            else:                                               # case 2 -- slow and fast not equal
                if (duplicateOccurred == True):                 # case 2.1 - previous duplicate is seen
                    duplicateOccurred = False
                slowId += 1
                nums[slowId] = nums[fastId]
                fastId += 1
        return slowId + 1

