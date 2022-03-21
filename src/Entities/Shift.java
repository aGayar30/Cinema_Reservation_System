package Entities;

import Entities.Helpers.Date;

public class Shift {
    private Date from;
    private Date to;

    public Shift(Date from, Date to) {
        this.from = from;
        this.to = to;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Shift{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
