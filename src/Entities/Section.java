package Entities;

import java.util.Vector;

public class Section {
    private static int idCounter = 0;
    private int NoOfSeats = 0;
    private int id;
    private Vector<Seat> seats = new Vector<>();
    private float price;
    public static Vector<Section> sections = new Vector<>();

    public Section(Vector<Seat> seats, float price) {
        this.id = idCounter++;
        this.seats = seats;
        this.price = price;
        this.NoOfSeats = seats.size();
        sections.add(this);
    }
    
    public void appendSeat(Seat seat) {
        seats.add(seat);
    }
    
    public Vector<Seat> getAvailableSeats() {
        Vector<Seat> returnValue = new Vector<>();
        for (Seat seat: this.seats) {
            if (seat.isAvailable())
                returnValue.add(seat);
        }
        return returnValue;
    }

    public int getNoOfSeats() {
        return NoOfSeats;
    }

    public int getId() {
        return id;
    }

    public Vector<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Vector<Seat> seats) {
        this.seats = seats;
        this.NoOfSeats = seats.size();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Section{" +
                "NoOfSeats=" + NoOfSeats +
                ", id=" + id +
                ", seats=" + seats +
                ", price=" + price +
                '}';
    }
}
