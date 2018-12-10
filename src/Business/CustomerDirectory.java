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
public class CustomerDirectory {
    private ArrayList<Customer> customerDir;
    
    public CustomerDirectory(){
        this.customerDir = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDir() {
        return customerDir;
    }

    public Customer addCustomer(){
        Customer myCustomer = new Customer();
        customerDir.add(myCustomer);
        return myCustomer;
    }
    public void removeCustomer(Customer myCustomer){
        customerDir.remove(myCustomer);
    }
    public Customer searchCustomer(String id){
        for (Customer cus : customerDir){
            if ((cus.getId()).equals(id)){
                return cus;
            }
        }
        return null;
    }
    
}
