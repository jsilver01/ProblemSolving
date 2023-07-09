t_sum = 0
a= [0]*5

for i in range(5):
    a[i] = int(input())

for i in range(5):
    if a[i]<40:
        a[i]=40
    t_sum += a[i]

avg = int(t_sum/5)

print(avg)