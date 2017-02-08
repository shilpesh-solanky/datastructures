package datastructure.tree;

import java.util.Objects;

/**
 * Created by SHILPESH on 08-Feb-17.
 */
public class TreeNode {

    int data;

    TreeNode right;

    TreeNode left;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }


    public int compareTo(TreeNode node) {

        final int EQUAL = 0;
        final int LESSER = -1;
        final int GREATER = 1;

        if (this == node) {
            return EQUAL;
        }
        if (this.data > node.getData()) {
            return GREATER;
        } else {
            return LESSER;
        }
    }
}
