/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Programmer Imran
 */
public class Test {
    
    static void compute (int a) throws AgeOutOfRangeException{
        
        if (a < 20)
        {
            throw new AgeOutOfRangeException(a);
            
        }
        else if(a > 40)
        {
            throw new AgeOutOfRangeException(a);
        }
        System.out.println("Thank You!! You are available");
    }
    
    static void compute2 (double b) throws LowGpaException{
        
        if (b < 2.5)
        {
            throw new LowGpaException(b);
        }
        System.out.println("Thank You!! You are available for this job");
    }
    
}
