/* Problem Statement:
Verified on leetcode

Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.

It doesn't matter what you leave beyond the returned length.

Example 2:

Given nums = [0,0,1,1,1,1,2,3,3],

Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.

It doesn't matter what values are set beyond the returned length.

Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}

 *
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#include<math.h>

/* K duplicate version */
int removeDuplicates_ver2(int* nums, int numsSize, int num_of_dup_allowed){
    
   int slow_ptr = 0;
   int idx = 0;

    if (!numsSize) {
        //printf("Numbers are 0\n");
        return 0;
    }
    /* start from the idx =  number of duplicates count as we are not concerned with those elements as such */
    slow_ptr = num_of_dup_allowed;

    /* Tricky one : start from slow_ptr index 
    * slow_ptr is tracking the current number for duplicates ie it will only increase further when no more duplicates of
       numbers are found. which is why its called slow_ptr
       Continue if slow-num_of_dup has same number as nums[idx] as its duplicate.
       otherwise add the number at slow idx and continue further.
     */
    for (idx = slow_ptr; idx < numsSize; idx++) {
        if (nums[slow_ptr - num_of_dup_allowed] == nums[idx])
            continue;

        nums[slow_ptr++] = nums[idx];
    }
    return slow_ptr;
}

/* works for 2 duplicate limitation cases */
int removeDuplicates(int* nums, int numsSize){
    
    int slow_ptr = 1; /* Specifies the current idx at which element needs to be inserted */
    int fast_ptr = 1; /* Specifies the current idx in the iteration loop */
    int prev_ptr = 0; /* Specifies the index before which we are not checking any elements */
    int have_seen_it = 0; /* Specifies if we have already seen the element which we are searching for. If it is 3 eg : it has been seen 3 times  */
    
    if (!numsSize) {
        printf("Numbers are 0\n");
        return 0;
    }
    /* End when fast_ptr crosses the num size */
    while (fast_ptr < numsSize) {
        
        /* FOR DEBUGGING PURPOSE */
        /*printf("prev:%d slow:%d fast:%d  : ", prev_ptr, slow_ptr, fast_ptr);
        
        for (int idx = 0; idx < numsSize; idx++)
            printf("%d ", nums[idx]);
        printf("\n");
        */
        /* Am I seeing it for the first time ? */
        if (have_seen_it == 0) {
            if (nums[fast_ptr] == nums[prev_ptr]){
                nums[slow_ptr] = nums[fast_ptr];
                slow_ptr++;
                fast_ptr++;
                have_seen_it = 1;        
            } else {
                nums[slow_ptr] = nums[fast_ptr];
                prev_ptr = fast_ptr;
                slow_ptr++;
                fast_ptr++;
            }
        } else {
            /* already seen number, so now if same number encountered again keep moving fast_ptr*/
            if (nums[fast_ptr] == nums[prev_ptr]) {
                fast_ptr++;
                
            } else {
                /* new number found, move slow_ptr after copying it*/
                have_seen_it = 0;
                nums[slow_ptr] = nums[fast_ptr];
                prev_ptr = fast_ptr;
                slow_ptr++;
                fast_ptr++;                
            }
        }
    }
    
    return slow_ptr;
}



int main(int argc, char *argv[]) {
    int *num_p = NULL;
    int idx = 0;
    int final_len = 0;

    if (argc < 2) {
        printf("Usage: ./a.out <num1> ... <num n>\n");
        exit(1);
    }
    printf("Input size array : %d \n", argc - 1);

    num_p = (int *)malloc((argc - 1)*sizeof(int));
    if (num_p == NULL) {
        printf("Memory allocation failed \n");
        return -1;
    }

    /* Dont want to change the function, so copying the input to int array */
    for (idx = 1; idx < argc; idx++) {
        num_p[idx - 1] = atoi(argv[idx]);
    }

    //final_len = removeDuplicates(num_p, argc - 1);
    final_len = removeDuplicates_ver2(num_p, argc - 1, 2);

    for (idx = 0; idx < final_len; idx++) {
      printf("%d ", num_p[idx]);
    }
    printf("\n");


    free(num_p);
    return 0;
}


