import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSamplesCollected = 0;
        int rounds = 0;

        System.out.println("Asif has gone for a walk in the park.");

        while (true) {
            System.out.print("Enter the number of leaf samples collected during this round (or enter 0 to finish): ");
            int samplesCollected = scanner.nextInt();

            if (samplesCollected == 0) {
                break;
            }

            totalSamplesCollected += samplesCollected;
            rounds++;

            if (totalSamplesCollected >= 30) {
                System.out.println("Asif completed a round and returned home.");
                break;
            }
        }

        System.out.println("\nAsif collected a total of " + totalSamplesCollected + " leaf samples.");
        System.out.println("He took " + rounds + " rounds around the park.");

        scanner.close();
    }
}
