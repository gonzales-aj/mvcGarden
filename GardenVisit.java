package garden;

import java.io.FileWriter;
import java.io.IOException;

// Used to display entered information
public class GardenVisit {
    private Registration registration;
    private Appointment appointment;
    private String donationType;

    interface Donation {
        void donate();
    }

    public GardenVisit(Registration registration, Appointment appointment, String donationType) {
        this.registration = registration;
        this.appointment = appointment;
        this.donationType = donationType;
    }


    public void displaySummary() {
        System.out.println("\n\t-- Appointment Summary --");
        System.out.println("Name: " + registration.getName());
        System.out.println("Contact: " + registration.getContact());
        System.out.println("Appointment Date: " + appointment.getDate());
        System.out.println("Appointment Time: " + appointment.getTime());
        System.out.println("Donation: " + donationType);
    }

    public void saveToFile() {
        try (FileWriter writer = new FileWriter("appointment_summary.txt", true)) { 
            writer.write("User: " + registration.getName() + ", Contact: " + registration.getContact() + "\n");
            writer.write("Appointment Date: " + appointment.getDate() + ", Time: " + appointment.getTime() + "\n");
            writer.write("Donation: " + donationType + "\n\n");
            System.out.println("Appointment saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving appointment.");
        }
    }
}
