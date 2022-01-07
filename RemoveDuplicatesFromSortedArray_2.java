import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_2 {

    public static int removeDuplicates(int[] nums) {
        int i = 1, j = 1, counter = 1;

        while(j < nums.length){
            if(nums[j] == nums[j-1]){
                ++counter;
            }else{
                counter=1;
            }

            if(counter <= 2){
                nums[i] = nums[j];
                ++i;
            }
            ++j;
        }
        return i;
    }

    public static void main(String[] args){
        int[] arrWithDupes = new int[]{1,1,1,2,2,3};
        int k = removeDuplicates(arrWithDupes);
        System.out.println("Sorted array after removing duplicates : " + Arrays.toString(Arrays.copyOfRange(arrWithDupes,0, k +1 )));
    }

}
