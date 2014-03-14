package com.ncr.test.pyramid;

import com.ncr.test.pyramid.data.Pyramid;
import com.ncr.test.pyramid.data.PyramidGenerator;
import com.ncr.test.pyramid.data.impl.RandomPyramidGenerator;
import com.ncr.test.pyramid.solver.PyramidSolver;
import com.ncr.test.pyramid.solver.impl.NaivePyramidSolver;

/**
 * TASK: This is your 1st task. 
 * Please look at the {@link com.ncr.test.pyramid.solver.impl.NaivePyramidSolver} and
 * <ul>
 *   <li>describe or fix the bugs and problems. Comment your changes.
 *   <li>describe or implement test scenarios you need to prove its correctness.
 * </ul>
 */
public class OurProgram {

    /**
     * This doesn't get the correct number
     */
    public static void main(String[] args) {
        final PyramidGenerator generator = new RandomPyramidGenerator(4, 10) {};
        final Pyramid pyramid = generator.generatePyramid();
        
        System.out.println(pyramid);

        final PyramidSolver solver = new NaivePyramidSolver();

        System.out.println("This result is wrong, do you know why ?");
        System.out.println(solver.pyramidMaximumTotal(pyramid));

        System.out.println();
    }
}