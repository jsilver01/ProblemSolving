def solution(s):
    stack = []
    for char in s:
        if not stack:
            stack.append(char)
        else:
            top = stack.pop()
            if top+char != '()':
                stack.append(top)
                stack.append(char)

    return len(stack)==0