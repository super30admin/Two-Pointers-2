// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

Compare the two array from the end and fill the empty spaces of the first array with highest number from the comparison.

// Your code here along with comments explaining your approach

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """

        
        // this is pointer for filling the empty arrayspaces
        j = m+n-1
        
        n=n-1
        this is pointer for nums2 starting from end
        print(n)
        
        //this is pointer for nums1 tarting from end
        m= m-1
        
        //comparing to find the largest and fill at the last position of the empty spaces in nums1
        while(n>=0 and m>=0):
            
            if(nums2[n]>nums1[m]):
                nums1[j] = nums2[n]
                j = j-1
                n = n-1
            else:
                nums1[j] = nums1[m]
                j = j-1
                m = m-1
                
       // when m pointer m reaches < 0, fill all the elements from nums 2 in  empty spaces of nums1       
        while(n>=0):
            nums1[j] = nums2[n]
            n = n-1
            j = j-1
        return nums1
