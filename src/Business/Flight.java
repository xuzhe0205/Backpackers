/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.UserAccount.UserAccount;
/**
 *
 * @author Oliver
 */
public class Flight {
    private static int cnt = 0;
    //private int flightID;
    private String flightNum;
    private UserAccount[][] flightSeats;
    private String date;
    private String time;
    private String arrival;
    private String departure;
    private int seatAvail;
    private String fleet;
    private double price;
    private String airlinerName;
    String[] seatArr = {"A","B","C","D","E","F"};
    public Flight(){
        //cnt++;
        //flightID = cnt;
        flightSeats= new UserAccount[25][6];
    }

    /*public int getFlightID() {
        return flightID;
    }
    */
    
    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public UserAccount[][] getFlightSeats() {
        return flightSeats;
    }

   
    public String getSeatNum(int row, int col){
        String seatStr;
        if (row+1 < 10){
            seatStr = ("0"+Integer.toString(row+1))+seatArr[col];
        }
        else{
            seatStr = (Integer.toString(row+1))+seatArr[col];
        }
        return seatStr;
    }

    public void updateSeats(UserAccount cus, String cusSeat){
        int row = Integer.parseInt(cusSeat.substring(0,2));
        int col;
        if (cusSeat.charAt(2) == 'A'){
            col = 0;
        }
        else if (cusSeat.charAt(2) == 'B'){
            col = 1;
        }
        else if (cusSeat.charAt(2) == 'C'){
            col = 2;
        }
        else if (cusSeat.charAt(2) == 'D'){
            col = 3;
        }
        else if (cusSeat.charAt(2) == 'E'){
            col = 4;
        }
        else{
            col = 5;
        }
        (this.flightSeats)[row-1][col] = cus;
    }
    
    public int[] getCurSeat(String selectedSeat){
        int row = Integer.parseInt(selectedSeat.substring(0,2));
        int col;
        
        if (selectedSeat.charAt(2) == 'A'){
            col = 0;
        }
        else if (selectedSeat.charAt(2) == 'B'){
            col = 1;
        }
        else if (selectedSeat.charAt(2) == 'C'){
            col = 2;
        }
        else if (selectedSeat.charAt(2) == 'D'){
            col = 3;
        }
        else if (selectedSeat.charAt(2) == 'E'){
            col = 4;
        }
        else{
            col = 5;
        }
        int[] seatArr = {row, col};
        return seatArr;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public int getSeatAvail() {
        return seatAvail;
    }

    public void setSeatAvail(int seatAvail) {
        this.seatAvail = seatAvail;
    }

    public String getFleet() {
        return fleet;
    }

    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }
    
    
    @Override
    public String toString() {
        return flightNum;
    }
}
