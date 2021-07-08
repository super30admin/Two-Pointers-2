//Time complexity :  O(n)
//Space complxity : O(1)
//leetcode execution : successful
//steps: in this approach we consider the slow and fast pointers, the slow pointer gets incremented only if element at fast pointer > element at slow pointer which is two steps back of it. swap postions if true.once loop exhausts return slow pointer.
class RemoveDuplicatesSortedArrayII80{

    public int removeDuplicates(int[] nums){
    int slow =2, fast =2;
    for(fast =2; fast<nums.length;fast++){
        if(nums[fast]>nums[slow-2]){
            nums[slow]=nums[fast];
            slow++;
        }   
    }
    return slow;
    }






//     public int removeDuplicates(int[] nums) {
//         if(nums==null) return 0;
//    if(nums.length<=2)return nums.length;
   

//    int i=0, j=1;

//    while(j<nums.length){
//        if(nums[j]==nums[i]){
//            if(i==0){
//                i++;
//                j++;
//            }else if(nums[i]==nums[i-1]){
//                j++;
//            }else{    
//                i++;
//                nums[i]=nums[j];
//                j++;
//            }
//        }else{
//            i++;
//            nums[i]=nums[j];
//            j++;
//        }
//    }
//   /// for (int jj : nums) {
//   //     System.out.print(" "+jj);
//   // }
//   // System.out.println();
//    return i+1;
// }

    public static void main(String[] args) {
        RemoveDuplicatesSortedArrayII80 rm = new RemoveDuplicatesSortedArrayII80();
        int nums[] ={0,0,1,1,2,2,2,3};
        System.out.println(rm.removeDuplicates(nums));

    }
}