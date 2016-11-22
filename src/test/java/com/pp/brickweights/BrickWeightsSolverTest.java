/**
 * Copyright 2016 by Pavel Perminov (packpaul@mail.ru)
 */
package com.pp.brickweights;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test cases for {@link BrickWeightsSolver}
 * 
 * @author Pavel Perminov (packpaul@mail.ru)
 */
public class BrickWeightsSolverTest {
    
    private static final double COMPARISON_DELTA = 0.0001;
    
    private final BrickWeightsSolver solver = new BrickWeightsSolver();

    @Test
    public void testWeight_0_0() {
        final double weight = solver.weight(0, 0);
        
        assertEquals(0.0, weight, COMPARISON_DELTA);
    }
    
    @Test
    public void testWeight_1_0() {
        final double weight = solver.weight(1, 0);
        
        assertEquals(0.5, weight, COMPARISON_DELTA);
    }
    
    @Test
    public void testWeight_1_1() {
        final double weight = solver.weight(1, 1);
        
        assertEquals(0.5, weight, COMPARISON_DELTA);
    }
    
    @Test
    public void testWeight_2_0() {
        final double weight = solver.weight(2, 0);
        
        assertEquals(0.75, weight, COMPARISON_DELTA);
    }
    
    @Test
    public void testWeight_2_1() {
        final double weight = solver.weight(2, 1);
        
        assertEquals(1.5, weight, COMPARISON_DELTA);
    }
    
    @Test
    public void testWeight_2_2() {
        final double weight = solver.weight(2, 2);
        
        assertEquals(0.75, weight, COMPARISON_DELTA);
    }
    
    @Test
    public void testWeight_3_0() {
        final double weight = solver.weight(3, 0);
        
        assertEquals(0.875, weight, COMPARISON_DELTA);
    }
    
    @Test
    public void testWeight_3_1() {
        final double weight = solver.weight(3, 1);
        
        assertEquals(2.125, weight, COMPARISON_DELTA);
    }
    
    @Test
    public void testWeight_3_2() {
        final double weight = solver.weight(3, 2);
        
        assertEquals(2.125, weight, COMPARISON_DELTA);
    }
    
    @Test
    public void testWeight_3_3() {
        final double weight = solver.weight(3, 3);
        
        assertEquals(0.875, weight, COMPARISON_DELTA);
    }
    
    @Test
    public void testWeight_322_156() {
        final double weight = solver.weight(322, 156);
        
        assertEquals(306.48749781747574, weight, COMPARISON_DELTA);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testWeightIncorrectArgs() {
        solver.weight(3, 5);
    }
    
}
