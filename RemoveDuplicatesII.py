class RemoveDuplicatesII(object):
    '''
    The solution is for 1 allowed duplicates (count < 1 and count == 1 conditions).
    Can be generalized to count == k allowed duplicates!!!
    '''
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        if (nums == None or len(nums) == 0):
            return 0

        count = 0
        slowId = 0;
        fastId = 1

        while (fastId < len(nums)):
            if (nums[fastId] == nums[slowId]):
                if (count < 1):
                    count += 1
                    slowId += 1
                    nums[slowId] = nums[fastId]
                    fastId += 1
                else:
                    fastId += 1
                    while (fastId < len(nums) and nums[fastId] == nums[fastId - 1]):
                        fastId += 1
            else:
                if (count == 1):
                    count = 0
                    slowId += 1
                    nums[slowId] = nums[fastId]
                    fastId += 1
                else:
                    slowId += 1
                    nums[slowId] = nums[fastId]
                    fastId += 1

        return slowId + 1

