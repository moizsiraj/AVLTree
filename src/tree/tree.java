/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author moizs
 */
public class tree<T extends Comparable<T>> {

    Node root;

    public void insert(T value) {
        Node n = new Node(value);
        if (root == null) {
            root = n;
        } else {
            Node temp = root;
            Node prev = root;
            while (temp != null) {

                if (n.data.compareTo(temp.data) < 0) {
                    prev = temp;
                    temp = temp.left;
                } else {
                    prev = temp;
                    temp = temp.right;
                }
            }
            if (n.data.compareTo(prev.data) < 0) {
                prev.left = n;
                n.parent = prev;
            } else {
                prev.right = n;
                n.parent = prev;
            }
        }
        setHeight(n);
        setBF(n);
    }

    private void setHeight(Node n) {
        n = n.parent;
        while (n != null) {
            if (n.left != null && n.right != null) {
                if (n.left.height != n.right.height) {
                    n.height = Math.max(n.left.height, n.right.height) + 1;
                } else {
                    n.height = n.left.height + 1;
                }
            } else if (n.left != null && n.right == null) {
                n.height = n.left.height + 1;
            } else if (n.left == null && n.right != null) {
                n.height = n.right.height + 1;
            }
            n = n.parent;
        }
    }

    private void setBF(Node n) {
        n = n.parent;
        while (n != null) {
            if (n.left != null && n.right != null) {
                n.BF = Math.abs(n.left.height-n.right.height);
            } else if (n.left != null && n.right == null) {
                n.BF = n.left.height;
            } else if (n.left == null && n.right != null) {
                n.BF = n.right.height;
            }
            n = n.parent;
        }
    }


    public void LNR(Node r) {
        if (r != null) {
            LNR(r.left);
            System.out.println(r.data + " height: " + r.height + " BF: " + r.BF);
            LNR(r.right);
        }
    }

    public void display() {
        LNR(root);
    }

    public boolean find(T data) {
        if (root == null) {
            System.out.println("Tree Empty");;
        } else {
            Node<T> temp = root;
            while (temp != null) {
                if ((data.compareTo(temp.data)) == 0) {
                    return true;
                } else if (data.compareTo(temp.data) < 0) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
        }
        return false;
    }
}
