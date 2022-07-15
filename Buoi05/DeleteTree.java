
class Node {

    int key;
    Node left, right;

    Node(int x) {
        this.key = x;
        left = right = null;
    }
}

class BSTree {

    Node root;

    public BSTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void insert(int x) {
        if (isEmpty()) {
            root = new Node(x);
            return;
        }
        Node findNode = root, parent = null;
        while (findNode != null) {
            if (findNode.key == x) {
                System.out.println(x + " đã có");
                return;
            }
            parent = findNode;
            if (findNode.key > x)
                findNode = findNode.left;
            else
                findNode = findNode.right;
        }
        if (parent.key > x)
            parent.left = new Node(x);
        else
            parent.right = new Node(x);

    }

    Node findNode(int x) {
        Node nd = root;
        while (nd != null && nd.key != x)
            if (nd.key > x)
                nd = nd.left;
            else
                nd = nd.right;
        return nd; // nd==null?
    }

    boolean delete(int x) { // xóa giá trị x
        Node nX = root, parentX = null;
        while (nX != null && nX.key != x) {
            parentX = nX;
            if (nX.key > x)
                nX = nX.left;
            else
                nX = nX.right;
        }
        if (nX == null)
            return false;
        if (nX.left == null || nX.right == null) { // case 1,2.
            if (parentX == null) {
                // root = root.right;
                if (root.left != null)
                    root = root.left;
                else {
                    root = root.right;
                }
            } else if (parentX.key < x) {
                parentX.right = nX.right;
                if (nX.left != null)
                    parentX.right = nX.left;
            } else {
                parentX.left = nX.right;
                if (nX.left != null)
                    parentX.left = nX.left;
            }
        } else {// case 2 con !=null
            Node rootOfRight = nX.right, leftMost = nX.right, parent = null;
            while (leftMost.left != null) {
                parent = leftMost;
                leftMost = leftMost.left;
            }
            nX.key = leftMost.key;
            if (parent == null) {
                nX.right = leftMost.right;
            } else {
                parent.left = leftMost.right;
            }
        }
        return true;
    }

    void printTree(Node node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.print(node.key + " ");
        printTree(node.right);
    }
}

public class DeleteTree {
    public static void main(String[] args) {
        BSTree bst = new BSTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(15);
        bst.insert(40);
        bst.insert(30);
        bst.insert(35);
        bst.printTree(bst.root);
        bst.delete(10);
        System.out.println("");
        bst.printTree(bst.root);
    }
}
