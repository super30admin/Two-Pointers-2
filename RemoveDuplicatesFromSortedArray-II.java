//time complexity - O(n), space - O(1)
//The algorithm removes duplicates from the sorted array nums and allows at most two occurrences of each element. 
//It uses two pointers, slow to track the position where elements with at most two occurrences should be placed, and cnt to count the number of occurrences for the current element. 
//The algorithm iterates through the array, updating slow and cnt accordingly.
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
       // if(n==0 || nums == null) return;
        int slow =0;
        int cnt =0;
        for(int i=0;i<n;i++){
            if(i ==0 || nums[i] != nums[i-1]){
                cnt = 0;
            }
            else cnt++;
            if(cnt <= 1){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}