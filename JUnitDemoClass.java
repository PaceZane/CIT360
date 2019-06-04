package JUnitDemoPackage;

import java.math.BigDecimal;

/*
 *
 *
 */
public class JUnitDemoClass {
    
     //Source code created for JUnit Testing Demo 
    public BigDecimal calculate(double operand) {
        BigDecimal ret;

        double calculatedValue = operand * 100 / Math.PI;

        ret = BigDecimal.valueOf(calculatedValue);

        return ret;

    }

}