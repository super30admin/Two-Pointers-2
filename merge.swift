
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
    func merge(_ nums1: inout [Int], _ m: Int, _ nums2: [Int], _ n: Int) {
        if n == 0 || nums1 == nil || nums2 == nil {
            return 
        }
        var i = m-1
        var j = n-1
        var k = m+n-1
        while j >= 0 && i >= 0 {
            if nums1[i] > nums2[j] {
                nums1[k] = nums1[i]
                i -= 1
                k -= 1
            } else {
                nums1[k] = nums2[j]
                j -= 1 
                k -= 1
            }
        }
        while j >= 0 {
            nums1[k] = nums2[j]
            j -= 1
            k -= 1
        }
        
    }