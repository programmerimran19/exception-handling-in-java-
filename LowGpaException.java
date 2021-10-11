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
public class LowGpaException extends Exception{
    
    private double gpa;
    LowGpaException (double j) {gpa = j;}
    @Override
    public String toString()
    {
        return "LowGpaException[" +gpa+"]";
    }
    
}
