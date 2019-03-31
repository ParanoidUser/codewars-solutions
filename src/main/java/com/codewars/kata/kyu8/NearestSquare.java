package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5a805d8cafa10f8b930005ba">Find Nearest square number</a>
 */
public class NearestSquare
{
    public static int kata(final int n)
    {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}