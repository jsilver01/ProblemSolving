while True:
    n = input()

    if n=='0':
        break
    if n == n[::-1]: #리스트의 슬라이싱을 이용해 문자열을 뒤집어서 원래 문자열과 같으면 yes출력
        print("yes")
    else:
        print("no")