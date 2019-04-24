package test;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testDate {
    @Test
    public void test1() {
        Date date = new Date(6, 12, 2014);
        assertEquals(date.displayResult(date,10), "Jun 22, 2014");
    }

    @Test
    public void test2() {
        Date date = new Date(6, 12, 2014);
        assertEquals(date.displayResult(date,20), "Jul 2, 2014");
    }

    @Test
    public void test3() {
        Date date = new Date(6, 12, 2014);
        assertEquals(date.displayResult(date, 20),"Jul 2, 2014");
    }

    @Test
    public void test4() {
        Date date = new Date(12, 15, 2014);
        assertEquals(date.displayResult(date, 20),"Jan 4, 2015");
    }

    @Test
    public void test5() {
        Date date = new Date(12, 15, 1955);
        assertEquals(date.displayResult(date, 30),"Jan 14, 1956");
    }

    @Test
    public void test6() {
        Date date = new Date(12, 15, 1955);
        assertEquals(date.displayResult(date, -30),"Nov 15, 1955");
    }

    @Test
    public void test7() {
        Date date = new Date(12, 15, 1955);
        assertEquals(date.displayResult(date, 16),"Dec 31, 1955");
    }

    @Test
    public void test8() {
        Date date = new Date(12, 15, 1955);
        assertEquals(date.displayResult(date, 17),"Jan 1, 1956");
    }

    @Test
    public void test9() {
        Date date = new Date(12, 15, 1955);
        assertEquals(date.displayResult(date, 80),"Mar 4, 1956");
    }


    @Test
    public void test10() {
        Date date = new Date(3, 5, 1957);
        assertEquals(date.displayResult(date, -80),"Dec 15, 1956");
    }
}
