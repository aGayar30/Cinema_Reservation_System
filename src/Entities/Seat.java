package Entities;

import java.util.Vector;

public class Seat {
    public static int idCounter = 0;
    private int id;
    private boolean available;
    public static Vector<Seat> seats = new Vector<>();

    public Seat(boolean available) {
        this.id = idCounter++;
        this.available = available;
        seats.add(this);
    }

    public Seat() {
        this.id = idCounter++;
        this.available = true;
        seats.add(this);
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", available=" + available +
                '}';
    }
}
