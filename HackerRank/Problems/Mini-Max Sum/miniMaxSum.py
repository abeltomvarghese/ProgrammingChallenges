import time
def miniMaxSum(arr):
    lenArr = len(arr)
    total = 0
    mini = 0
    for count in arr:
        mini += count
    maxim = 0
    current = 0
    for index in range(lenArr):
        current = index
        for num in range(lenArr):
            if num != current:
                total += arr[num]
        if total < mini:
            mini = total
        if total > maxim:
            maxim = total
        total = 0
    print(str(mini), str(maxim))
    t1 = time.time()
    hello = t1 - tO
    print(hello)


tO = time.time()
miniMaxSum([1,2,3,4,5,6,7,8,9])
