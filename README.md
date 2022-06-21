# JavaDataStructures
The purpose of this project is to implement some abstract data types as data structures in Java. For the purpose of keeping the project simple, these data structures are only able to store integers for now. Four have been completed so far:

- Queue
- Stack
- Linked List
- Binary Search Tree

## Classes

### Link
The Link class represents a link in a linked data structure such as a queue, a stack, or a linked list. It can store an integer which is the data contained in the link and a pointer to the link which comes after it.

### Queue
A queue consists of a head and a tail, which are Link objects. The head is the front of the queue and the tail is the back. Links can be enqueued onto the tail and dequeued from the head. The queue can be queried to check if it's empty and to see what data is stored in the head without removing it.

### Stack
A stack stores one Link object named top which represents the Link on top of the stack. Links can be pushed on to or popped off the top of the stack. The stack can be queried to check if it's empty and to see what data is stored on top without removing it.

### Linked List
A linked list stores one Link named head which represents the Link at the beginning of the list. Links can be added to the list by starting at the head and moving onto the next Link until you reach the end. Links can also be deleted from the list by providing the index of the Link you want to delete. Lists can be queried to get the size of the list, to print the contents of the list, and to search the list for a specific Link.

### Tree Node
The TreeNode class represents a node in a binary search tree. It can store an integer which is the data contained in the node and two other TreeNode objects which are this nodes left and right children.

### Binary Search Tree
A binary search tree stores one TreeNode object named root which is the beginning of the tree. Nodes can be added to the tree by comparing the new node to the existing nodes and placing it as a leaf depending on the nodes values. A leaf is a node which has no children, so it is at the bottom of a branch. Trees can be queried to traverse and print out the contents of the nodes with post-order, pre-order, and in-order traversals. 