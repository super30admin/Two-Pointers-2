// Time Complexity : (O)n
// Space Complexity : (O)1
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes. wrong answer for [0,0,1,1,1,1,2,3,3]. answer - [0,1,1,2,3,3] reason  - count and j start with 0
// Use two pointer approach. Keep iterate the i pointer. Move j pointer when duplicate count is less than 2
//increase count when the previous value is equal to current value
//if current value is different from previous value set to one
// set the i pointer value to j when count is less than 2. finally return the j pointer which is the lenght of the new array

class Solution {
    func removeDuplicates(_ nums: inout [Int]) -> Int {
        let length = nums.count
        //edge 
        if length == 0 {
            return 0
        }
        
        var i = 1
        var j = 1
        var count = 1
        
        while i < length && j <= i {
            if nums[i] == nums[i-1] {
                count += 1
            } else {
                count = 1
            } 
            if count <= 2 {
                nums[j] = nums[i]
                j += 1
            }
            i += 1
        }
        return j
    }
}