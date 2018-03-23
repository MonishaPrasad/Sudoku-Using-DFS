/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;

/**
 *
 * @author Ramesh
 */
public class Node {
    private int x_pos;
    private int y_pos;
    private int branchValue;
    private ArrayList<Integer> possibleValues;
    private ArrayList<Node> ChildNodes;

    public Node(){
        possibleValues = new ArrayList<Integer>();
        ChildNodes = new ArrayList<Node>();
    }

    public Node(int x, int y){
        this();
        this.x_pos = x;
        this.y_pos = y;
    }    
    
    /**
     * @return the x_pos
     */
    public int getX_pos() {
        return x_pos;
    }

    /**
     * @return the y_pos
     */
    public int getY_pos() {
        return y_pos;
    }

    /**
     * @return the branchValue
     */
    public int getBranchValue() {
        return branchValue;
    }

    /**
     * @param branchValue the branchValue to set
     */
    public void setBranchValue(int branchValue) {
        this.branchValue = branchValue;
    }

    /**
     * @return the possibleValues
     */
    public ArrayList<Integer> getPossibleValues() {
        return possibleValues;
    }

    /**
     * @return the ChildNodes
     */
    public ArrayList<Node> getChildNodes() {
        return ChildNodes;
    }
    
    public void addPossibleValue(int value) {
        possibleValues.add(value);
    }
    
    public void createChildNodes(Node node) {
        for(int value : possibleValues){
            Node childNode = new Node(node.getX_pos(), node.getY_pos());
            childNode.branchValue = value;
            ChildNodes.add(childNode);
        }
    }
}
