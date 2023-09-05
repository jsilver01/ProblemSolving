def solution(s):
    answer = True
    count = 0
    length = len(s)
    for i in range (length):
        if s[i] == '(':
            count +=1
            
        else:
            count -=1
            
        if count < 0:
            return False
        
    if count != 0:
        return False
    
    return True