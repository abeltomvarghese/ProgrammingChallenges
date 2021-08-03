#!/bin/python3

import math
import os
import random
import re
import sys


def solve(a, b):
    alice = 0 
    bob = 0
    for x in range(3):
        if a[x] < b[x]:
            bob +=1
        elif a[x] > b[x]:
            alice +=1
    result = (str(alice)+ " " + str(bob))
    return result

if __name__ == '__main__':
    

    a = list(map(int, input().rstrip().split()))

    b = list(map(int, input().rstrip().split()))

    result = solve(a, b)
  
    
    
    
    print(result)
    
