/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Programmer Imran
 */
public class Main {

    public static void main(String[] args) {
        
        try{
            System.out.println("Enter Your Age");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            Test.compute(a);
            
        }catch(AgeOutOfRangeException e){
            System.out.println("Sorry!! Your Age Out of Range " +e);
        }
        try{
            System.out.println("Enter Your Gpa");
            Scanner s1 = new Scanner(System.in);
            double b = s1.nextDouble();
            Test.compute2(b);
        }catch(LowGpaException f){
            System.out.println("Sorry!! Your GPA is not sufficient to apply for this job" +f);
        }
        
    }
    
}
