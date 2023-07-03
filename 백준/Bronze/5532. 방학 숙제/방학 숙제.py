#방학기간
L = int(input())
#a-국어총페이지/b-수학총페이지/c-하루에국어가능양/d-하루에수학가능양
A = int(input())
B = int(input())
C = int(input())
D = int(input())

for i in range(L):
    if (C * i) >= A:
        korean = i
        break

for i in range(L):
    if  (D * i) >= B:
        math = i
        break
    
vacation = L - max(korean, math)
print(vacation)