import math
import os
import random
import re
import sys

def plusMinus(arr):
    above = 0
    below = 0
    for count in arr:
        if count > 0:
            above += 1
        elif count < 0:
            below += 1
    zero = len(arr) - above - below
    print(above/len(arr))
    print(below/len(arr))
    print(zero/len(arr))

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
