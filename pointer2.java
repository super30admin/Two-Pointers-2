// Approach:
// 1. Use a HashMap to store the frequency of each element.
// 2. Traverse the array and update the frequency count.
// 3. If the frequency of the current element is at most 2,
//    place it at index k and increment k.
// 4. Ignore elements whose frequency exceeds 2.
// 5. Return k as the length of the modified array.

// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int k=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)<=2){
                nums[k]=num;
                k++;
            }
        }
        return k;
    }
}
//problem 2
// Approach:
// 1. Start three pointers:
//    - i at the end of the valid elements in nums1.
//    - j at the end of nums2.
//    - k at the last index of nums1.
// 2. Compare nums1[i] and nums2[j].
// 3. Place the larger element at nums1[k] and move the corresponding pointers.
// 4. After one array is exhausted, copy the remaining elements of nums2.
// 5. No need to copy the remaining elements of nums1 since they are already in place.

// Time Complexity: O(m + n)
// Space Complexity: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
}
//problem 3
// Approach:
// 1. Start from the top-right corner of the matrix.
// 2. If the current element equals the target, return true.
// 3. If the current element is greater than the target,
//    move left because all elements below are larger.
// 4. If the current element is smaller than the target,
//    move down because all elements to the left are smaller.
// 5. Continue until the target is found or the indices go out of bounds.

// Time Complexity: O(m + n)
// Space Complexity: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int r=0,c=n-1;
        while(r<m && c>=0){
            if(matrix[r][c]==target) return true;
            else if(matrix[r][c]>target) c--;
            else r++;
        }
        return false;
    }
}
