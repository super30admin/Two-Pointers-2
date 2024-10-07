# Time Complexity : O(m+n) since every element from both nums1 and nums2 is processed exactly once
# Space Complexity : O(1)  since it modifies nums1 in place without using additional space
# Did this code successfully run on Leetcode : Yes

# Your code here along with comments explaining your approach
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #Assigning required variables
        p1=m-1
        p2=n-1
        idx=(m+n)-1
        #To iterate both the arrays 
        while(p1>=0 and p2>=0):
            #If element in nums1 is greater then add that element to idx position in nums1
            if(nums1[p1]>nums2[p2]):
                nums1[idx]=nums1[p1]
                #To check for next element in next iteration
                p1-=1
            #Else if element in nums2 is greater then add that element to idx position in num1 
            else:
                nums1[idx]=nums2[p2]
                #To check for next element in next iteration
                p2-=1
            #To keep the index position ready for the next element for insertion
            idx-=1
        #Condition when p1 is out of bound but p2 is in bound(i.e,elements left to check in p2)
        while(p2>=0):
            #Replace each element from p2 position to idx in nums1
            nums1[idx]=nums2[p2]
            p2-=1
            idx-=1