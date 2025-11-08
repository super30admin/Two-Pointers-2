/**** Method 1 ****/
//Time Complexity: O(2n)
//Space Complexity: O(n)

//TLE when submitted in LeetCode

//Take a HashMap to store the frequency of each element, while storing the count, if the count is less than 2 then add to the list, then copy the elements from list to array and return the size of list.

/**** Method 2 ****/
//Time Complexity: O(n^2)
//Space Complexity: O(1)

//Successfully submitted in LeetCode

// Take two pointers and a count variable, if the current element is same as previous then increment the count, else make count 1, if count is less than or equal to 2 then copy the element to the slow pointer and increment the slow pointer, finally return the slow pointer.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TW2_80_Remove_Duplicates_from_Sorted_Array_II {

  /**** Method 1 ****/
  public int removeDuplicates1(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();

    for (int i : nums) {
      map.put(i, map.getOrDefault(i, 0) + 1);

      if (map.get(i) < 2) {
        list.add(i);
      }
    }

    for (int i = 0; i < list.size(); i++) {
      nums[i] = list.get(i);
    }

    return list.size();
  }

  /**** Method 2 ****/
  public int removeDuplicates2(int[] nums) {
    int slow = 0;
    int fast = 0;
    int count = 0;

    while (fast < nums.length) {
      if (fast != 0 && nums[fast] == nums[fast - 1]) {
        count++;
      } else {
        count = 1;
      }

      if (count <= 2) {
        nums[slow] = nums[fast];
        slow++;
      }
      fast++;
    }

    return slow;
  }
}
