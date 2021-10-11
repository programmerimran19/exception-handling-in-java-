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
public class AgeOutOfRangeException extends Exception{
    
    private int age;
    AgeOutOfRangeException (int i) {age = i;}
    @Override
    public String toString()
    {
        return "AgeOutOfRangeException[" +age+"]";
    }
    
}
