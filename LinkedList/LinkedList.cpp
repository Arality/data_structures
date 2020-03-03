#include <iostream>

struct Node{
    auto &data;
    int &next = NULL;
    int &previous = NULL;
}

class LinkedList{
    private:
        Node node;

    public:
        LinkedList(auto &data){
            this.node = Node();
            this.node.data = data;
        }

        addItem(auto &data){
            Node &currentNode = Node();
            currentNode.previous = this.node;
            this.node.next = currentNode;
            this.node = currentNode;
        }
}