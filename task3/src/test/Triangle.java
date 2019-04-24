package test;

import java.io.DataInputStream;
import java.io.IOException;

public class Triangle {
    public enum TriangleType {
        INVALID, SCALENE, EQUILATERAL, ISOSCELES
    }
        public static TriangleType classify(final int s1, final int s2, final int s3) {
            int trian;
            if ((s1 <= 0) || (s2 <= 0) || (s3 <= 0)) {
                return TriangleType.INVALID;
            }
            trian = 0;
            if (s1 == s2) {
                trian = trian + 1;
            }
            if (s1 == s3) {
                trian = trian + 2;
            }
            if (s2 == s3) {
                trian = trian + 3;
            }
            if (trian == 0) {
                if (((s1 + s2) < s3) || ((s1 + s3) < s2) || ((s2 + s3) < s1)) {
                    return TriangleType.INVALID;
                } else {
                    return TriangleType.SCALENE;
                }
            }
            if (trian > 3) {
                return TriangleType.EQUILATERAL;
            }
            if ((trian == 1) && ((s1 + s2) > s3)) {
                return TriangleType.ISOSCELES;
            } else if ((trian == 2) && ((s1 + s3) > s2)) {
                return TriangleType.ISOSCELES;
            } else if ((trian == 3) && ((s2 + s3) > s1)) {
                return TriangleType.ISOSCELES;
            }
            return TriangleType.INVALID;
    }
}

class Test_Triangle {
    public static void main (String[] args) throws IOException {
        // Declare stdin so data can be read from input.
        DataInputStream stdin = new DataInputStream (System.in);
        // loop exits when the user response is "n"
        String user_response = "y";
        while (!user_response.equals("n")) {
            // Ask user for 3 dimensions of triangle.
            System.out.println ("\nEnter side1 length: ");
            int side1 = Integer.parseInt (stdin.readLine());
            System.out.println ("Enter side2 length: ");
            int side2 = Integer.parseInt (stdin.readLine());
            System.out.println ("Enter side3 length: ");
            int side3 = Integer.parseInt (stdin.readLine());
            // Now use these values to create a Triangle object.
            Triangle tri = new Triangle();
            // Determine what kind of triangle it is.
            System.out.println ("\nTriangle type: "+tri.classify(side1,side2,side3));
            // Ask user if they want to continue.
            System.out.println ("\nDo you want to examine more triangles?");
            System.out.println ("(type 'y' for yes or 'n' for no)");
            user_response = stdin.readLine();
        }
    }
}
