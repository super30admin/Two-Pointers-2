// Time Complexity : o(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
In this problem we return the length of the array such that duplicates appear only twice in the array.For that we take two pointers s and f at index 0 and 1 respectively and flag=False.we check if the elements at s and f , we make the flag=True and increment s and the value of f is copied to s and we increment f.If flag=True then we check if the element at f and f-1 are equal and we do this till no repeated element is present.The elements are not equal then we set the flag to false and increment s and get the value at index f to the index s.
we return s+1 to get the length of the array such that duplicates appear only twice in the array


class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)==0 or nums==None:
            return 0
        s=0
        f=1
        flag=False
        while f<=len(nums)-1:
            if nums[s]==nums[f]:
                if flag==False:
                    flag=True
                    s=s+1
                    nums[s]=nums[f]
                    f=f+1
                else:
                    while f<=len(nums)-1 and nums[f]==nums[f-1]:
                        f=f+1
            else:
                flag=False
                s=s+1
                nums[s]=nums[f]
                f=f+1
        return s+1