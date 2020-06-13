// Time Complexity : (O)m+n
// Space Complexity : (O)1
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 
// compare last element of array1(m-n) and array2 element. move the greatest number into last index of array 1
// if array2 is not completed then move all array2 element into array 1
class Solution {
    func merge(_ nums1: inout [Int], _ m: Int, _ nums2: [Int], _ n: Int) {
        var i = m-1
        var j = n-1
        var k = m+n-1
        
        while(i>=0 && j>=0) {
            if nums1[i] < nums2[j] {
                nums1[k] = nums2[j]
                j -= 1
            } else {
                nums1[k] = nums1[i]
                i -= 1
            }
            k -= 1
        }
        
        while j >= 0 {
            nums1[k] = nums2[j]
            j -= 1
            k -= 1
        }
        
    }
} 