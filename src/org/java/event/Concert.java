package org.java.event;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concert extends Event {
    public Concert(String title, LocalDate date, int totalSeat, LocalTime time, BigDecimal price) throws IllegalArgumentException{
        super(title, date, totalSeat);
        this.time = time;
        this.price = price;
    }
    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDateTimeFormatted() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatted = dateFormat.format(getDate());
        DecimalFormat decimalFormat = new DecimalFormat("##,##€");
        String priceFormatted = decimalFormat.format(price);
        return dateFormatted + " - " + time.toString() + " - " + getTitle() + " - " + priceFormatted;
    }
}
