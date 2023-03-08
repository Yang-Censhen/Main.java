package exercise3.flight.booking.system;

import java.time.LocalDate;

public class FlightBooking{
    private LocalDate DepartingDate;
    private LocalDate ReturnDate;
    private String FlightCompany;
    private String TripSource;
    private String TripDestination;
    private String PassengerFullName;
    private String TicketNumber;
    private int ChildPassengers;
    private int AdultPassengers;
    private int TotalPassengers;
    private double TotalTicketPrice;
    public FlightBooking(String aNull,LocalDate depart,LocalDate returnDate,int x,int y){
        this.PassengerFullName=aNull;
        this.DepartingDate=depart;
        this.ReturnDate=returnDate;
        this.ChildPassengers=x;
        this.AdultPassengers=y;
    }
    public String toString(){
        return "Dear " + PassengerFullName + ". Thank you for booking your flight with " +
                FlightCompany + ". Following are the details of your booking and the trip:" + "\n"+
                "Ticket Number: " + TicketNumber + "\n" +
                "From " + TripSource + " to " + TripDestination + "\n" +
                "Date of departure: " + DepartingDate + "\n" +
                "Date of return: " + ReturnDate + "\n" +
                "Total passengers: " + TotalPassengers + "\n" +
                "Total ticket price in Euros: " + TotalTicketPrice;
    }
    public String getTicketNumber(){
        return TicketNumber;
    }
    public void setTicketNumber(String TicketNumber){
        this.TicketNumber=TicketNumber;
    }
    public String getTripSource(){
        return TripSource;
    }
    public void setTripSource(String TripSource){
        this.TripSource=TripSource;
    }
    public String getTripDestination(){
        return TripDestination;
    }
    public void setTripDestination(String TripDestination){
        this.TripDestination=TripDestination;
    }
    public LocalDate getDepartingDate(){
        return DepartingDate;
    }
    public void setDepartingDate(LocalDate DepartingDate){
        this.DepartingDate=DepartingDate;
    }
    public LocalDate getReturnDate(){
        return ReturnDate;
    }
    public void setReturnDate(LocalDate ReturnDate){
        this.ReturnDate=ReturnDate;
    }
    public String getFlightCompany(){
        return FlightCompany;
    }
    public void setFlightCompany(String FlightCompany){
        this.FlightCompany=FlightCompany;
    }
    public String getPassengerFullName(){
        return PassengerFullName;
    }
    public void setPassengerFullName(String PassengerFullName){
        this.PassengerFullName=PassengerFullName;
    }
    public int getChildPassengers(){
        return ChildPassengers;
    }
    public int getAdultPassengers(){
        return AdultPassengers;
    }
    public void setTotalPassengers(int X,int y){
        this.TotalPassengers=ChildPassengers+AdultPassengers;
    }
    public int getTotalPassengers(){
        return TotalPassengers;
    }
    public double getTotalTicketPrice(){
        return TotalTicketPrice;
    }
    public void setTotalTicketPrice(double z){
    }
}








