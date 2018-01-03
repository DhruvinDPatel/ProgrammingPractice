# Complete the function below.
def get_dist(x0, y0, x1, y1):
    d1 = x1 - x0
    d2 = y1 - y0
    
    return (d1**2 + d2**2)**0.5

def  count_rocks(ribbon_length, rocks):
    
    # all possible combinations of rocks
    temp = [(x,y) for x in range(len(rocks)) for y in range(x+1, len(rocks))]
    sum = []
    
    # distance sum to find perimeter
    for i in temp:
        sum.append(get_dist(rocks[i[0]][0],rocks[i[0]][1],rocks[i[1]][0], rocks[i[1]][1]))
    
    no_of_rocks = 0
    ind_len = ribbon_length
    
    for i in sum:
        ind_len -= i
        if ind_len <= 0:
            return no_of_rocks
        else:
            no_of_rocks += 1