
// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// We took two pointers one to traverse through the array and other pointer is
// for us to copy new values. If fast pointer is greater that slowpointer -2 then 
//we should incerement both pointers. If not just increase fast pointer to move forward through array.Return slow pointer length 
// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
    int firstptr=2,secondptr=2;
        for(secondptr=2;secondptr<nums.length;secondptr++){
            if(nums[secondptr]>nums[firstptr-2]){
                nums[firstptr]=nums[secondptr];
                    firstptr++;
            }
     
        }
        return firstptr;
    }
}

// Solution 2 -Partial
//     public int[] removeelement(int[] arr,int index)
//     {
//         for(int k=index+1;k<arr.length;k++){
//             arr[k-1]=arr[k];
//         }
//         return arr;
//     }
    
//     public int removeDuplicates(int[] nums) {
//     int count=1,len=nums.length;
//       for(int i=0;i<nums.length-1;i++){
//           if(nums[i]==nums[i+1]){
//               count++;
//           }
//           if(count>2){
//               removeelement(nums,i);
//               len--;
//           }
//       }    
//         //System.out.println();
//         return len;
//     }