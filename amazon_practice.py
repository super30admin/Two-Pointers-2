

# #!/bin/python3

# import math
# import os
# import random
# import re
# import sys



# #
# # Complete the 'foo' function below.
# #
# # The function is expected to return an INTEGER.
# # The function accepts following parameters:
# #  1. STRING_ARRAY codeList
# #  2. STRING_ARRAY shoppingCart
# #

# def foo(codeList, shoppingCart):
    
#     # assumed winner if list is empty
#     if not codeList:
#         return 1 
    
#     # define 2 indices one to point to cart & group in secret list
#     cart_idx = 0
#     code_list_idx = 0
    
#     while code_list_idx < len(codeList) and cart_idx < len(shoppingCart):
#         code = codeList[code_list_idx]
#         code_idx = 0
        
#         while code_idx < len(code) and cart_idx < len(shoppingCart):
#             if (code[code_idx] == shoppingCart[cart_idx]) or (code[code_idx] == "anything"):
#                 code_idx += 1
#             else:
#                 # if either they both dont match or the word in secret is not anything
#                 # reset the group idx 
#                 code_idx = 0
             
#             # irrespective of above cases, move the cart ptr to next word
#             cart_idx += 1
         
#         # once while loop terminates and we are done traversing through one group
#         # inc main pointer (group_idx)
#         if code_idx == len(code):
#             code_list_idx += 1
            
#     if code_list_idx == len(codeList):
#         return 1
        
#     return 0
    
        

# if __name__ == '__main__':
#     fptr = open(os.environ['OUTPUT_PATH'], 'w')

#     codeList_count = int(input().strip())

#     codeList = []

#     for _ in range(codeList_count):
#         codeList_item = input()
#         codeList.append(codeList_item)

#     shoppingCart_count = int(input().strip())

#     shoppingCart = []

#     for _ in range(shoppingCart_count):
#         shoppingCart_item = input()
#         shoppingCart.append(shoppingCart_item)

#     result = foo(codeList, shoppingCart)

#     fptr.write(str(result) + '\n')

#     fptr.close()



# failed for
# 4
# orange
# apple apple
# banana orange apple
# banana
# 7
# orange
# apple
# apple
# banana
# orange

# apple
# banana
