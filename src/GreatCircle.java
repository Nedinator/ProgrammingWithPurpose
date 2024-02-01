public class GreatCircle {
    public static void main(String[] args) {
        double lat1 = Math.toRadians(Double.parseDouble(args[0]));
        double lon1 = Math.toRadians(Double.parseDouble(args[1]));
        double lat2 = Math.toRadians(Double.parseDouble(args[2]));
        double lon2 = Math.toRadians(Double.parseDouble(args[3]));

        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;

        double a = Math.pow(Math.sin(dLat / 2), 2) +
                Math.cos(lat1) * Math.cos(lat2) *
                        Math.pow(Math.sin(dLon / 2), 2);

        double adjustedA = Math.min(a, 1.0);

        double c = 2 * Math.atan2(Math.sqrt(adjustedA), Math.sqrt(1 - adjustedA));

        double radius = 6371.0;
        double distance = radius * c;

        System.out.printf("%.6f kilometers%n", distance);
    }
}
