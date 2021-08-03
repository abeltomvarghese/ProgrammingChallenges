import time
def birthdayCakeCandles(ar):
    tallest = 0
    num = 0

    for candle in ar:
        if candle >= tallest:
            tallest = candle
    for candle in ar:
        if tallest == candle:
            num += 1
    print(num)
    t1 = time.time()
    hello = t1 - tO
    print(hello)

tO = time.time()
age = int(input("Enter Age: "))
candleArray = list(map(int, input("Enter the height: ").rstrip().split()))
birthdayCakeCandles(candleArray)
