/**
 * Copyright 2016 by Pavel Perminov (packpaul@mail.ru)
 */
package com.pp.brickweights;

/**
 * Class for demonstrating Brick weights solver 
 * 
 * @author Pavel Perminov (packpaul@mail.ru)
 */
public class Main {
    
    public static void main(String[] args)
    {
        final int row = 322;
        final int pos = 156;
        
        double weight = new BrickWeightsSolver().weight(row, pos);
        
        System.out.println(
                String.format("Weight pressure exposed to the brick in position (%d, %d) is %f", row, pos, weight));
    }
    
}
