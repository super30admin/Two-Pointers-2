class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # edge case:
        if len(nums) == 1:
            return 1
        prev = 0
        fast = 1
        slow = 1
        flag = False
        while fast < len(nums):
            #print('-------------------------44', nums, prev, fast, slow, flag)
            if nums[fast] == nums[prev]:
                if flag == False:  # 1st repested element, we can keep it
                    flag = True
                    nums[slow] = nums[prev]
                    slow += 1
                    fast += 1
                    #print('111',nums,prev,fast,slow,flag)
                else:  # flag true.. so just increment fast
                    fast += 1
                    #print('222', nums, prev,fast, slow, flag)
            else:
                prev = fast
                nums[slow] = nums[prev]
                slow += 1
                fast += 1
                flag = False
        #return slow in leet code returned slow
        return nums[:slow]
S= Solution()
k=[1,1,1,2,2,2,3,3]
j=S.removeDuplicates(k)
print(j)


# time - O(N), space -O(1)
# iterate through elements and skip the element if it is repeated more than 2 times.
class Solution:
    def removeDuplicates(self, nums) -> int:
        i = 0
        for n in nums:
            if i >= 2 and n > nums[i-2]:
                nums[i] = n
                i += 1
            elif i<2:
                i=i+1
        return i

