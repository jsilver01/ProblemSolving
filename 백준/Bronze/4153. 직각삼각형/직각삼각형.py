while True:
    arr = list(map(int,input().split()))

    if(arr[0]==0 and arr[1]==0 and arr[2]==0):
        break
    
    a = arr[0] * arr[0]
    b = arr[1] * arr[1]
    c = arr[2] * arr[2]
    
    max = a
    if(a<b):
        if(b<c):
            max = c #a<b<c
        else:
            max = b #a<b and b>c
    else: 
        if(a<c):
            max = c #b<a<c 
        else:
            max = a #b<a and a>c 

    if(max==a):
        if(b+c==max):
            print("right")
        else:
            print("wrong")
    elif(max==b):
        if(a+c==max):
            print("right")
        else:
            print("wrong")
    else:
        if(a+b==max):
            print("right")
        else:
            print("wrong")
