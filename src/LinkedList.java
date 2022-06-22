/**
 * LinkedList.java
 * @author Euan Watkins
 * @version 1.1
 */

/**
 * Linked List implementation that can store integers.
 */
public class LinkedList {

    // The first element of the linked list.
    private Link head;

    /**
     * Constructs an empty linked list.
     */
    public LinkedList() {
        head = null;
    }

    /**
     * Calculates the size of the linked list.
     * @return Integer representing the size of the linked list.
     */
    public int getSize() {
        Link last = head;
        // If it's empty, return 0.
        if (head == null) {
            return 0;
        }
        // If it's not empty, there's at least one element.
        int size = 1;
        // Traverse the list, incrementing the counter after passing an element.
        while (last.getNext() != null) {
            last = last.getNext();
            size++;
        }
        return size;
    }

    /**
     * Prints out the contents of the linked list in order.
     */
    public void printList() {
        Link curNode = head;
        while (curNode != null) {
            System.out.println(curNode.getData());
            curNode = curNode.getNext();
        }
    }

    /**
     * Inserts an element into the linked list at a specified index.
     * @param data The data to be inserted.
     * @param index The index at which the data will be inserted.
     */
    public void add(int data, int index) {
        // If the index is out of range, inform the user.
        if (index > getSize() || index < 0) {
            System.out.println("Invalid Index. Current max index is " + getSize());
        } else {
            Link newNode = new Link(data, null);
            Link curNode = head;
            // If the list is empty, set the head as the new node.
            if (curNode == null) {
                head = newNode;
            } else {
                // Traverse the list until the specified index is reached.
                for (int i = 0; i < index-1; i++) {
                    curNode = curNode.getNext();
                }
                // Move the references around to insert the new node.
                newNode.setNext(curNode.getNext());
                curNode.setNext(newNode);
            }
        }
    }

    /**
     * Deletes an element from the linked list.
     * @param index The index of the item to be deleted.
     */
    public void delete(int index) {
        // If the index is out of range, inform the user.
        if (index > getSize()-1 || index < 0) {
            System.out.println("Invalid Index");
        // If the index is 0, remove the head.
        } else if (index == 0) {
            head = head.getNext();
        } else {
            Link curNode = head;
            // Traverse the list until the specified index is reached.
            for (int i = 0; i < index-1; i++) {
                curNode = curNode.getNext();
            }
            // Remove the node at the reached index.
            curNode.setNext(curNode.getNext().getNext());
        }
    }

    /**
     * Searches for an element at a specified index and return its data.
     * @param index The index to be searched for.
     * @return The data of the found node, or -1 if an invalid index was given.
     */
    public int search(int index) {
        // If the index is invalid, inform the user and return -1 as an indicator of this.
        if (index > getSize()-1 || index < 0) {
            System.out.println("Invalid Index");
            return -1;
        // If the index is 0, return the head's data.
        } else if (index == 0) {
            return head.getData();
        // Traverse the list until the specified index is reached.
        } else {
            Link curNode = head;
            for (int i = 0; i < index; i++) {
                curNode = curNode.getNext();
            }
            return curNode.getData();
        }
    }

    /**
     * Method to return true if the integer passed in as a parameter is in
     * the list, false otherwise.
     * @param data The integer to search the list for.
     * @return Boolean true if the integer is in the list, false otherwise.
     */
    public boolean contains(int data) {
        boolean found = false;
        Link curNode = head;
        while (curNode != null) {
            if (curNode.getData() == data) {
                found = true;
            }
            curNode = curNode.getNext();
        }
        return found;
    }

}
