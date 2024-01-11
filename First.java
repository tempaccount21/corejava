import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tsc = 0;
        int rounds = 0;

        System.out.println("Asif has gone for a walk in the park.");

        while (true) {
            System.out.print("Enter the leaf sample count collected during this round (or enter enough to stop collecting samples): ");
            int samplesCollected = scanner.nextInt();

            if (samplesCollected == "enough") {
                break;
            }

            tsc += samplesCollected;
            rounds++;

            if (tsc >= 30) {
                System.out.println("Asif completed taking samples and returned home.");
                break;
            }
        }

        System.out.println("\nAsif collected a total of " + tsc + " leaf samples.");
        System.out.println("He took " + rounds + " rounds around the park.");

        scanner.close();
    }
}
