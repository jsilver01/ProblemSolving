N = int(input())
arr = [0]*2002

for i in range(N):
    element= int(input())
    arr[element+1000] += 1

for j in range(2002):
    if arr[j] != 0:
        for k in range(arr[j]):
            print(j-1000)