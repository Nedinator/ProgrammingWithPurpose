public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean isPositiveLengths = a > 0 && b > 0 && c > 0;

        int a2 = (int) Math.pow(a, 2);
        int b2 = (int) Math.pow(b, 2);
        int c2 = (int) Math.pow(c, 2);

        boolean isRightTriangle = isPositiveLengths && (
                a2 + b2 == c2
                || a2 + c2 == b2
                || b2 + c2 == a2
                );

        System.out.println(isRightTriangle);

    }
}
