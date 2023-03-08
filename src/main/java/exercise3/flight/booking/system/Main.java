package exercise3.flight.booking.system;

import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public  static void main(){

        Scanner in=new Scanner(System.in);

        String TripSource="NANJING";
        String TripDestination="OULU";

        String SourceAirport="NANJING LUKOU INTERNATIONAL AIRPORT";
        String DestinationAirport="OULU AIRPORT";

        String FlightCompany="Flights-of-Fancy";

        String FlightID="FOF"+Math.random()*9000+1000+"IN";

        String sdepart="2023-03-12";
        LocalDate depart=LocalDate.parse(sdepart);

        String sreturn="2023-03-14";
        LocalDate returnDate=LocalDate.parse(sreturn);

        Double departingTicketPrice=500.00;
        Double returnTicketPrice=600.00;

        FlightBooking fb=new FlightBooking("John Doe",depart,returnDate,1,3 );

        int expResult=4;
        int result = fb.getTotalPassengers();

        fb.setDepartingDate(LocalDate.parse("2023-03-12"));
        fb.setReturnDate(LocalDate.parse("2023-03-14"));
        fb.setTripSource("NANJING");
        fb.setTripDestination("OULU");
        fb.setTicketNumber("we12345");
        fb.setPassengerFullName("John Doe");
        fb.setTotalPassengers(1,3);
        fb.setTotalTicketPrice(4500);
        fb.setFlightCompany("Flights-of-Fancy");

        System.out.println("Welcome to Fancy Flight Booking!");

        int childPassengers=in.nextInt();
        int adultPassengers=in.nextInt();

        int totalPassengers=fb.getTotalPassengers();

        double totalTicketPrice=fb.getTotalTicketPrice();

        totalPassengers=childPassengers+adultPassengers;

        System.out.println("Dear " + fb.getPassengerFullName() + ". Thank you for booking your flight with " +
                        fb.getFlightCompany() + ". Following are the details of your booking and the trip:" + "\n"+
                        "Ticket Number: " + fb.getTicketNumber() + "\n" +
                        "From " + fb.getTripSource() + " to " + fb.getTripDestination() + "\n" +
                        "Date of departure: " + fb.getDepartingDate() + "\n" +
                        "Date of return: " + fb.getReturnDate() + "\n" +
                        "Total passengers: " + fb.getTotalPassengers() + "\n" +
                        "Total ticket price in Euros: " + fb.getTotalTicketPrice());
        in.close();
    }
}
