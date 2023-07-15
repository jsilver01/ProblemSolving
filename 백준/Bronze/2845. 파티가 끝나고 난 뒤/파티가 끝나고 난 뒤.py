LP = list(map(int,input().split()))
real = LP[0] * LP[1]

article = list(map(int,input().split()))

for i in range(5):
    article[i] -= real

for i in range(5):
    print(article[i], end=' ')