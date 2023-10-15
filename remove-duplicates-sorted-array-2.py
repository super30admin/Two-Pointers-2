# Intuition:
# Brute Force: Count sort
# keep a track of which number occurred and use hashset. Example if 1 appeared 3 times then update set at idx 1 with 3. This will ensure the numbers are ordered since we need to return the array in order. Once you iterate through all the elements in nums array, iterate through the set. At whichever idx there is an element, check if value is >=2, if yes, append the idx to output array twice. if not, append the idx to output array as 1.
# TC: O(n) + O(n) : once to iterate through nums and then to iterate through set
# SC: O(n) : space to create a set
# We are also using extra output array and not doing in place

# Intuition 2:
# Using 2 pointers:
# Have 2 ptrs - i and j both starting from 1 and count = 1.
# if you find a unique element, make count 1 and just do swap between element at i and j and then increase both idx
# if you find a duplicate element, increase count by 1. check if this count is <= 2, if yes swap and move to next
# if no, then # of duplicates is > than 2, just increase j

# In short, i will always point to the element where duplicacy starts happening and j is the iterator. At any point you find j that is unique or already present greater than twice, you will swap.
# TC: O(n)
# SC: O(1) - inplace update

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        # start from 2nd element as 1st element is always unique. Thats why count is also initialized to 1
        i = 1
        j = 1
        count = 1

        n = len(nums)

        if n == 1:  # if length of array is 1, just return first element
            return nums[0]

        while j < n:
            # if i == 0 and j == 0:
            #     count = 1
            #     i += 1
            #     j += 1

            # if element equal to previous, increase count
            if nums[j] == nums[i-1] and i != 0:
                count = count + 1

                # if count lesser than 2, swap elements at i and j and increase both idx
                if count <= 2:
                    self.swap(nums, i, j)
                    i += 1
                    j += 1
                # else: if count >2, just increase j. In short i is to keep track of the index at which count starts going over 2.
                else:
                    j += 1

            # if unique element, just set count to 1 and swap with wheever the duplicates > 2 started occurring, tracked by i. So swap with element at i
            else:
                count = 1
                self.swap(nums, i, j)
                # once swapped, move both idx by 1. That means everything < i is computed and has duplicates max upto 2
                i += 1
                j += 1

        print(nums)
        return i

    def swap(self, nums, a, b):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp


obj = Solution()
res = obj.removeDuplicates([0, 0, 1, 1, 1, 1, 2, 3, 3])
print(res)
