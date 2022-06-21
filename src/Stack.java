/**
 * Stack implementation which can store integers.
 */
public class Stack {

    // A node representing the top element of the stack.
    private Link top;

    /**
     * Constructs an empty stack.
     */
    public Stack() {
        top = null;
    }

    /**
     * Return a boolean stating whether or not the stack is empty.
     * @return True if empty, false if not.
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Adds an element on to the top of the stack.
     * @param data The data to be added to the stack.
     */
    public void push(int data) {
        Link newNode = new Link(data, null);
        // If the stack isn't empty, set the new nodes next node
        // to the element that used to be on top.
        if (!isEmpty()) {
            newNode.setNext(top);
        }
        top = newNode;
    }

    /**
     * Removes an element from the top of the stack if it isn't empty.
     */
    public void pop() {
        if (!isEmpty()) {
            top = top.getNext();
        }
    }

    /**
     * Returns the top element of the stack.
     * @return The data of the element on top of the stack.
     */
    public int peek() {
        // Return -1 if the stack is empty as an indicator of this.
        if (isEmpty()) {
            return -1;
        }
        return top.getData();
    }

}
