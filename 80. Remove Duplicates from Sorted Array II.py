# I can have at most 2 duplicates of an element

# Time: max(n, range) n= number of elements in an array  range= max-min
# Space: O(n)

# Create a frequency map while seeing for a max and min value
# Then loop from min to max finding the elements in the frequency map and adding at most 2 in the nums array
# At the end return the pointer at which we ended up

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        freq = {}
        ma = 100
        mi = 0

        for num in nums:
            mi = min(mi,num)
            ma = max(ma,num)
            if num in freq:
                freq[num] += 1
            else:
                freq[num] = 1

        pointer = 0
        for i in range(mi,ma + 1):
            if i in freq and freq[i] >= 2:
                nums[pointer] = i
                nums[pointer + 1] = i
                pointer += 2
            elif i in freq and freq[i] < 2:
                nums[pointer] = i
                pointer += 1

        return pointer
    
# Time: O(n)
# space O(1)

# Using two pointers both of them starting from the 0th index
# If the current and prev element are the same increment the counter and if they are not same reset the counter to 1
# Then in one more condition check if counter is <= 2 if yes then swap the numbers and increase the low pointer
# The high pointer should always be increased

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        p1 = 0
        counter = 0

        for p2 in range(len(nums)):
            if nums[p2] == nums[p2-1]:
                counter += 1
            else:
                counter = 1
            if counter <= 2:
                nums[p1] = nums[p2]
                p1+= 1
            p2 +=1
        
        return p1