/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<ArrayList<WorkRequest>> requestListCategory;
    private Map<String, ArrayList<WorkRequest>> requestMap;
    public WorkQueue() {
        workRequestList = new ArrayList();
        requestListCategory  = new ArrayList<ArrayList<WorkRequest>>();
        requestMap = new HashMap<String, ArrayList<WorkRequest>>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public Map<String, ArrayList<WorkRequest>> getRequestMap() {
        return requestMap;
    }
    
}