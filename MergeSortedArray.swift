//
//  MergeSortedArray.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 1/8/26.
//

//time complexity - O(m+n)
//no extra space
/*
 [1, 6, 7, 0, 0, 0]
 [2, 3, 5]
 If we start the pointers from the start and use swapping technique then Swapping wouldn't work because order of elements might get disturbed in 2nd array.
 
 Approach 1 ->
 We can create a new array to accomodate new sorted array. But extra space of O(m+n would be needed).
 check array1[p1] <= array2[p2] {
 add array[p1] in result array
 increment p1
 } else {
 add array[p2] in result array
 increament p2
 }
 
 Approach 2 - without using extra O(m+n) space and using swapping technique. Use 3 pointers from the last.
 there is no issue in overwritting in elements.
 In order to solve sorting issue - use below approach
 start pointer from the end
 array1 -> start pointer from the end (pointer 1)
 array2 -> start pointer from the end (pointer 2)
 collecting pointer -> at the end of the first array where we are putting up values at the place of 0.
 compare 7 and 5. array one's 7 is the bigger one. put 7 at the position of collecting pointer. Move array1 poniter towards left.
 Move collecting pointer towards left.
 We wouldn't be loosing sorting of the array because collecting pointer and the comparing pointers are at the different place.
 time comlexity - O(m + n)
 
 two case -> when 2nd array finishes first.
 when 1st array finishes first
 */

class MergeSortedArray {
    
    init() {
        var nums1 = [4,5,6,0,0,0] //[1, 6, 7, 0, 0, 0]
        let nums2 = [1,2,3] //[2, 3, 5]
        mergeSortedArray(nums1: &nums1, nums2: nums2, m: 3, n: 3)
        print("nums1 after mergin sorted array \(nums1)")
    }
    
    func mergeSortedArray(nums1: inout [Int], nums2: [Int], m: Int, n: Int) {
        var collectingP: Int = m + n - 1
        var p2: Int = n - 1
        var p1 = m - 1
        
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[collectingP] = nums1[p1]
                p1 -= 1
            } else {
                nums1[collectingP] = nums2[p2]
                p2 -= 1
            }
            collectingP -= 1
        }
        
        while (p2 >= 0) {
            nums1[collectingP] = nums2[p2]
            p2 -= 1
            collectingP -= 1
        }
    }
    
}
