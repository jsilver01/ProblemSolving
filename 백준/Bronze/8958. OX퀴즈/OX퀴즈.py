num = int(input()) #실행횟수 입력받기

for _ in range(num):
    s = input()
    count = 0
    sum = 0
    # 문자열 s를 한글자씩 순회하면서 반복문 실행 j는 각 문자를 나타내는 변수
    for j in s:  
        if j == 'O':
            count += 1
        else: 
            #'o'가 아닌 문자가 나오면 점수는 0 으로 초기화
            count = 0
        sum += count

    print(sum)