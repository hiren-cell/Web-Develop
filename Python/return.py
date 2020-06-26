def sum(num1, num2):
    num1+num2

print(sum(4,5))# o/p NONE

def sum1(num1, num2):
    return num1+num2
    return 50# this line never run

print(sum1(3,5)) #o/p 8
total = sum1(3,5)
print(sum1(5, total))