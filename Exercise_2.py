#Time Complexity : O(M+N), M and N being the length of the arrays. 
#Space Complexity : O(1), because no extra array was used. 
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : Had a difficulty debugging an edge case, 
# the case when index2<0 but index>=0. Also, I had difficulty with the strategy in 
# the beginning when I tried to place the indices at the beginning. 

#Your code here along with comments explaining your approach in three sentences only
'''Starting with the indices from the back of the arrays, input the larger of the 
integers to the end until end index is 0. 
'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #initialize indices at ends. 
        index1 = m-1
        index2 = n-1
        index3 = m+n-1

        while(index3>=0):
            if index1>=0 and index2>=0:
                #input the larger of the number at the end and decrement indices. 
                if nums1[index1]<nums2[index2]:
                    nums1[index3] = nums2[index2]
                    index2 =index2-1
                    index3 = index3-1
                else:
                    nums1[index3] = nums1[index1]
                    index1=index1-1
                    index3=index3-1
            else:
                # the case when index2 is greater than 0 but index1 is negative.
                if index2>=0:
                    nums1[index3]=nums2[index2]
                    index2 =index2-1
                    index3 = index3-1
                else:
                    break


