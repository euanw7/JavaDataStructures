/**
 * A node used to construct linked structures, such as linked lists, queues and stacks.
 */
public class Link {

    /**
     * data: The data held in this node.
     * next: A reference to the node next to this one.
     */
    private int data;
    private Link next;

    /**
     * Constructs the node.
     * @param data The data stored in this node.
     * @param next A reference to the node next to this one.
     */
    public Link(int data, Link next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Changes the reference to the node after this one.
     * @param n The node that will be replacing the last.
     */
    public void setNext(Link n) {
        this.next = n;
    }

    /**
     * Return this node's next node.
     * @return A Node object.
     */
    public Link getNext() {
        return next;
    }

    /**
     * Returns the data stored in this node.
     * @return The integer stored in the node.
     */
    public int getData() {
        return data;
    }
}
