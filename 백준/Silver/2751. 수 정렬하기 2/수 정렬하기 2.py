import sys

N = int(sys.stdin.readline())
arr = [0]*2000001

for i in range(N):
    element = int(sys.stdin.readline())
    arr[element+1000000] += 1

for j in range(2000001):
    if arr[j] != 0:
        for k in range(arr[j]):
            print(j-1000000)