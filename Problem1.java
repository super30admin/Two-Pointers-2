//Problem 80 : remove Duplicates from Sorted Array 2
//Solved successfully on leetcode and faced no issues
//Time complexity : O(n) Space complexity : O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        int count = 1;
        int k = 2;
        for(int right = 1 ; right < nums.length ; right++){
            if(nums[right] == nums[right-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count<=k){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
//brute force : TC:O(n) SC:O(n)
//     public int removeDuplicates(int[] nums) {
//         List<Integer>output = new ArrayList<>();
//         int i = 0;
//         int n = nums.length;
//         while(i < n){
//             int count = 1;
//             int unique = nums[i];
//           while(i + 1 < n && nums[i] == nums[i+1]){
//             count++;
//             i++;
//         }
//         int times = Math.min(2,count);
//         for(int j = 0; j < times ;j++){
//             output.add(unique);
//         }
//         i++;
//         }
//         for (int k = 0; k < output.size(); k++) {
//           nums[k] = output.get(k);
// }

//         return output.size();
               
        
//     }
// }