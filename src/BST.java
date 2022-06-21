/**
 * Binary Search Tree (BST) implementation that stores TreeNode objects.
 * These TreeNode objects can only store integers.
 */
public class BST {

    // The root node of the tree.
    private TreeNode root;

    /**
     * Allows a node to be added to the tree.
     * @param data The data that will be in he node.
     */
    public void addNode(int data) {
        TreeNode n = new TreeNode(data);
        // If there is no root node this new node will be set as the root.
        if (root == null) {
            root = n;
        // Otherwise, it will be set as a child to an existing node in the tree.
        } else {
            setChild(root, n);
        }
    }

    /**
     * This is a recursive method that is used by addNode to set a new node
     * as a child to an existing node.
     * @param n The node to compare the new node to.
     * @param add The new node.
     */
    private void setChild(TreeNode n, TreeNode add) {
        // Integers for the data in the current node and the new node.
        int data = n.getData();
        int newData = add.getData();

        // If the new data is less than the current data, the node will be set to the left.
        if (newData < data) {
            // If the current node has no left child, set the new node as it.
            if (n.getL() == null) {
                n.setL(add);
            // Otherwise, compare the new node to the current nodes left child.
            } else {
                setChild(n.getL(), add);
            }
        // If the new data is more than the current data, the node will be set to the right.
        } else {
            // If the current node has no right child, set the new node as it.
            if (n.getR() == null) {
                n.setR(add);
            // Otherwise, compare the new node to the current nodes right child.
            } else {
                setChild(n.getR(), add);
            }
        }
    }

    /**
     * A method to print out the contents of the tree using a post order traversal.
     * Post order traversals visit the left children, right children, then root.
     */
    public void postOrder() {
        LinkedList temp = new LinkedList();
        LinkedList array = postOrderT(root, temp);
        array.printList();
    }

    /**
     * A recursive method used by postOrder to traverse the tree.
     * @param n The current node being looked at.
     * @param temp The LinkedList which is used to store the nodes traversed.
     * @return The complete LinkedList of traversed nodes.
     */
    private LinkedList postOrderT(TreeNode n, LinkedList temp) {
        if (n != null) {
            postOrderT(n.getL(), temp);
            postOrderT(n.getR(), temp);
            temp.add(n.getData(), temp.getSize());
        }
        return temp;
    }

    /**
     * A method to print out the contents of the tree using a pre order traversal.
     * Pre order traversals visit the root, left children, then right children.
     */
    public void preOrder() {
        LinkedList temp = new LinkedList();
        LinkedList array = preOrderT(root, temp);
        array.printList();
    }

    /**
     * A recursive method used by preOrder to traverse the tree.
     * @param n The current node being looked at.
     * @param temp The LinkedList which is used to store the nodes traversed.
     * @return The complete LinkedList of traversed nodes.
     */
    private LinkedList preOrderT(TreeNode n, LinkedList temp) {
        if (n != null) {
            temp.add(n.getData(), temp.getSize());
            preOrderT(n.getL(), temp);
            preOrderT(n.getR(), temp);
        }
        return temp;
    }

    /**
     * A method to print out the contents of the tree using an in order traversal.
     * In order traversals visit the left children, root, then right children.
     */
    public void inOrder() {
        LinkedList temp = new LinkedList();
        LinkedList array = inOrderT(root, temp);
        array.printList();
    }

    /**
     * A recursive method used by inOrder to traverse the tree.
     * @param n The current node being looked at.
     * @param temp The LinkedList which is used to store the nodes traversed.
     * @return The complete LinkedList of traversed nodes.
     */
    private LinkedList inOrderT(TreeNode n, LinkedList temp) {
        if (n != null) {
            inOrderT(n.getL(), temp);
            temp.add(n.getData(), temp.getSize());
            inOrderT(n.getR(), temp);
        }
        return temp;
    }

}
