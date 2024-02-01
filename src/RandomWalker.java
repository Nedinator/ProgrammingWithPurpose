public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        int steps = 0;

        while (Math.abs(x) + Math.abs(y) < r) {
            System.out.println("(" + x + ", " + y + ")");
            double direction = Math.random();
            if (direction < 0.25) {
                x++;
            } else if (direction < 0.5) {
                y++;
            } else if (direction < 0.75) {
                x--;
            } else {
                y--;
            }
            steps++;
        }
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("steps = " + steps);
    }
}
