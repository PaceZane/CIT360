/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrolpattern;

/**
 *
 * 
 */
public class Addition implements doMath {
    
   
    public void execute(Integer first, Integer second){
     
        Integer addition = first + second;
        System.out.println(addition);
    
    }
    
}