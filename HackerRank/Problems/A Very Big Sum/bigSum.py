import math
import os
import random
import re
import sys

def aVeryBigSum(ar):
    total = 0
    for x in ar:
        total += x
    return total

if __name__ == '__main__':
    

    ar_count = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = aVeryBigSum(ar)

    print(str(result))

    
