package Harry;

public class Accountant extends User {

    // Constructor - revisor skal også bruge "hairyharry" password
    public Accountant(String username, String password, UserRole role){
        super(username, password, role);
    }

    // Returnerer READ_ONLY for permission checks
    @Override
    public String getPermission(){
        return "READ_ONLY";
    }

    // Har adgang til financials (kræver password)
    @Override
    public boolean canAccessFinancials(){
        return true;
    }

    // Kan IKKE oprette aftaler
    @Override
    public void createAppointment(String appointment){
        System.out.println(username + " CAN'T CREATE APPOINTMENT");
    }

    // Kan IKKE slette aftaler
    @Override
    public void deleteAppointment(String appointment){
        System.out.println(username + " CAN'T DELETE APPOINTMENT");
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