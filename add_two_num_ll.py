class Solution(object):
    def addTwoNumbers(self, l1, l2):
        
        l_1, l_2, l_3 = [], [], []
        
        while l1:
            l_1.append(l1.val)
            l1 = l1.next
            
        while l2:
            l_2.append(l2.val)
            l2 = l2.next
        
        for x in range(len(l_1)-1,0,-1):
            l_3.append(l_1[x]+l_2[x])
            
        first_node = ListNode(l_3[0])
        
        for x in l_3[1:]:
            new_node = ListNode(x)
            first_node.next = new_node
            
        return first_node