/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author moizs
 * @param <T>
 */
public class Node<T extends Comparable<T>> {
    
    Node left;
    Node right;
    Node parent;
    int height;
    int BF;
    T data;

    public Node(T data) {
        this.data = data;
        height = 1;
        BF = 0;
    }
}
