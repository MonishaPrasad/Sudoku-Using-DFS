/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Ramesh
 */
public class Sudoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] board = new int[][] {
            {0,2,0,6,0,8,0,0,0},
            {5,8,0,0,0,9,7,0,0},
            {0,0,0,0,4,0,0,0,0},
            {3,7,0,0,0,0,5,0,0},
            {6,0,0,0,0,0,0,0,4},
            {0,0,8,0,0,0,0,1,3},
            {0,0,0,0,2,0,0,0,0},
            {0,0,9,8,0,0,0,3,6},
            {0,0,0,3,0,6,0,9,0}};
        
        Puzzle puzzle = new Puzzle(board);
        puzzle.Solve();
        puzzle.printBoard();
    }
    
}
