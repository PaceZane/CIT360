/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * 
**/

public class MVCDiscountCalculator {

     

    public static void main(String[] args) {

         

        DiscountCalculatorView theView = new DiscountCalculatorView();

         

        DiscountCalculatorModel theModel = new DiscountCalculatorModel();

         

        DiscountCalculatorController theController = new DiscountCalculatorController(theView,theModel);

         

        theView.setVisible(true);

         
   }

}