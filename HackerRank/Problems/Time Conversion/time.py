import time
def timeConversion(s):
    checker = s[8:]
    hour = 0
    result = ""
    if checker == "PM":
        if int(s[:2]) == 12:
            result += s[:2]
        else:
            hour = int(s[:2])
            hour += 12
            if hour == 24:
                result += "00"
            else:
                result += str(hour)
        result += s[2:8]
    else:
        if s[:2] == "12":
            result += "00"
            result += s[2:8]
        else:
            result += s[:8]
    
    return result

tO = time.time()
s = "07:05:45PM"
result = timeConversion(s)
print(result)
t1 = time.time()
total = t1 - tO
print(total)
