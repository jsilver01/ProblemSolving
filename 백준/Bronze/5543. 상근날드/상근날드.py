burger=[]
for i in range(3):
    b=int(input())
    burger.append(b)
    
drink=[]
for i in range(2):
    d=int(input())
    drink.append(d)

set_min = min(burger) + min(drink) - 50

print(set_min)