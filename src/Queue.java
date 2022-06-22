/**
 * Queue.java
 * @author Euan Watkins
 * @version 1.0
 */

/**
 * Queue implementation that can store integers.
 */
public class Queue {

    /**
     * head: The first item in the queue.
     * tail: The last item in the queue.
     */
    private Link head;
    private Link tail;

    /**
     * Constructs an empty queue.
     */
    public Queue() {
        head = null;
        tail = null;
    }

    /**
     * Returns a boolean which states if the queue is empty or not.
     * @return True if empty, false if not.
     */
    public boolean isEmpty() {
        return (head == null) && (tail == null);
    }

    /**
     * Adds an element of data to the queue.
     * @param data The integer to be added to the queue.
     */
    public void enqueue(int data) {
        Link newNode = new Link(data, null);
        // If the queue is empty, set both head and tail to the new node.
        if (isEmpty()) {
            head = newNode;
        // Otherwise, set the new tail.
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    /**
     * Removes an item from the head of the queue.
     */
    public void dequeue() {
        // If it's an empty queue, make sure tail is also null.
        if (head == null) {
            tail = null;
        } else {
            // Otherwise, set head to head's next.
            head = head.getNext();
            // If head is now null, also set tail to null.
            if (head == null) {
                tail = null;
            }
        }
    }

    /**
     * Returns the head of the queue.
     * @return Element at head of the queue.
     */
    public int peek() {
        // If the queue is empty, return -1 as an indicator of this.
        if (isEmpty()) {
            return -1;
        }
        return head.getData();
    }

}
