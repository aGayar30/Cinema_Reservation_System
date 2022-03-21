package Entities;
import java.util.Scanner;
import java.util.Vector;
public class Party {
    public static int idCounter = 0;
    private int id;
    private PartyTimeInterval timeInterval;
    private Theater theater;
    private String film;
    private float price;
    public static Vector<Party> parties = new Vector<Party>();

    public Party(PartyTimeInterval timeInterval, Theater theater, String film, float price) {
        this.id = idCounter++;
        this.timeInterval = timeInterval;
        this.theater = theater;
        this.film = film;
        this.price = price;
        parties.add(this);
    }
    
    public static void CreateParty (Scanner scanner) {
        System.out.println("in create party method");
        System.out.println("Film name: ");
        String filmName = scanner.nextLine();
        System.out.println("Date: ");
        String date = scanner.nextLine();
        System.out.println("From: ");
        String fromInput = scanner.nextLine();
        System.out.println("To: ");
        String toInput = scanner.nextLine();
        PartyTimeInterval interval = new PartyTimeInterval(date, fromInput, toInput);
        System.out.println("Price: ");
        float price = scanner.nextFloat();
        System.out.println("Enter sections number: ");
        int sectionsNumber = scanner.nextInt();
        System.out.println("Enter seats per sections: ");
        int seatsNumber = scanner.nextInt();
        // create sections array
        Vector<Section> sections = new Vector<>();
        for (int i=0; i<sectionsNumber; i++) {
            System.out.println("enter extra price for section "+i+": ");
             float sectionprice = scanner.nextFloat();
            Vector<Seat> seats = new Vector<>();
            for (int j=0; j<seatsNumber; j++) {
                seats.add(new Seat());
            }
            Section section = new Section(seats, sectionprice);
            sections.add(section);
        }
        new Party(interval, new Theater(sections), filmName, price);
        System.out.println("open tab");
    }
    
    public int getId() {
        return id;
    }
    
    public PartyTimeInterval getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(PartyTimeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Party{" +
                "id=" + id +
                ", timeInterval=" + timeInterval +
                ", theater=" + theater +
                ", film='" + film + '\'' +
                ", price=" + price +
                '}';
    }
}
