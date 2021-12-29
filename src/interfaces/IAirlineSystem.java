package interfaces;

import java.sql.Date;

import javax.swing.JComboBox;
import javax.swing.JTable;

import classes.Airport;
import classes.Customer;
import classes.Person;
import classes.Planes;

public interface IAirlineSystem {
	public boolean AdminLogin(Person p);
	
	public boolean Customerlogin(Customer c);
	public boolean signup(Customer c);
	
	public void displayTrips(JTable table);
	public void displayAllCustomers(JTable table);
	public void displayAllBookigs(JTable table);
	public void editUserDetail();
	public void bookingTrip();
	public void getAirportInfo();
	
	public void DisplayTrips(JTable table);
	public void viewHistory(String username, JTable table);
	public void fillPlaneTable(JTable table);
	
	public boolean removePlane(Planes p);
	public boolean addAirport(String aid, String country, String city);
	public void setComboBoxes(JComboBox tripid);
	public boolean addGeneralPlane(String planeId,String pname,String cap,String fclassCap, String businesClassCap,String econCap);
	public boolean checkSeats(int s,int trip);
	public int getFlightID(int plane);
	public void BookTrip(String bookingID,String username,int seats,String seatType,int packageID,int tripID,int flightID,String bookingdate,String time);
}
