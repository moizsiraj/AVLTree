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
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tree<Integer> t = new tree();
        t.insert(2);
        t.insert(1);
        t.insert(7);
        t.insert(6);
        t.insert(4);
        t.insert(3);
        t.insert(5);
        t.display();
    }
    
}
