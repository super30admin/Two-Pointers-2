//In this probllem, we are using two pointer technique. We have a slow pointer which keeps track of the position to write the next non duplicate element.
// We also maintain a count variable to keep track of the number of occurrences of the current element. If the count is less than or equal to 2, we write the element at the slow pointer and increment the slow pointer.
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var slow = 1
        var count = 1

        for(i in 1..nums.size -1) {
            if(nums[i] == nums[i-1]) {
                count++
            } else {
                count = 1
            }

            if (count <= 2) {
                nums[slow] = nums[i]
                slow++
            }
        }
        return slow
    }
}