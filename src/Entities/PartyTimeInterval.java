package Entities;

public class PartyTimeInterval {
    private String date;
    private String from;
    private String to;

    public PartyTimeInterval(String date, String from, String to) {
        this.date = date;
        this.from = from;
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
    
    public String display() {
        return String.format("Date: %s  From: %s  To: %s", date, from, to);
    }

    @Override
    public String toString() {
        return "PartyTimeInterval{" +
                "date=" + date +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
