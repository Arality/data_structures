class Node:
    next = None
    prev = None
    data = None

class LinkedList:
    def __init__(self, data):
        self.node = Node()
        self.head = self.node
        self.node.data = data

    def __str__(self):
        return str(self.node.data)

    def add(self, data) -> None:
        newNode = Node()
        newNode.prev = self.node
        self.node.next = newNode
        self.node = newNode
        self.node.data = data
    
    def pop(self) -> None:
        if self.node.prev == None:
            return
        self.node = self.node.prev
        self.node.next = None

    def contains(self, item) -> bool:
        tempNode = self.head
        while True:
            if tempNode.next == None:
                return False
            elif tempNode.data == item:
                return True
            else:
                tempNode = tempNode.next

List = LinkedList("Hello Word")
List.add(2)
List.add(4)
print(List.contains(2))