num = list(map(int,input().split()))

for i in range(3):
    mini = i
    for j in range(i,3):
        if num[j]< num[mini]:
            mini = j
    num[i], num[mini] = num[mini], num[i]

for i in range(3):
    print(num[i],end=' ')