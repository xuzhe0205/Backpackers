/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author chenweikai
 */
public class RailWay {
    private String railwayNum;
    private String date;
    private String departure;
    private String arrival;
    private double price;
    private double seatAvail;
    private String time;
    private int cnt = 0;
    public int railwayid;
    private String companyName;
    private String seatType;
    private String roomType;
    private Boolean isAvailable = true;
    private double roomAvail;
    
    public RailWay(){
        cnt++;
        railwayid = cnt;
    }
    
    public String getRailwayNum() {
        return railwayNum;
    }

    public void setRailwayNum(String railwayNum) {
        this.railwayNum = railwayNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getRailwayid() {
        return railwayid;
    }

    public void setRailwayid(int railwayid) {
        this.railwayid = railwayid;
    }

    public double getSeatAvail() {
        return seatAvail;
    }

    public void setSeatAvail(double seatAvail) {
        this.seatAvail = seatAvail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public double getRoomAvail() {
        return roomAvail;
    }

    public void setRoomAvail(double roomAvail) {
        this.roomAvail = roomAvail;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    
    
    
    @Override
    public String toString() {
        return Integer.toString(railwayid);
    }
    
}
