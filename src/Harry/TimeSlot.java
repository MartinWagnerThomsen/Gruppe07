package Harry;

import java.time.LocalTime;
import java.time.Duration;

public class TimeSlot {
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean isAvailable;

    // Constructor med availability
    public TimeSlot(LocalTime startTime, LocalTime endTime, boolean isAvailable){
        this.startTime = startTime;
        this.endTime = endTime;
        this.isAvailable = isAvailable;
    }

    // Constructor uden availability (default true)
    public TimeSlot(LocalTime startTime, LocalTime endTime){
        this(startTime, endTime, true);
    }

    // Getters
    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setters
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setAvailable(boolean available){
        this.isAvailable = available;
    }

    // RETTET: Korrekt overlap logik
    public boolean overlaps(TimeSlot other){
        return this.startTime.isBefore(other.endTime) &&
                other.startTime.isBefore(this.endTime);
    }

    // Beregn varigheden i minutter
    public long getDuration(){
        return Duration.between(startTime, endTime).toMinutes();
    }

    // Tjek om et tidspunkt er inden for dette slot
    public boolean contains(LocalTime time) {
        return !time.isBefore(startTime) && time.isBefore(endTime);
    }

    // Formateret info
    public String getTimeSlotInfo(){
        return "Start time: " + startTime +
                "\nEnd time: " + endTime +
                "\nDuration: " + getDuration() + " minutes" +
                "\nAvailability: " + (isAvailable ? "Available" : "Not available");
    }

    @Override
    public String toString() {
        return startTime + " - " + endTime + (isAvailable ? " (Available)" : " (Unavailable)");
    }
}
