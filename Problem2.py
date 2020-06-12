# Time Complexity : O(m+n), m = no of elements except 0 in nums1 and all of the elements in nums2
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

class Solution:
    def merge(self,nums1,m,nums2,n):
        # Edge 
        i, j , k = (m-1),(n-1),(m+n-1) 
        while i >=0 and j>= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i] 
                i -= 1 
            else:
                nums1[k] = nums2[j]
                j -= 1 
            k-=1 
        
        while j >= 0: # if i is less than 0 but nums2 still has numbers, so just replace with k`th pointer. 
            nums1[k] = nums2[j] 
            k -= 1 
            j -= 1 
        return nums1

if __name__ == "__main__":
    s = Solution()
    # nums1 = [1,2,3,0,0,0]
    nums1 = [100,101,0,0,0]
    m = 2
    nums2 = [2,5,6]
    n = 3 
    res = s.merge(nums1,m,nums2,n)
    print(res)