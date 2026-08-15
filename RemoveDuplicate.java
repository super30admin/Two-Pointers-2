//Approach: Use slow pointer to collect the elements within k (in this case 2), and the first pointer to iterate through the entire array
//Time Complexity : O(n)
//Space Complexity: O(1) 
public class RemoveDuplicate
{
    public int removeDuplicates(int[] nums) {

        int s = 1;
        int f = 1;
        int count = 1;

        // s pointer to collect the elements that are not repeated more than twice
        // while f pointer iterates through the entire array
        while(f < nums.length)
        {
            if(nums[f] == nums[f-1]){
                count++;
            }
            else{
                count = 1; // new element is found
            }

            //Until the count reaches the number of repeated elements allowed (in this case 2), we keep replacing 
            if(count <= 2){
                nums[s] = nums[f];
                s++;
            }

            f++;
        }

        return s;
    }
}