package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static test.Triangle.*;
import static test.Triangle.TriangleType.*;

public class testTriangle {
    @Test
    public void test1() {
        final Triangle.TriangleType type = Triangle.classify(1, 2, 3);
        assertEquals(SCALENE, type);
    }

    @Test
    public void testInvalid1() {
        final TriangleType type = Triangle.classify(1, 2, 4);
        assertEquals(INVALID, type);
    }

    @Test
    public void testInvalid2() {
        final TriangleType type = Triangle.classify(1, 4, 2);
        assertEquals(INVALID, type);
    }

    @Test
    public void testInvalid3() {
        final TriangleType type = Triangle.classify(4, 1, 2);
        assertEquals(INVALID, type);
    }

    @Test
    public void testInvalidNeg1() {
        final TriangleType type = Triangle.classify(-1, 1, 1);
        assertEquals(INVALID, type);
    }

    @Test
    public void testInvalidNeg2() {
        final TriangleType type = Triangle.classify(1, -1, 1);
        assertEquals(INVALID, type);
    }

    @Test
    public void testInvalidNeg3() {
        final TriangleType type = Triangle.classify(1, 1, -1);
        assertEquals(INVALID, type);
    }

    @Test
    public void testEquiliteral() {
        final TriangleType type = Triangle.classify(1, 1, 1);
        assertEquals(EQUILATERAL, type);
    }

    @Test
    public void testIsoceles1() {
        final TriangleType type = Triangle.classify(2, 2, 3);
        assertEquals(ISOSCELES, type);
    }

    @Test
    public void testIsoceles2() {
        final TriangleType type = Triangle.classify(2, 3, 2);
        assertEquals(ISOSCELES, type);
    }

    @Test
    public void testIsoceles3() {
        final TriangleType type = Triangle.classify(3, 2, 2);
        assertEquals(ISOSCELES, type);
    }

    @Test
    public void testInvalid() {
        final TriangleType type = Triangle.classify(3, 1, 1);
        assertEquals(INVALID, type);
    }
}
