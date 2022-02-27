//Time Complexity: O(n) n = length of nums
//Space Complexity: O(1)
//didn't face any problems
//runs successfully

public class RemoveDuplicatesFromSortedArray2LeetCode80 {

//     public int removeDuplicates(int[] nums) {

//         int insert = 0;
//         int count = 0;
//         for(int i=0; i<nums.length; i++){

//             if(i==0 || nums[i]==nums[i-1]){
//                 count++;
//             }
//             else{
//                 count = 1;
//             }

//             if(count <=2){
//                 nums[insert] = nums[i];
//                 insert++;
//             }

//         }
//         return insert;
//     }


        public int removeDuplicates(int[] nums) {

            int insert = 0;                             //maintaining the insert pointer
            for(int num : nums){                        //iterating over nums array

                if(insert<2 || nums[insert-2]!=num){    //check if insert pointer is less than 2 and check if insert-2 position in array is equal to the current element or not

                    nums[insert] = num;                 //if so, then adding element at insert position and increase the increment counter
                    insert++;
                }

            }

            return insert;
        }
}



