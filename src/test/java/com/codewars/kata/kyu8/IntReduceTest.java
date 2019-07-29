package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IntReduceTest
{
    @Test
    void sample()
    {
        assertEquals(6, IntReduce.grow(new int[] { 1, 2, 3 }));
        assertEquals(24, IntReduce.grow(new int[] { 1, 2, 3, 4 }));
        assertEquals(16, IntReduce.grow(new int[] { 4, 1, 1, 1, 4 }));
        assertEquals(64, IntReduce.grow(new int[] { 2, 2, 2, 2, 2, 2 }));
    }
}
