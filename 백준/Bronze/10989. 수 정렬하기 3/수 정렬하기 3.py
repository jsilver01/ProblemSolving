import sys

N = int(sys.stdin.readline())  # 빠른 입력을 위해 sys.stdin을 사용
check = [0]*10001

for i in range(N):
    num = int(sys.stdin.readline())
    check[num] += 1

for j in range(10001):
    if check[num] != 0:
        for k in range(check[j]):
            print(j)
