/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

import org.junit.Test;
import static org.junit.Assert.*;

public class ex01Tests
{
    @Test
    public void TestRevereString()
    {
        String expectedResult = "ovon";
        String result = ex01.reverString("novo");

        assertEquals(expectedResult, result);
    }

    @Test
    public void TestProduct()
    {
        int expectedResult = 12;
        int result = ex01.product(3, 4);

        assertEquals(expectedResult, result);
    }

    @Test
    public void Testgcd()
    {
        int expectedResult = 2;
        int result = ex01.gcd(12, 2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void TestConvertToInt()
    {
        int expectedResult = 134;
        int result = ex01.convertString("134");

        assertEquals(expectedResult, result);
    }
}
