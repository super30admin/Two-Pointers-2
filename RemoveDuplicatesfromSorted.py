# TC = O(n)
# SC = O(1)
# We use two pointers- 
# 1) array pointer i
# 2) pointer that points at element that can be replaced j (lagging/ slow pointer)
# Here we use the concept fast- slow pointers. while array pointer increases by 1 each time, we make sure our slow pointer does not move in case the elememt has repeated more than 2 times. So as and when we encounter new element - we reset the count to 1 and replace slow pointer element with newest element. This way we make sure all elements before slow pointer are not repeated more than twice. This is a generic algorithm holds good for any "k" allowed number of repeats.
class Solution:
    def removeDuplicates(self, nums):
        # Initialize the counter and the second pointer.
        j, count = 1, 1
        for i in range(1, len(nums)):
            # If the current element is a duplicate, 
            # increment the count.
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                # Reset the count since we encountered a different element
                # than the previous one
                count = 1
            # For a count <= 2, we copy the element over thus
            # overwriting the element at index "j" in the array
            if count <= 2:
                nums[j] = nums[i]
                j += 1

        print(nums[:j])      
        return j

obj = Solution()
nums = [1,1,1,2,2,3]
print(obj.removeDuplicates(nums))