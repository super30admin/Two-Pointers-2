'''
Problem Name: {S30}Nutanix

Source Link: https://www.hackerrank.com/s30-nutanix
'''

# Time Complexity : O(n) for Kadan's Algorithm, O(n log n) for Hackerland Radio Transmitters
# Space Complexity : O(1) for Kadan's Algorithm, O(n) for Hackerland Radio Transmitters
# Did this code successfully run on Leetcode : Yes, both worked on HackerRank
# Any problem you faced while coding this : Yes, understanding the problem requirements and implementing the algorithms correctly.

# Problem 1: Kadan's Algorithm

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'maxSubarray' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def maxSubarray(arr):
    # Write your code here
    # Maximum Subarray Sum (Kadane's Algorithm)
    max_ending_here = max_so_far = arr[0]
    for x in arr[1:]:
        max_ending_here = max(x, max_ending_here + x)
        max_so_far = max(max_so_far, max_ending_here)
    
    # Maximum Subsequence Sum
    max_element = max(arr)
    if max_element < 0:
        max_subsequence_sum = max_element
    else:
        max_subsequence_sum = sum(x for x in arr if x > 0)
    
    return [max_so_far, max_subsequence_sum]

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input().strip())

    for t_itr in range(t):
        n = int(input().strip())

        arr = list(map(int, input().rstrip().split()))

        result = maxSubarray(arr)

        fptr.write(' '.join(map(str, result)))
        fptr.write('\n')

    fptr.close()

# ----------------------------------------------------------------------

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'hackerlandRadioTransmitters' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY x
#  2. INTEGER k
#

def hackerlandRadioTransmitters(x, k):
    # Write your code here
    x = sorted(set(x))  # Remove duplicates and sort
    n = len(x)
    transmitters = 0
    i = 0

    while i < n:
        transmitters += 1
        # Find the farthest house within k units of x[i]
        loc = x[i] + k
        while i < n and x[i] <= loc:
            i += 1
        # Place transmitter at the last house within k units
        transmitter_location = x[i-1]
        # Now skip all houses covered by this transmitter
        loc = transmitter_location + k
        while i < n and x[i] <= loc:
            i += 1

    return transmitters

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    k = int(first_multiple_input[1])

    x = list(map(int, input().rstrip().split()))

    result = hackerlandRadioTransmitters(x, k)

    fptr.write(str(result) + '\n')

    fptr.close()