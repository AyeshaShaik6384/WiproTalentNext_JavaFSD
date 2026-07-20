package com.wipro.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSort() {

        DailyTasks obj = new DailyTasks();

        int input[] = {5, 2, 9, 1, 3};

        int expected[] = {1, 2, 3, 5, 9};

        assertArrayEquals(expected, obj.sortValues(input));
    }
}