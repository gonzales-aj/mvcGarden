package garden;

import java.util.Scanner;

// Used to schedule the appointment
public class GardenScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the community garden of Moreno Valley College!");
        System.out.print("\nEnter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your contact number: ");
        String userContact = scanner.nextLine();

        Registration registration = new Registration(userName, userContact);

        System.out.println("\nSchedule an appointment: ");
        System.out.print("Enter date: (MM-DD-YYYY): ");
        String date = scanner.nextLine();

        System.out.print("Enter time (Monday - Friday: 8:00 AM - 8:00 PM | Saturday 8:00 PM - 5:00 PM): ");
        String time = scanner.nextLine();

        String donationType = donationCollect(scanner);

        Appointment appointment = new Appointment(date, time); // Saves the date and time
        GardenVisit visit = new GardenVisit(registration, appointment, donationType); // Saves the user's name and contact

        visit.displaySummary(); // Display the entered information
        visit.saveToFile();

        scanner.close();
    }

    private static String donationCollect(Scanner scanner) {
        System.out.println("\nWould you like to make a donation? Options:");
        System.out.println("1. Seeds\n2. Soil\n3. Fertilizer\n4. Gardening Tools\n5. No Donation");
        System.out.print("Choose an option: ");

        int donationChoice = scanner.nextInt();
        scanner.nextLine();

        switch (donationChoice) {
            case 1: return "Seeds";
            case 2: return "Soil";
            case 3: return "Fertilizer";
            case 4: return "Gardening Tools";
            default: return "No Donation";
        }
    }
}
