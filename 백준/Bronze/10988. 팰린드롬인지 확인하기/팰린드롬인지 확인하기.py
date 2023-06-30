word = list(input())
length = len(word)
right = 0
wrong = 0

if length % 2==0: #글자수 짝수
    for i in range(int(length/2)):
        if word[i]!= word[length-1-i]:
            wrong += 1
        else:
            right += 1
else: #글자수 홀수
    for i in range(int(length/2)):
        if word[i]!= word[length-1-i]:
            wrong += 1
        else: #word[i]==word[length-1-i]인 경우
            right += 1 

if right == int(length/2):
    print("1")
elif wrong > 0:
    print("0")