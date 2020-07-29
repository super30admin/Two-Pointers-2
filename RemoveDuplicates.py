# Time Complexity : O(n) where n is the number of elements in the list
# Space Complexity : O(1) we are not creating any space
# Did this code successfully run on LeetCode : yes
# Any problem you faced while coding this : No

# we will create three pointers,
# fast to iterate through the loop,
# prev will be the previous unique element
# slow will be the pointer to replace the duplicate element
# Flag variable to verify it is a valid or invalid duplicate
# when we see a invalid duplicate we will replace that with the current slow position
# when we see a valid duplicate we will replace the current slow position with the fast and change the flag to 1,
# to inform that next duplicate element will be invalid. if invalid, we will just increment the fast pointer only

class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:

        fast = 1
        slow = 1
        prev = 0
        flag = 0

        while fast < len(nums):

            if nums[fast] == nums[prev]:

                if flag == 0:

                    nums[slow] = nums[fast]
                    slow +=1
                    fast +=1
                    flag = 1

                else:

                    fast +=1

            else:
                prev = fast
                nums[slow] = nums[fast]
                fast +=1
                slow +=1
                flag = 0


        return slow

