/**
 * A node used to construct binary search trees.
 */
public class TreeNode {

    /**
     * data: the data stored in the node.
     * l: the left child of the node.
     * r: the right child of the node.
     */
    private int data;
    private TreeNode l;
    private TreeNode r;

    /**
     * Constructs a node with the stored data and sets both 
     * children to null.
     * @param data The data to be stored in the node.
     */
    public TreeNode(int data) {
        this.data = data;
        l = null;
        r = null;
    }

    /**
     * Sets the left child for the node.
     * @param n The node to be set.
     */
    public void setL(TreeNode n) {
        l = n;
    }

    /**
     * Sets the right child for the node.
     * @param n The node to be set.
     */
    public void setR(TreeNode n) {
        r = n;
    }

    /**
     * Sets the data cotained in this node.
     * @param data The data to be set.
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * Returns the left child of the node.
     * @return TreeNode l, this nodes left child.
     */
    public TreeNode getL() {
        return l;
    }

    /**
     * Returns the right child of the node.
     * @return TreeNode r, this nodes right child.
     */
    public TreeNode getR() {
        return r;
    }

    /**
     * Returns the data of this node.
     * @return The integer stored in this node.
     */
    public int getData() {
        return data;
    }

}
