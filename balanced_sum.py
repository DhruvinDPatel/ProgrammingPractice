def balancedSum(sales):
    sum = 0
    leftsum = 0
    n = len(sales)
    
    for i in range(n):
        sum += sales[i]
        
    for i in range(n):
        sum -= sales[i]
        
        if leftsum == sum:
            return i
        
        leftsum += sales[i]