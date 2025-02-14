package garden;

// Used to store the user's information
public class Registration {
    private String name;
    private String contact;

    public Registration(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public void displayRegistration() {
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
    }
}
