/*
Time complexity:
O(m + n) as we are traversing through two different arrays
*/

/*
Space Complexity:
O(1) as we are not creating any extra space.
*/

/*
Approach:
We are maintaing three pointers. One points to the end of the second array, other points to
the end of the first array after which we have to add elements. And third points to the end 
of the  first array. We are making use of the xtra space provided in the first array as 
a new array so that the sorting is not disturbed in both the arrays if we are doing everything
in space.

The approach works like this, we compare the elements at the indices which are being
pointed by first and the second pointers. Whichever element is bigger, it is placed at
the index which is being pointed by the third pointer in the first array or the bigger array.
Then we decrement the third pointer by 1 and the index which gave the larger element
is also decremented by 1. There is an edge case here too that one array is smaller.
What is the elements of it are exhausted and then it is decremented again. There it
will fail, so we have to make sure that for the second array pointer should
always be greater than or equal to zero*/

//The code ran perfectly on leetcode.


void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        
        int k = m + n - 1;
        
        int first = m -1;
        int second = n-1;
        
        while(first >= 0 && second >= 0){
            if(nums1[first] > nums2[second]){
                nums1[k--] = nums1[first--];
            } else {
                nums1[k--] = nums2[second--];
            }
        }
        while(second >= 0){
            nums1[k--] = nums2[second--];
        }
            
        
    }