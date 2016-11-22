/**
 * Copyright - Unlicense (http://unlicense.org)
 */
package com.pp.brickweights;

/**
 * Class encapsulates algorithm for solving brick weights problem. Algorithm complexity should be less than O(n^2 / 2),
 * where <i>n</i> is the depth of a brick row
 * 
 * @author Pavel Perminov (packpaul@mail.ru)
 */
public class BrickWeightsSolver {
    
    /**
     * Finds the weight pressure that is exposed to the brick in row {@code row} at position {@code pos} 
     * @param row  row 0-based
     * @param pos  position 0-based
     * @return
     */
    public double weight(int row, int pos) {
        
        if (! ((row >= 0) && (pos >= 0) && (pos <= row))) {
            throw new IllegalArgumentException("Incorrect pos or/and row values!");
        }
        
        double[] weights = new double[row + 1];
        
        for (int r = 1; r <= row; r++) {
            for (int p = r; p > 0; p--) {
                double halfWeight = (weights[p - 1] + 1.0) / 2; 
                weights[p] += halfWeight;
                weights[p - 1] = halfWeight;
            }
        }
        
        return weights[pos];
    }
 
}