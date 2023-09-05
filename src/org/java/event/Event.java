package org.java.event;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Event {
    public int getReservedSeat;
    private String title;
    private LocalDate date;
    private int totalSeat;
    private int reservedSeat;

    public Event(String title, LocalDate, LocalDate date, int reservedSeat) throws IllegalArgumentException{
        if (this.date.isBefore(LocalDate.now()) || totalSeat <= 0){
            throw new IllegalArgumentException("Invalid Date/Seat");
        }
        this.title = title;
        this.date = this.date;
        this.totalSeat = totalSeat;
        this.reservedSeat = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        if (date.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("Invalid date")
        }
        this.date = date;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public void reserve(int numReservation) throws IllegalArgumentException {
        if (date.isBefore(LocalDate.now()) || numReservation <= 0 || reservedSeat + numReservation > totalSeat) {
            throw new IllegalArgumentException("Invalid reservation");
        }
        reservedSeat += numReservation;
    }

    public void cancel(int numCancel) throws IllegalArgumentException{
        if (date.isBefore(LocalDate.now())) || numCancel <= 0 || reservedSeat - numCancel < 0) {
            throw new IllegalArgumentException("Invalid cancelation")
        }
        reservedSeat -= numCancel:
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatted = dateFormat.format(date);
        return dateFormatted + " - " + title:
    }


}
