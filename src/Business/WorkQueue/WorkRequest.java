/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Flight;
import Business.Car;
import Business.Hotel;
import Business.RailWay;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Boolean isCancellation = false;
    private double price;
    private Boolean priceChange = false;
    private Boolean isCredits = false;
    //private Double cusCredits;
    private Flight orderFlight;
    private String requestType;
    private Car orderCar;
    private Hotel orderHotel;
     private RailWay orderRailWay;

    public Car getOrderCar() {
        return orderCar;
    }

    public void setOrderCar(Car orderCar) {
        this.orderCar = orderCar;
    }

    
    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    
    public Flight getOrderFlight() {
        return orderFlight;
    }

    public void setOrderFlight(Flight orderFlight) {
        this.orderFlight = orderFlight;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

//    public Double getCusCredits() {
//        return cusCredits;
//    }
//
//    public void setCusCredits(Double cusCredits) {
//        this.cusCredits = cusCredits;
//    }

    public Boolean getIsCredits() {
        return isCredits;
    }

    public void setIsCredits(Boolean isCredits) {
        this.isCredits = isCredits;
    }

    public Boolean getIsCancellation() {
        return isCancellation;
    }

    public void setIsCancellation(Boolean isCancellation) {
        this.isCancellation = isCancellation;
    }
    
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public Boolean getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(Boolean priceChange) {
        this.priceChange = priceChange;
    }

    
    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public Hotel getOrderHotel() {
        return orderHotel;
    }

    public void setOrderHotel(Hotel orderHotel) {
        this.orderHotel = orderHotel;
    }

    public RailWay getOrderRailWay() {
        return orderRailWay;
    }

    public void setOrderRailWay(RailWay orderRailWay) {
        this.orderRailWay = orderRailWay;
    }
    
    
    
    @Override
    public String toString() {
        return message;
    }
}
