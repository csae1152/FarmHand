package com.ncr.test.pyramid.data.impl;

import com.ncr.test.pyramid.data.Pyramid;
import com.ncr.test.pyramid.data.PyramidGenerator;

/**
 *
 * @author Helmut
 * @version 1.0
 * Purpose: Generates a static pyramid which will be filled
 * with integers in a range from 1000 to 1000000.
 * 
 * This class is to test YourSolver.java within the testclass YourSolverTest.java
 */

public class StaticPyramidGenerator implements PyramidGenerator {
    private final int rows;
    private final int range;
   
    public StaticPyramidGenerator( int rows, int range ) {
        this.rows = rows;
        this.range = range;
    }

    @Override
    public Pyramid generatePyramid() {

        final int[][] data = new int[rows][rows];

        for ( int row = 0; row < rows; row++ ) {
            for ( int col = 0; col < rows - row; col++ ) {
                for ( int i=1000;i<1000000;i++ )
                    { data[row][col] = i; }
            }
        }
        return new Pyramid(data);
    }
}
