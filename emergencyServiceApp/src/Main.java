
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shafi
 */
public class Main {
    public static void main(String[] args) {
        Queue<Patient> emergencyService = new PriorityQueue<Patient>();
        
        emergencyService.offer(new Patient("Murat", "Burn"));
        emergencyService.offer(new Patient("Okan", "Headache"));
        emergencyService.offer(new Patient("Berk", "Appendicitis"));
        emergencyService.offer(new Patient("Selim", "Headache"));
        emergencyService.offer(new Patient("Kenan", "Stomache"));
        emergencyService.offer(new Patient("Boz", "Appendicitis"));
        emergencyService.offer(new Patient("Bedük", "Burn"));
        emergencyService.offer(new Patient("Beyaz", "Appendicitis"));
        
        
        int i = 1;
        
        while (!emergencyService.isEmpty()) {
            
            System.out.println("*************************");
            System.out.println(i + ". in the queue");
            System.out.println(emergencyService.poll());
            i++;
        }
    }
}
