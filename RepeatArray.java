//Time Complexity : O(n)
//Space Complexity : O(1)
/*Approach 
-going through each number keeping a flag if a new number occurs flag is set 0
-if number is same as previous number and flag is 0 that means they both are in right position
if previous number is different then position of new number should be changed
-keeping a pointer p behind which every number will be in right position,because we kept on chnaging
position of new occuring numbers
-so at the end p+1 will be returned as length till which everything is in right place
*/
public class RepeatArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int flag = 0;
        int p = 0;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == nums[i-1] && flag == 0){
                flag = 1;
                p++;
            }
            else if(nums[i] != nums[i-1]){
                flag = 0;
                p++;
            }
            nums[p] = nums[i];
        }
        return p+1;
    }
    public static void main(String args[]) {
        int arr[] = new int[]{1,1,1,1,4,4,4,3};
        int p = removeDuplicates(arr);
        for(int i =0; i <p;i++){
            System.out.print(arr[i]+" ");
        }

    }
}