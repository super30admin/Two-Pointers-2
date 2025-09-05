class Solution(object):
    # tc = O(n+m)
    # sc = O(1)  in place
    # ran successfully in leetcode
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        # give m so we know at which index in the nums1 we have 0's 
        # and also given they are in non-decreasing order with this hint
        # approach : start from the end and see which value is greater and put that value in the end of the nums1, this way the larger elemensta re put in the end and the smaller elements keeps moving to start of the array

        end = len(nums1)- 1 # end pointer to larger value of nums1, nums2  
        i = m-1
        j = n - 1
        while(j >=0):
            if i >= 0 and nums1[i] > nums2[j]: 
                nums1[end] = nums1[i] # putting the larger value at the end of the arr
                i -= 1
            else:
                nums1[end] = nums2[j]
                j -= 1
            end -=1
            
        

        

        

                
            
            

            


            

