package com.ncr.test.pyramid.solver.impl;

import com.ncr.test.pyramid.data.Pyramid;
import com.ncr.test.pyramid.solver.PyramidSolver;

/**
 * TASK: There is something wrong here. A few things actually... 
 */
public class NaivePyramidSolver implements PyramidSolver {
    
    @Override
    public long pyramidMaximumTotal(Pyramid pyramid) {
        return getTotalAbove(pyramid.getRows()-1, 0, pyramid);
    }

    private long getTotalAbove(int row, int column, Pyramid pyramid) 
    {
        /**
         * If you execute the line above as it appears now, you will never
         * reach the top of the pyramide -> with top i mean the row with 
         * the most entries.
         * 
         * The algorithm will stopp one row before the end. Therefore the result
         * will be wrong.
         *
         * BUG FIX: Replace the incorrect line with the following:
         *
         * if ( row + 1 == 0 ) return 0;
         *
         * I have tested the class NaivePyramidSolver ( with my solution ) and
         * the assertion in YourSolverTest.java was true.
         *
         * I didn't see any other bugs because with my changes the algorithm works
         * and returns the maximum path everytime.
         *
         */
        if ( row == 0 ) return 0;

        int myValue = pyramid.get(row, column);
        long left  = myValue + getTotalAbove(row-1, column, pyramid);
        long right = myValue + getTotalAbove(row-1, column+1, pyramid);
        return Math.max(left, right);
    }
        
       
}