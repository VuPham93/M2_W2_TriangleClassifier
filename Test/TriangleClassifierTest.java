import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testIsTriangle1() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;
        String expected = "Is a equilateral triangle";

        String result = TriangleClassifier.isTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testIsTriangle2() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;
        String expected = "Is a isosceles triangle";

        String result = TriangleClassifier.isTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testIsTriangle3() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 6;
        String expected = "Is a triangle";

        String result = TriangleClassifier.isTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testIsTriangle4() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        String expected = "Is a right triangle";

        String result = TriangleClassifier.isTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testIsTriangle5() {
        int side1 = -1;
        int side2 = 2;
        int side3 = 1;
        String expected = "Not a triangle";

        String result = TriangleClassifier.isTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testIsTriangle6() {
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;
        String expected = "Not a triangle";

        String result = TriangleClassifier.isTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }
}