package tree;


/**
 * Created by SHILPESH on 08-Feb-17.
 */
public class TreeUtility {

    public static TreeNode insertIntoTree(TreeNode root, TreeNode nodeToInsert) {
        TreeNode currentNode = null;
        currentNode = root;
        //If Root is Null
        if (root == null) {
            root = nodeToInsert;
            return root;
        }
        if (root.compareTo(nodeToInsert) > 0) {
            //root is greater than current node
            currentNode.setRight(nodeToInsert);

        }
        if (root.compareTo(nodeToInsert) > 0) {
            //root is Lesser than current node
            currentNode.setLeft(nodeToInsert);
        }
        return root;
    }

    public static void printTree(TreeNode root) {

    }

    public static void inOrderTraversal(TreeNode root) {

        if (root == null) {

        }

    }
}
