public class TriangleClassifier {
    public static String isTriangle(int side1, int side2, int side3) {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            if (side1 == side2 && side2 == side3)
                return "Is a equilateral triangle";
            else if (side1 == side2 || side2 == side3) {
                if (isRightTriangle(side1, side2, side3))
                    return "Is an isosceles and right triangle";
                else
                    return "Is a isosceles triangle";
            }
            else if(isRightTriangle(side1, side2, side3))
                return "Is a right triangle";
            else
                return "Is a triangle";
        }
        else return "Not a triangle";
    }

    private static boolean isRightTriangle(int side1, int side2, int side3) {
        double testSquare1 = Math.sqrt(side1 * side1 + side2 * side2);
        double testSquare2 = Math.sqrt(side1 * side1 + side3 * side3);
        double testSquare3 = Math.sqrt(side3 * side3 + side2 * side2);

        return testSquare1 == side3 || testSquare2 == side2 || testSquare3 == side1;
    }
}
