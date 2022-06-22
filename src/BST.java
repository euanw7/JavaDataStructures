/**
 * BST.java
 * @author Euan Watkins
 * @version 1.1
 */

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
    public void insert(int data) {
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
     * This is a recursive method that is used by insert to set a new node
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
        LinkedList array = postOrderT(root, new LinkedList());
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
        LinkedList array = preOrderT(root, new LinkedList());
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
        LinkedList array = inOrderT(root, new LinkedList());
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

    /**
     * Method to delete a node from the tree by specifying the nodes data.
     * This method is mainly used to call deleteNode().
     * @param data The data contained in the node you want to delete.
     */
    public void delete(int data) {
        // Check if the given data is in the tree before trying to delete it.
        LinkedList treeContents = inOrderT(root, new LinkedList());
        if (!treeContents.contains(data)) {
            // If it's not in the tree, notify the user.
            System.out.println("\nThat integer isn't in the list.");
        } else {
            deleteNode(root, data);
        }
        
    }

    /**
     * A recursive method called by delete() to remove a node from the tree.
     * @param n The current node being observed.
     * @param data The data in the node to be deleted.
     * @return The next node to be looked at.
     */
    private TreeNode deleteNode(TreeNode n, int data) {
        if (n == null) {
            return n;
        }
        if (data < n.getData()) {
            n.setL(deleteNode(n.getL(), data));
        } else if (data > n.getData()) {
            n.setR(deleteNode(n.getR(), data));
        } else {
            // Node with 0 or 1 child.
            if (n.getL() == null) {
                return n.getR();
            } else if (n.getR() == null) {
                return n.getL();
            }

            // Node with 2 children.
            n.setData(minValue(n.getR()));
            n.setR(deleteNode(n.getR(), n.getData()));
        }

        return n;
    }

    /**
     * Method to find the smallest value in a tree starting with the
     * node passed in as a parameter.
     * @param n The starting node.
     * @return The smallest value in the tree.
     */
    private int minValue(TreeNode n) {
        int min = n.getData();
        while (n.getL() != null) {
            min = n.getL().getData();
            n = n.getL();
        }
        return min;
    }

}
