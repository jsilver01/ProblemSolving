num=list(map(int,input().split()))

N = num[0]
K = num[1]
total = 1
for i in range(K):
    total = total * N
    N -= 1

factorial = 1
for i in range(K,0,-1):
    factorial = factorial * i

result = int(total/factorial)
print(result)