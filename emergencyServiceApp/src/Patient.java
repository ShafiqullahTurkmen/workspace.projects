/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shafi
 */
public class Patient implements Comparable<Patient>{
    private String name;
    private String complaint;
    private int priority;

    public Patient(String name, String complaint) {
        this.name = name;
        this.complaint = complaint;
        
        if (complaint.equals("Appendicitis")) {
            this.priority = 3;
        }
        else if (complaint.equals("Burn")) {
            this.priority = 2;
        }
        else {
            this.priority = 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    

    @Override
    public String toString() {

        String information = "Patient name : " + name
                             + "\n Complaint : " + complaint
                             + "\n Priority : " + priority;
                             
        return information;
    }

    @Override
    public int compareTo(Patient patient) {
        
        if (this.priority > patient.priority) {
            return -1;
        }
        else if (this.priority < patient.priority) {
            return 1;
        }
        else {
            return 0;
        }
        
    }
    
    
    
}
