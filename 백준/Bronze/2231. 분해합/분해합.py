n = int(input()) #분해합을 입력값으로 받음

for i in range(1,n+1):
    num = list(map(int,str(i)))
    num_sum = i + sum(num) #분해합 = 생성자 + 각 자리수의 합
    if num_sum == n:
        print(i)
        break
    if i == n: #생성자 i 와 입력값이 같으면 생성자가 없다는 뜻
        print(0)