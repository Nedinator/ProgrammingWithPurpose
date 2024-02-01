import java.util.Arrays;

public class WeekOnePracticeQuestion {
    public static void main(String[] args) {
        // 1.2.30 Uniform random numbers. Write a program that prints five uniform random numbers between 0 and 1, their average value, and their minimum and maximum values. Use Math.random(), Math.min(), and Math.max().
        try{
            double[] numbs = {Math.random(),Math.random(),Math.random(),Math.random(),Math.random()};
            double min = Arrays.stream(numbs).min().getAsDouble();
            double max = Arrays.stream(numbs).max().getAsDouble();
            double avg = Arrays.stream(numbs).sum() / numbs.length;

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.println("Average: " + avg);
        } catch (NumberFormatException err){
            System.out.println("Error formatting...");
        }


    }
}
