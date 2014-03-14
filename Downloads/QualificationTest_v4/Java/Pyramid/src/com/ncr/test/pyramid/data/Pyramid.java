package com.ncr.test.pyramid.data;

import com.ncr.test.pyramid.utils.Util;

/**
 * Pyramid type is a data structure for representation of inverted pyramids
 * like this.
 * 
 *     [00059] [00207] [00098] [00095]
 *        [00087] [00001] [00070]
 *           [00036] [00041]
 *               [00023]
 * 
 * The maximal sum of this pyramid is 353.
 * 
 * CORRECTION: The maximal path is [03,00],[02,01],[01,00],[00,01]
 * 
 * The maximal path is [03,00],[02,00],[01,00],[00,01]
 * 
 * You could also imagine same data like this array
 * 
 * [00059] [00207] [00098] [00095]
 * [00087] [00001] [00070] [     ]
 * [00036] [00041] [     ] [     ]
 * [00023] [     ] [     ] [     ]
 * 
 * Therefore addressing looks like this [row][column]
 * 
 *     [00,00] [00,01] [00,02] [00,03]
 *          [01,00] [01,01] [01,02]
 *              [02,00] [02,01]
 *                  [03,00]
 * 
 * 
 */
public class Pyramid {
    private final int rows;
    private final int[][] data;

    public Pyramid(int[][] data) {
        this.data = data;
        this.rows = data.length;
    }
    
    public int[][] getData() {
        return data;
    }
    
    public int get(int row, int col) {
        return data[row][col];
    }

    public int getRows() {
        return rows;
    }

    /**
     * Pretty print me
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int row = 0; row < rows; row++) {
            sb.append(Util.repeatChar(' ', 4 * row));
            for (int col = 0; col < rows - row; col++) {
                sb.append(String.format("[%05d] ", data[row][col]));
            }
            sb.append(Util.NEW_LINE);
        }

        return sb.toString();
    }
}
