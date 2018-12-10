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
public class AirlinerDirectory {
    private ArrayList<Airliner> airlinerDir;
    
    public AirlinerDirectory(){
        airlinerDir = new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getAirlinerDir() {
        return airlinerDir;
    }

    public Airliner addAirliner(){
        Airliner myAirliner = new Airliner();
        airlinerDir.add(myAirliner);
        return myAirliner;
    }
    public void removeAirliner(Airliner myAirliner){
        airlinerDir.remove(myAirliner);
    }
    
    public ArrayList<Flight> searchAirliner(String flightNum, String departure, String arrival, String time, String date){
        ArrayList<Flight> searchArr = new ArrayList<Flight>();
        int cnt = 0;
        for (Airliner a : airlinerDir){
            
            for (Flight f : a.getFlightCatalog()){
                if ((!flightNum.equals("")) && (f.getFlightNum().equals(flightNum)==false)){
                    continue;
                }
                if ((!departure.equals("")) && (f.getDeparture().equals(departure)==false)){
                    continue;
                }
                if ((!arrival.equals("")) && (f.getArrival().equals(arrival)==false)){
                    continue;
                }
                if ((!time.equals("")) && (f.getTime().equals(time)==false)){
                    continue;
                }
                if ((!date.equals("")) && (f.getDate().equals(date)==false)){
                    continue;
                }
                searchArr.add(f);
                cnt++;
            }
            
        }
        if (cnt == 0){
            return null;
        }
        
        return searchArr;
    }
    
}
