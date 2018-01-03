class Node:
	def __init__(self, key):
		self.data = key
		self.left = None
		self.right = None

def print_level_order(root):
	h = height(root)
	for i in range(1, h+1):
		print_given_level(root, i)

def print_given_level(root, level):
	if root is None:
		return
	if level == 1:
		print "%d" %(root.data)
	elif level > 1:
		print_given_level(root.left, level - 1)
		print_given_level(root.right, level - 1)

def height(node):
	if node is None:
		return 0
	else:
		lheight = height(node.left)
		rheight = height(node.right)

		if lheight > rheight:
			return lheight+1
		else:
			return rheight+1

def print_level_order2(root):
	if root is None:
		return

	queue = []

	queue.append(root)

	while(len(queue) > 0):
		print queue[0].data
		node = queue.pop(0)

		if node.left is not None:
			queue.append(node.left)

		if node.right is not None:
			queue.append(node.right)

root = Node(1)
root.left = Node(5)
root.left.left = Node(7)
root.right = Node(9)
root.right.right = Node(10)
root.left.right = Node(11)
root.right.left = Node(3)

print "second level"
print_given_level(root, 2)
print "whole"
print_level_order(root)

print "whole using queue"
print_level_order2(root)