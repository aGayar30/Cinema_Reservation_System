package Entities;

import java.util.Vector;

public class Ticket {
    public int idCounter = 0;
    public int id;
    private float price;
    private Seat seat;
    private String film;
    private Theater theater;
    private String paymentType;
    public static Vector<Ticket> tickets = new Vector<>();


    public Ticket(float price, Seat seat, String film, Theater theater, String paymentType) {
        this.id = idCounter++;
        this.price = price;
        this.seat = seat;
        this.film = film;
        this.theater = theater;
        this.paymentType = paymentType;
        tickets.add(this);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", seat=" + seat +
                ", film='" + film + '\'' +
                ", theater=" + theater +
                ", paymentType='" + paymentType +
                '}';
    }
    
    public String show(Section section, float totalPrice) {
        return String.format(
                "Film= %s\n"
                + "Theater= %d\n"
                + "Section= %d\n"        
                + "Seat= %d\n"
                + "Payment Type= %s\n"
                + "Total Price= %.2f EGP\n"
                + "Enjoy your movie!!\n"
        , film, theater.getId(), section.getId(), seat.getId(), paymentType, totalPrice);
    }
}
