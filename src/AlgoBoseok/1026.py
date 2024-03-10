import sys

sys.stdin = open('/Users/song/Desktop/Python/Python/h.txt', 'r')

n = int(input())
A = sorted(list(map(int, sys.stdin.readline().split(" "))), reverse=True)  # 정렬된 A
B = list(map(int, sys.stdin.readline().split(" ")))

res = 0
while A:
    num_A = A.pop()  # A 가장 작은수
    num_B = max(B)  # B 가장 큰 수
    res += num_A * num_B # 결과값 더해줌

    B.pop(B.index(num_B)) # 가장 큰 수 제거

print(res)


#
""" right 정렬하지 말라며 .."""
N = int(sys.stdin.readline())
left = list(map(int,sys.stdin.readline().rstrip().split(" ")))
right =  list(map(int,sys.stdin.readline().rstrip().split(" ")))

left.sort()
right.sort(reverse=True)

res = 0

for i in range(N):
    res += left[i]*right[i]
print(res)