while True:
    #공백으로 입력값 세개를 각각 저장하기
    name, age, weight= input().split()
    #age 와 weight는 int로 변환하여 다시 저장
    age = int(age)
    weight = int(weight)

    if name=="#" and age == 0 and weight == 0:
        break
    else:
        if age > 17 or weight >= 80:
            print(name + " " + "Senior")
        else:
            print(name + " " + "Junior")    