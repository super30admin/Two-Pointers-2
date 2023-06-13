#Time complexity is: O(m+n) where m is the number of of values in nums1 and n is the number of values in nums2
#Space complexity is: O(1)
#Program ran successfully on leet code
#No issues faced while coding the problem

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        #p1 is pointing towards one poistion before 0's in nums1 array
        p1=m-1
        #p2 is pointing towards end poistion of nums2 array
        p2=n-1
        #idx is poiniting to the last position of nums1 array
        idx=m+n-1
        #looping through the arrays
        while(p1>=0 and p2>=0):
            #If the value in nums1 is greater than value in nums2 at index p1 and p2
            #We will place the value at index p1 at index idx
            if(nums1[p1]>=nums2[p2]):
                nums1[idx]=nums1[p1]
                #Reducing the p1 pointer position
                p1-=1
            else:
                #Else we will place value at index p2 in nums2 array at idx position in nums1
                nums1[idx]=nums2[p2]
                #Reducing the p2 pointer poistion
                p2-=1
            #Reducing idx index poistion
            idx-=1
        #All the remaining values in nums2 will be placed in nums1 at idx position
        while(p2>=0):
            nums1[idx]=nums2[p2]
            p2-=1
            idx-=1