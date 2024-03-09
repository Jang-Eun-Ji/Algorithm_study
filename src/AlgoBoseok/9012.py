import sys

sys.stdin = open('/Users/song/Desktop/Python/Python/h.txt', 'r')

n = int(input())

for i in range(n):
    temp = input()
    while '()' in temp:
        temp = temp.replace("()","")
    if temp:
        print("NO")
    else:
        print("YES")
