// Time Complexity : O(m*n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
func merge(nums1 []int, m int, nums2 []int, n int)  {
    if len(nums1)==0 {
        return 
    }
    
    p1 := m-1
    p2 := n-1
    p3 := m+n-1
    
    for p1 >=0 && p2>=0{
        if nums1[p1]>=nums2[p2]{
            nums1[p3] = nums1[p1]
            p1-=1
        }else{
            nums1[p3] = nums2[p2]
            p2-=1
        }
        
        p3-=1
    }
    
    
    for p2 >= 0{
        nums1[p3] = nums2[p2]
        p2-=1
        p3-=1
    }
    
    
}
