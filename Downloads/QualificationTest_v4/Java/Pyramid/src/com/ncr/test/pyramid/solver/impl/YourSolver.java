package com.ncr.test.pyramid.solver.impl;

import com.ncr.test.pyramid.data.Pyramid;
import com.ncr.test.pyramid.solver.PyramidSolver;

/**
 * TASK: This is your 2nd task. 
 * Please implement the class to satisfy the interface. *
 */
public class YourSolver implements PyramidSolver {

    @Override
    public long pyramidMaximumTotal(Pyramid pyramid) {
        
        // return getTotalAbove(pyramid.getRows()-1, 0, pyramid);
       return getTotalAbove(0, 0, pyramid);
        
    }
    
    
    private long getTotalAbove(int row, int column, Pyramid pyramid) {
    
        //for (int i = row+2; i >= 0; i--) {
        for ( int i = (pyramid.getRows())-2; i >= 0; i-- ) {
            for (int j = 0; j <= i; j++) {
                
                /**
                 * if ( (pyramid.data[i][j] += pyramid.data[i+1][j]) > pyramid.data[i+1][j+1] ) {
                 *                return pyramid.data[i+1][j]; }
                 *                   else {
                 *                       return pyramid.data[i + 1][j + 1]; }
                 * 
                 * 
                 * 
                 */

 
                /**
                 * Using dynamic programing to solve the task.
                 * 
                 * Don't use the recursive function anymore. Using an iterative
                 * approach instead.
                 * 
                 * 
                 */
                pyramid.getData()[i][j] += pyramid.getData()[i + 1][j] > pyramid.getData()[i + 1][j + 1] ? pyramid.getData()[i + 1][j] : pyramid.getData()[i + 1][j + 1];
                // pyramid.getData()[i][j] += Math.max(pyramid.getData()[i + 1][j], pyramid.getData()[i + 1][j + 1]); 
                //pyramid.data[i][j] += pyramid.data[i + 1][j] > pyramid.data[i + 1][j + 1] ? pyramid.data[i + 1][j] : pyramid.data[i + 1][j + 1];
            }
          }         
             
                return pyramid.getData()[0][0];
    }
            
    
}
