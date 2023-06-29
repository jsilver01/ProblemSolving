num = int(input())
arr = list(map(int,input().split()))
count = 0

for i in range(num):
    n = arr[i]
    #소수구하는 부분
    answer = []
    x = 2
    while x <= n:
        if n % x == 0:
            if x not in answer:
                answer.append(x)
            n //=x
        else:
            x += 1
    #여기까지
    #소수는 인수가 1과 자기 자신이므로 answer배열 길이가 1이어야함
    if(len(answer)==1 and answer[0]==arr[i]):
        count += 1

print(count)