//brute force-- using extra array TC- O(n)

// class Solution {
//     public int removeDuplicates(int[] nums) {

//         int n = nums.length;
//         if (n == 0) return 0;  // Handle empty array case

//         int p = 0;  // Pointer for the new array position
//         int k = 1;  // To keep track of how many duplicates have been added

//         int[] arr = new int[n];  // Extra array to store results
        
//         // Add the first element
//         arr[p++] = nums[0];

//         for (int i = 1; i < n; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 // If it's a duplicate, only allow it if we haven't added it more than once
//                 if (k < 2) {
//                     arr[p++] = nums[i];
//                     k++;
//                 }
//             } else {
//                 // If it's a new number, reset the duplicate counter and add the element
//                 arr[p++] = nums[i];
//                 k = 1;  // Reset duplicate count for the new number
//             }
//         }

//         // Copy the valid elements back to the original array
//         for (int i = 0; i < p; i++) {
//             nums[i] = arr[i];
//         }

//         return p;  // Return the new length
//     }
// }

//TC- O(n) SC-(O1)
class Solution {
    public int removeDuplicates(int[] nums) {
     int n= nums.length;
     int slow = 0;
     int fast = 0;
     int count = 0;
     int k = 2;

     while(fast < n){

        if(fast > 0 && nums[fast] == nums[fast-1]){
            count++;
        }else{
            count =1;
        }

        if(count <= k){
            nums[slow] = nums[fast];
            slow++;
        }
        fast++;
     }

     return slow;


    }
}


