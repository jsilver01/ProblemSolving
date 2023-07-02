a, b =map(int, input().split())

n, m =max(a,b), min(a,b)

while m > 0:
    n,m= m, n%m

print(n)
print((a*b)// n)