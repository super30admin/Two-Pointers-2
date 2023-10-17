
//time complexity: O(n)
//space complexity: O(1)

//Approach: Using 2 pointers to iterate the elements and count the # of occurrences. If count >= 2 then copy  the ith
// element at slow pointer element and then increase the slow pointer.
public class RemoveDupsFromSortedArray {
    public  static int removeDuplicates(int[] nums) {
     if(nums==null || nums.length==0) return 0;
     int n = nums.length;
     int slow = 0; int count = 0;
     for(int i = 0; i<n; i++){
         if(i == 0 || nums[i] !=nums[i-1]){
            count = 1;
         }else{
            count++;
         }
         if(count <= 2){
             nums[slow] = nums[i];
             slow++;

         }
     }
     return slow;
    }

    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,3,3};

        removeDuplicates(nums);
        System.out.println("hi");

    }
}
