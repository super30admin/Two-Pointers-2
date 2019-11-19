# time complexity: 0(n)
# leetcode-  not working
# no doubts
# explaination: WE will need three pointers, slow, fast and mid. The fast pointer will be the one traversing the array,
# the slow pointer si where you will be adding the elements, the previous pointer to compare the elements with the fast pointer.

# there is a flag which tells if the number has been already encunterd or not. Intially the flag is 0, which means it has not encounted'
# the same number again. If it encounters again, the falg will change to 0. Since it can have two values of the same number, if the fast
# pointer encouters the same element again and if the flag pointer is already 1, the fast pointer will just move to next element.

# the loop will run until the fast pointer comes out of array


class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        slow = 1
        fast = 1
        prev = 0
        flag = 0
        while (fast < len(nums)):
            if nums[fast] == nums[prev]:
                if flag == 0:
                    nums[slow] = nums[fast]
                    slow += 1
                    fast += 1
                    flag = 1
                else:
                    fast += 1
            else:
                flag=0
                nums[slow] = nums[fast]
                prev=fast

                fast += 1
                slow+=1
                flag = 0
            return slow