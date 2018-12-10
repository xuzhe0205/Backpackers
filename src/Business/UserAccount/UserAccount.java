/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import Business.Car;
import Business.CarDirectory;
import Business.Hotel;
import Business.RailWay;
import Business.Flight;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private ArrayList<Car> carCatalog;
    private String email;
    private long phoneNum;
    private String fisrtName;
    private String lastName;
    private String id;
    private String dob;
    private String gender;
    private String driverLicense;
    private ArrayList<Car> customerOrder;
    private ArrayList<Hotel> hotelCatalog;
    private ArrayList<Flight> flightCatalog;
    private ArrayList<RailWay> railwayCatalog;
    private Double credits;
    private ArrayList<Flight> flightOrder;
    private ArrayList<Hotel> customerBooking;
    private ArrayList<RailWay> customerRailWayBooking;
    private String profilePath;

    public String getProfilePath() {
        return profilePath;
    }

    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }
    
    public ArrayList<Car> getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(ArrayList<Car> customerOrder) {
        this.customerOrder = customerOrder;
    }

    public Double getCredits() {
        return credits;
    }

    public void addCredits(Double newCredits) {
        this.credits += newCredits;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public ArrayList<Flight> getFlightOrder() {
        return flightOrder;
    }

    public void setFlightOrder(Flight flight) {
        (this.flightOrder).add(flight);
    }
    public void setSeat(String seat) {
        
    }
    
    
    public UserAccount() {
        workQueue = new WorkQueue();
        carCatalog = new ArrayList<Car>();
        customerOrder = new ArrayList<Car>();
        hotelCatalog = new ArrayList<Hotel>();
        railwayCatalog = new ArrayList<RailWay>();
        flightCatalog = new ArrayList<Flight>();
        flightOrder = new ArrayList<Flight>();
        customerBooking = new ArrayList<Hotel>();
        customerRailWayBooking = new ArrayList<RailWay>();
        credits = 0.0;
    }

    public ArrayList<Car> getCarCatalog() {
        return carCatalog;
    }
    
      public ArrayList<Hotel> getHotelCatalog() {
        return hotelCatalog;
    }

    public ArrayList<RailWay> getRailwayCatalog() {
        return railwayCatalog;
    }

    public Car addCar() {
        Car car = new Car();
        carCatalog.add(car);
        return car;
    }
    
    public Flight addFlight(){
        Flight flight = new Flight();
        flightCatalog.add(flight);
        return flight;
    }
    
    public Hotel addHotel() {
        Hotel hotel = new Hotel();
        hotelCatalog.add(hotel);
        return hotel;
    }
    
    public RailWay addRailway() {
        RailWay railway = new RailWay();
        railwayCatalog.add(railway);
        return railway;
    }
    
    public void delHotel(Hotel hotel){
     hotelCatalog.remove(hotel);
    }
    
     public void delRailway(RailWay railway){
     railwayCatalog.remove(railway);
    }

    public ArrayList<Flight> getFlightCatalog() {
        return flightCatalog;
    }
     
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public ArrayList<Hotel> getCustomerBooking() {
        return customerBooking;
    }

    public void setCustomerBooking(ArrayList<Hotel> customerBooking) {
        this.customerBooking = customerBooking;
    }

    public ArrayList<RailWay> getCustomerRailWayBooking() {
        return customerRailWayBooking;
    }

    public void setCustomerRailWayBooking(ArrayList<RailWay> customerRailWayBooking) {
        this.customerRailWayBooking = customerRailWayBooking;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}