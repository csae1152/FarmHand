package com.ncr.test.pyramid.solver;

import com.ncr.test.pyramid.data.Pyramid;
//import com.ncr.test.pyramid.data.PyramidGenerator;
//import com.ncr.test.pyramid.data.impl.StaticPyramidGenerator;

/**
 * Please uncomment the next line to test that my bug fixes in
 * class NaivePyramidSolver are correct.
 * 
 * Of course you have to uncomment my chances in class NaivePyramidSolver
 * first.
 * 
 * import com.ncr.test.pyramid.solver.impl.NaivePyramidSolver;
 */ 

import com.ncr.test.pyramid.solver.impl.YourSolver;
import junit.framework.Assert;
import org.junit.Test;

/**
 * TASK: This is your 3rd task. 
 * Implement or describe tests you need to prove that your implementation is correct.
 * 
 * If you have JUnit 4.0+ installed you can uncomment imports, @Test and Assert
 * and run the test directly
 */
public class YourSolverTest {
    @Test
    public void testPyramidMaximumTotal() {
    {
               
            /**
             * Please uncomment the next line and comment YourSolver()
             * to test that my bug fixes in class NaivePyramidSolver are correct.
             * 
             */
        
            //final PyramidSolver solver = new NaivePyramidSolver();
            final PyramidSolver solver = new YourSolver();
        
            final Pyramid pyramid = new Pyramid(new int [][]
                {
                    {  59,  207,   98, 95},
                    {  87,    1,   70,  0},
                    {  36,   41,    0,  0},
                    {  23,    0,    0,  0},
                });

            
            /**
             * IMPROVMENT: To test and verify that my solution is also
             * correct with a big amount of data i modified the generating
             * method of pyramid.
             * 
             * StaticPyramidGenerator always generates the same pyramid, so 
             * i can test my solution.
             * 
             * The new generating method has the only purpose to test huge 
             * amount of data as input. 
             */
            
            //generates a static pyramid
            //final PyramidGenerator generator = new StaticPyramidGenerator(99, 10000) {};
            //final Pyramid pyramid = generator.generatePyramid();
           
            final long total = solver.pyramidMaximumTotal(pyramid);
            System.out.println(pyramid);
            System.out.println();
            System.out.printf("Total:    %d\n", total);
            System.out.printf("Expected: %d\n", 353);
            Assert.assertEquals(353, total);
        }
    }
}
