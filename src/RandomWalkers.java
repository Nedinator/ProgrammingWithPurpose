public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int totalSteps = 0;

        for (int trial = 0; trial < trials; trial++) {
            int x = 0, y = 0;
            int steps = 0;

            while (Math.abs(x) + Math.abs(y) < r) {
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

            totalSteps += steps;
        }

        double averageSteps = (double) totalSteps / trials;

        System.out.println("average number of steps = " + averageSteps);
    }
}
