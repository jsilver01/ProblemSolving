import sys

plug = int(sys.stdin.readline())
t_sum = 1

for i in range(plug):
    n = int(sys.stdin.readline())
    t_sum += n-1

print(t_sum)