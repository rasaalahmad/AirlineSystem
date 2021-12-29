package classes;

import javax.swing.JTable;

import gui.FrontPage;
import interfaces.IGUI;

public class GUI implements IGUI{
	
	private Airline arlineSystem=new Airline();
	
	public GUI()
	{

	}
	
	// done signup button 
	public boolean signUpButton(Customer c) {
			return this.arlineSystem.signup(c);
		}
		
	// done user login button
	public boolean userLoginButton(Customer c) {
			return this.arlineSystem.Customerlogin(c);
	}
	
	// done admin login button
	public boolean adminLoginButton(Person p) {
			
		return this.arlineSystem.AdminLogin(p);
		
	}
	
	// done
	public void displayAllBookings(JTable table)
	{
		this.arlineSystem.displayAllBookigs(table);
	}
	
	
	public void displayAllCustomers(JTable table) {
		
		this.arlineSystem.displayAllCustomers(table);
		
	}
	
	
	public void fillPlaneTable(JTable table)
	{
		this.arlineSystem.fillPlaneTable(table);
	}
	
	public boolean addAirportButton(String aid, String country, String city)
	{
		return this.arlineSystem.addAirport(aid,country,city);
	}

	public boolean addGeneralPlane(String planeId,String pname,int cap,int fclassCap, int businesClassCap,int econCap)
	{
		
		System.out.println(planeId);
		
		System.out.println(cap);
		System.out.println(fclassCap);
		System.out.println(businesClassCap);
		System.out.println(econCap);
		
		return this.arlineSystem.addGeneralPlane(planeId, pname, cap, fclassCap, businesClassCap, econCap);
		
	}
	
	
	public boolean addPrivatePlane(String planeId,String pname)
	{
		return this.arlineSystem.addPrivatePlane(planeId, pname);
	}
	
	public boolean removePlane(Planes p)
	{
		return this.arlineSystem.removePlane(p);
	}
	
	
	
	public void viewAllCustomers() {
		
	}
	
	
	
	public void viewAllBookings() {
		
	}
	public void addPackage() {
		
	}
	public void addPlanes() {
		
	}
	public void selectPaymentMethod() {
		
	}
	public void confirmBookingButton() {
		
	}
	public void displayBookingButton() {
		
	}
	public void displayError() {
		
	}
	public void editUserDetailButton() {
		
	}
	public void editTripDetailButton() {
		
	}

	
	public void fillAirportTable(JTable table,String country)
	{
		this.arlineSystem.fillAirportTable(table, country);
	}


	
	public void displayTrips(JTable table) {
		try {
			Airline d=new Airline();
			d.DisplayTrips(table);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void viewHistory(String username, JTable table) {
		try {
			Airline d=new Airline();
			d.viewHistory(username, table);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void OpenFrontPage() {
		// TODO Auto-generated method stub
		FrontPage fp=new FrontPage();
		fp.setVisible(true);
	}
	
	
	public void fillPlaneTable(JTable table, String aid)
	{
		this.arlineSystem.fillPlaneTable(table, aid);
	}
	

	public boolean AddFlight(String fid, String aid1, String aid2, String da, String dest, String time)
	{
		return this.arlineSystem.AddFlight(fid, aid1, aid2, da, dest, time);
		 
	}
	
}
