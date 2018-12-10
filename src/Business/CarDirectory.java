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
public class CarDirectory {
    private Car car;
    private  ArrayList<Car> carDir;
    public CarDirectory(){
        carDir = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarDir() {
        return carDir;
    }

    public Car addCarDir() {
        Car car = new Car();
        carDir.add(car);
        return car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
}
