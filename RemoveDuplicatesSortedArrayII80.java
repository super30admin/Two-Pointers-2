//Time complexity :  O(n)
//Space complxity : O(1)
//leetcode execution : successful
//steps: given the array .first element at index 0 and 1 are considered as i and j two pointers.
//for first iteration alone both pointers are incremented, from then only j gets incremented if duplicate found.else i will be incremented and nums[j] will become i and then j gets incremented.
//once iteration finishes of I+1 is the length after removing the duplicates more than 2.
class RemoveDuplicatesSortedArrayII80{


    public int removeDuplicates(int[] nums) {
        if(nums==null) return 0;
   if(nums.length<=2)return nums.length;
   

   int i=0, j=1;

   while(j<nums.length){
       if(nums[j]==nums[i]){
           if(i==0){
               i++;
               j++;
           }else if(nums[i]==nums[i-1]){
               j++;
           }else{    
               i++;
               nums[i]=nums[j];
               j++;
           }
       }else{
           i++;
           nums[i]=nums[j];
           j++;
       }
   }
  /// for (int jj : nums) {
  //     System.out.print(" "+jj);
  // }
  // System.out.println();
   return i+1;
}

    public static void main(String[] args) {
        RemoveDuplicatesSortedArrayII80 rm = new RemoveDuplicatesSortedArrayII80();
        int nums[] ={0,0,1,1,2,2,2,3};
        System.out.println(rm.removeDuplicates(nums));

    }
}