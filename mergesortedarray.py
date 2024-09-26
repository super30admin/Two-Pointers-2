# time complexity;o(m+n)
# DOUBT AT LINE 25
# leetcode accepted
# explaination: we are taking three pointers in this. One index, i , j. Index will be pointing to the last index of the lasrher array. J will be pointing to the last element of the index and i to the last non zero element. M and n are number of non zero elements in each array.

# we coompare the the two arrays with respective pointers i and j. The greater value pointer will be put at the end of the larger array
# (at index).we decrement the larger pointer value array and the index pointer


# leetcode accepted

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        index = m + n - 1
        i = m - 1
        j = n - 1
        while (
                i >= 0 and j >= 0):  # this while loop only checks if there are elements remaining in the array or not, then why do we have a second while loop?
            if nums1[i] > nums2[j]:
                nums1[index] = nums1[i]
                i = i - 1
            else:
                nums1[index] = nums2[j]
                j = j - 1
            index -= 1

            # IF THE J>=0 THIS WHILE LOOP WOULDN'T HAVE EXITED RIGHT? i.e  which means both the arrays are completely traversed

        while (j >= 0):  #why do we have thist
            nums1[index] = nums2[j]
            j -= 1
            index -= 1