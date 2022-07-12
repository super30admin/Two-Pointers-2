# Time Complexity: O(n)
# Space Complexity: O(1)

def removeDuplicates(nums):
    if nums is None or len(nums) < 2:
        return len(nums)

    count = 1
    j = 1
    for i in range(len(nums)):
        if nums[i] == nums[i-1]:
            count += 1
        else:
            count = 1
        if count <= 2:
            nums[j] = nums[i]
            j += 1

    return j










# def removeDuplicates(nums):
#     if nums is None or len(nums) == 0:
#         return 
    
#     dict = {}
#     for i in range(len(nums)):
#         if nums[i] not in dict:
#             dict[nums[i]] = 1
#         else:
#             dict[nums[i]] += 1
#             if dict[nums[i]] > 2:
#                 del dict[nums[i]]
#                 dict[nums[i]] -= 1
#             else:
#                 dict[nums[i]] += 1
    
#     return sum(dict.values())


# nums = [1,1,2,2,3,3,3]
# print(removeDuplicates(nums))
