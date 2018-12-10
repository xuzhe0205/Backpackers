/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
/**
 *
 * @author Oliver
 */
public class Customer {
    private String dob;
    private String firstName;
    private String lastName;
    private String gender;
    private String id;
    private long phoneNum;
    private String email;
    private ArrayList<String> seats;
    
    
    public Customer(){
        seats = new ArrayList<String>();
    }
    
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getSeat() {
        return seats;
    }

    public void setSeat(String seat) {
        (this.seats).add(seat);
    }
    
    public void delSeat(String seat){
        (this.seats).remove(seat);
    }

    
    @Override
    public String toString() {
        return id;
    }
}
