/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author chenweikai
 */
public class Hotel {
    private static int cnt = 0;
    private double roomnumbers;
    private String location;
    private double price;
    private String stars;
    private String parking;
    private String wifi;
    public int hotelid;
    private String companyName;
    private Boolean isAvailable = true;
    private String roomtype;
    private String meetingroomtype;
    private double meetingroomnumbers;
    private String name; 
    private ArrayList<String> bookedDate;
//    private UserAccount useraccount;
//
//    public UserAccount getUseraccount() {
//        return useraccount;
//    }
//
//    public void setUseraccount(UserAccount useraccount) {
//        this.useraccount = useraccount;
//    }

    public Hotel(){
        cnt++;
        hotelid = cnt;
        bookedDate = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    public double getRoomnumbers() {
        return roomnumbers;
    }

    public void setRoomnumbers(double roomnumbers) {
        this.roomnumbers = roomnumbers;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public int getHotelid() {
        return hotelid;
    }

    public void setHotelid(int hotelid) {
        this.hotelid = hotelid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getMeetingroomtype() {
        return meetingroomtype;
    }

    public void setMeetingroomtype(String meetingroomtype) {
        this.meetingroomtype = meetingroomtype;
    }

    public double getMeetingroomnumbers() {
        return meetingroomnumbers;
    }

    public void setMeetingroomnumbers(double meetingroomnumbers) {
        this.meetingroomnumbers = meetingroomnumbers;
    }

    public ArrayList<String> getBookedDate() {
        return bookedDate;
    }

    public void setBookedDate(ArrayList<String> bookedDate) {
        this.bookedDate = bookedDate;
    }

   
    
    
    
    @Override
    public String toString() {
        return Integer.toString(hotelid);
    }
}
