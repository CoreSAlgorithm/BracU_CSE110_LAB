import java.util.Scanner;

public class Samplefinal {
    public static void main(String[] args) {

        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        double[] x = {0.39, 0.72, 1.00, 1.52, -5.20};
        double[] y = {0.24, 0.00, 0.00, 0.99, 2.86};
        double[] z = {-0.10, 0.44, -0.02, 0.21, 0.42};

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int idx = -1;
        for (int i = 0; i < planets.length; i++) {
            if (planets[i].equals(input)) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            System.out.println("Invalid Input");
            return;
        }

        String closestPlanet = "";
        double minDist = Double.MAX_VALUE;

        for (int i = 0; i < planets.length; i++) {
            if (i == idx) continue;

            double dist = Math.pow(x[i] - x[idx], 2)
                        + Math.pow(y[i] - y[idx], 2)
                        + Math.pow(z[i] - z[idx], 2);

            if (dist < minDist) {
                minDist = dist;
                closestPlanet = planets[i];
            }
        }

        System.out.println("Closest Planet : " + closestPlanet);
        System.out.printf("Distance : %.6f%n", minDist);
    }
}
