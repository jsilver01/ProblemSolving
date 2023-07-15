date = int(input())
carnumber=list(map(int,input().split()))
count = 0

for i in range(5):
    if date == carnumber[i]:
        count += 1

print(count)