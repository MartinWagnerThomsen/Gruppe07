package Harry;


public class Hairdresser extends User {

    // Constructor - bruger "hairyharry" som password ifølge opgaven
    public Hairdresser(String username, UserRole role) {
        super(username, "hairyharry", role);
    }

    // Returnerer FULL_ACCESS for permission checks
    @Override
    public String getPermission() {
        return "FULL_ACCESS";
    }

    // Har adgang til financials (kræver password)
    @Override
    public boolean canAccessFinancials() {
        return true;
    }

    // Kan oprette aftaler
    @Override
    public void createAppointment(String appointment) {
        System.out.println(username + " creates appointment: " + appointment);
    }

    // Kan slette aftaler
    @Override
    public void deleteAppointment(String appointment) {
        System.out.println(username + " deleted appointment: " + appointment);
    }

    // Kan generere finansiel rapport
    @Override
    public void generateFinancialReport(){
        System.out.println(username + " is generating financial report...");
    }

    // Kan se dagens omsætning
    @Override
    public void viewDailyRevenue(){
        System.out.println(username + " is viewing today's revenue");
    }
}