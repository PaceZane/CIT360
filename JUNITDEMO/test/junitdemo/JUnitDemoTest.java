/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitdemo;

import org.junit.Test;
import static org.junit.Assert.*;


public class JUnitDemoTest {

    @Test
    public void testCompareString() {
        JUnitDemo demo = new JUnitDemo();
        assertTrue(demo.compareString("hello", "hello"));
    }

    @Test
    public void testCompareString2() {
        JUnitDemo demo = new JUnitDemo();
        assertFalse(demo.compareString("hello", "goodbye"));
    }

    @Test
    public void testConcatString() {
        JUnitDemo demo = new JUnitDemo();
        assertEquals("HelloWorld", demo.concatString("Hello", "World"));
    }

    @Test
    public void testAddOneToArray() {
        JUnitDemo demo = new JUnitDemo();
        int expected[] = new int[]{3, 8};
        assertArrayEquals(expected, demo.addOneToArray(new int[]{2, 7}));
    }

    @Test(timeout = 10)
    public void testPerformance() {
        JUnitDemo demo = new JUnitDemo();
        demo.performance();
    }

    @Test(expected = ArithmeticException.class)
    public void testException() {
        JUnitDemo demo = new JUnitDemo();
        demo.exception(0);
    }

}
