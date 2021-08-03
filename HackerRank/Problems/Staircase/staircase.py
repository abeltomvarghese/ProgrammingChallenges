def staircase(n):
    for x in range(1,n+1):
        num = n - x
        print(" " * (num) + "#" * x)

    


n = int(input("Please enter a number "))
staircase(n)
