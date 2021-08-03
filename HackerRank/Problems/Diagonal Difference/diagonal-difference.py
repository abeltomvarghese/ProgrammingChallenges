import math
import os
import random
import re
import sys

def diagonalDifference(arr):
    totalA = 0 
    totalB = 0
    countB = len(arr)-1
    for count in range(len(arr)):
        totalA += arr[count][count]
        if countB >-1 :
            totalB += arr[count][countB]
            countB-=1
    diff = abs(totalA - totalB)
    return diff
if __name__ == '__main__':
    

    n = int(input())

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(arr)
    print(result)
    

   
