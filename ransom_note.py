def ransom_note(magazine, ransom):
    magazine_d = {}
    ransom_d = {}
    
    for i in magazine:
        if i in magazine_d.iterkeys():
            magazine_d[i] += 1
        else:
            magazine_d[i] = 1
            
    for i in ransom:
        if i in ransom_d.iterkeys():
            ransom_d[i] += 1
        else:
            ransom_d[i] = 1
    
    #print magazine_d
    #print ransom_d
    #return all( i in magazine_d.iteritems() for i in ransom_d.iteritems()) - not working with more duplications in magazine

m, n = map(int, raw_input().strip().split(' '))
magazine = raw_input().strip().split(' ')
ransom = raw_input().strip().split(' ')
answer = ransom_note(magazine, ransom)

'''
from collections import Counter

def ransom_note(magazine, rasom):
    return (Counter(rasom) - Counter(magazine)) == {}
'''
