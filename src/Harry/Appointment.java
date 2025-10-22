package Harry;

import java.time.LocalDateTime;

public class Appointment {
    private int id;
    private Customer customer;
    private LocalDateTime dateTime;
    private int duration;
    private Order order;
    private AppointmentStatus status;

    // Constructor
    public Appointment(int id, Customer customer, LocalDateTime dateTime, int duration){
        this.id = id;
        this.customer = customer;
        this.dateTime = dateTime;
        this.duration = duration;
        this.order = null;  // RETTET: Sættes eksplicit til null
        this.status = AppointmentStatus.SCHEDULED;
    }

    // Getters
    public int getId() {return id; }  // RETTET: Fjernet duplikeret metode
    public Customer getCustomer() { return customer; }
    public LocalDateTime getDateTime() { return dateTime; }
    public int getDuration() { return duration; }
    public Order getOrder() { return order; }
    public AppointmentStatus getStatus() { return status; }

    // Setter for order - TILFØJET
    public void setOrder(Order order) {
        this.order = order;
    }

    // Viser detaljer om aftalen
    public String getAppointmentDetails() {
        String orderInfo = (order != null) ? order.getOrderDetails() : "No order yet";

        return "Appointment ID: " + id +
                "\nCustomer: " + customer.getName() +
                "\nDate and time: " + dateTime +
                "\nDuration in minutes: " + duration +
                "\nOrder: " + orderInfo +
                "\nStatus: " + status;
    }

    // Fuldfør aftalen
    public void completeAppointment(){
        if (status != AppointmentStatus.CANCELLED) {
            status = AppointmentStatus.COMPLETED;
            System.out.println("Appointment " + id + " is completed");
        } else {
            System.out.println("Appointment has been cancelled and cannot be completed");
        }
    }

    // Aflys aftalen
    public void cancelAppointment(){
        if (status == AppointmentStatus.COMPLETED) {
            System.out.println("Cannot cancel completed appointment");
        } else {
            status = AppointmentStatus.CANCELLED;
            System.out.println("Appointment " + id + " has been cancelled");
        }
    }

    // Tjek om aftalen er gennemført
    public boolean isCompleted(){
        return status == AppointmentStatus.COMPLETED;
    }

    @Override
    public String toString(){
        return getAppointmentDetails();
    }
}
