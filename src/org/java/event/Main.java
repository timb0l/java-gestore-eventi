package org.java.event;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert event details: ");
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Date (format dd/MM/yyyy): ");
        String dateString = sc.nextLine();
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Total seats: ");
        int totalSeat = sc.nextInt();

        try {
            Event event = new Event(title, date, totalSeat);
            System.out.print("Event created: " + event.toString());

            System.out.print("Make a reservation? y/n");
            String answer = sc.next();
            if (answer.equals("y")){
                System.out.print("How many seats? ");
                int numReservation = sc.nextInt();
                event.reserve(numReservation);
                System.out.println("Reservation made.");
            }

            System.out.println("Reserved seat: " + event.getReservedSeat());
            System.out.println("Available seat: " + (event.getTotalSeat() - event.getReservedSeat()));

            System.out.print("Cancel? y/n");
            answer = sc.next();
            if (answer.equals("y")){
                System.out.print("how many seats to cancel? ");
                int numCancel = sc.nextInt();
                System.out.println("Cancelled");
            }
            System.out.println("Reserved seat after the cancellation: " + event.getReservedSeat());
            System.out.println("Available seat after the cancellation: " + (event.getTotalSeat() - event.getReservedSeat()));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: ");
        }
    }
}
