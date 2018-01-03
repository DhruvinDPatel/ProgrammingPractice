def has_cycle(head):
    c = head
    n = head.next
    
    while c is not n:
        if c is None or n is None:
            return False
        
        c = c.next
        n = n.next
    
    return True
    