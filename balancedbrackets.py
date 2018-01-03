def  balanced( a_str):
    stack_l = [] #use this as a stack
    
    for i in a_str:
        if i == '[':
            stack_l.append(']')
        elif i == '{':
            stack_l.append('}')
        elif i == '(':
            stack_l.append(')')
        else:
            if (len(stack_l) == 0 or i != stack_l[len(stack_l)-1]):
                return False
            stack_l.pop()
    
    if len(stack_l) == 0:
        return True
    else:
        return False