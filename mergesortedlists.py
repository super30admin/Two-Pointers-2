# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :Yes       
# Any problem you faced while coding this :No




class Solution(object):
    def merge(self, nums1, m, nums2, n):
        p=m+n-1
        f=m-1
        s=n-1
        while(p!=-1):
            if(s==-1):
                while(f!=-1):
                    nums1[p]=nums1[f]
                    f-=1
                    p-=1
                return
            if(f==-1):
                while(s!=-1):
                    nums1[p]=nums2[s]
                    s-=1
                    p-=1
                return
            
            if(nums1[f]>nums2[s]):
                nums1[p]=nums1[f]
                f-=1
            else:
                nums1[p]=(nums2[s])
                s-=1
            p-=1
        return