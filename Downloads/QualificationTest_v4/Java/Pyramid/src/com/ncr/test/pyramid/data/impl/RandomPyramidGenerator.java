package com.ncr.test.pyramid.data.impl;

import com.ncr.test.pyramid.data.Pyramid;
import com.ncr.test.pyramid.data.PyramidGenerator;

import java.util.Random;

/**
 * An example pyramid factory.
 */
public class RandomPyramidGenerator implements PyramidGenerator {
    private final int rows;
    private final int range;
    private final Random random = new Random();

    public RandomPyramidGenerator(int rows, int range) {
        this.rows = rows;
        this.range = range;
    }

    @Override
    public Pyramid generatePyramid() {

        final int[][] data = new int[rows][rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < rows - row; col++) {
                data[row][col] = random.nextInt(range) + 1;
            }
        }
        return new Pyramid(data);
    }
  
}
