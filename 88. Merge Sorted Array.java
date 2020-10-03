class Solution {// time of O(m+n) and space constant
    // conside this case [5,6,7]
    //                   [1,2,3]
public void merge(int[] nums1, int m, int[] nums2, int n) {
int ptr1 = m-1;
int ptr2 = n-1;
int end_ptr = m+n-1;

while(ptr1>=0 && ptr2>=0){
if(nums1[ptr1]<= nums2[ptr2]){
    nums1[end_ptr] = nums2[ptr2];
    ptr2--;
}else{
    nums1[end_ptr] = nums1[ptr1];
    ptr1--;
}
end_ptr--;
}
while(ptr2>=0){
nums1[end_ptr] = nums2[ptr2];
ptr2--;
end_ptr--;
// this case
//[0,0,0]
//[2,4,5]
}

}
}