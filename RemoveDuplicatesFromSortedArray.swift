//
//  RemoveDuplicatesFromSortedArray.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 1/12/26.
//

/*
 k = 1 means duplicates are not allowed
 k = 2 means duplicates are allowed
 k = 3 an element is allowed 3 times
 
 approach 1 -> have hash map. extra space - O(n). avoid extra space
 approach 2- Perfectly O(n). No extra space
 an element is visited twice. So, O(2n) = O(n)
 
 
 */
class RemoveDuplicatesFromSortedArray {
    
    
    init() {
        let indexOfLastElement = removeDuplicatesFromSortedArray(nums: [0,0,1,1,1,1,2,3,3])
        print("remove duplicates \(indexOfLastElement)")
    }
    
    func removeDuplicatesFromSortedArray(nums: [Int]) -> Int {
        var nums = nums
        var slow = 1
        let i = 1
        var count = 1
        
        for i in 1..<nums.count {
            if (nums[i] == nums[i - 1]) {
                count += 1
            } else {
                count = 1
            }
            
            if (count <= 2) {
                nums[slow] = nums[i]
                slow += 1
            }
        }
        return slow
    }
}
