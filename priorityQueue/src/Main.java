
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
    public static void main(String[] args) throws Exception {

        Queue<Player> queue = new PriorityQueue<Player>(); 
        
        queue.offer(new Player("Murat", 3));
        queue.offer(new Player("Oğuz", 1));
        queue.offer(new Player("Kerim", 5));
        
       /* queue.offer(3);
        queue.offer(2);
        queue.offer(100);
        queue.offer(40);
        queue.offer(1);
        
      /*  for (Integer i : queue) {
            System.out.println(i);
        }

        */
        System.out.println(queue.peek());
      while (!queue.isEmpty()) {
          System.out.println("Eleman Çıkarılıyor : " + queue.poll());
      }
      
      
      
      
      
      
    } //end main
    
}// end Main.class


class Player implements Comparable<Player> {
    private String isim;
    private int id;

    public Player(String isim, int id) throws Exception {
        this.isim = isim;
        if (id <= 0) {
            throw new Exception("id 0 veya 0 den küçük olamaz ");
        }
        else {
            this.id = id;

        }
    }
            
            

    @Override
    public int compareTo(Player player) {

        if (this.id < player.id) {
            return -1;
        } 
        else if (this.id > player.id) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Player = {isim = " + this.isim + ", id = " + this.id + "}"; 
    }
    
    
    
    
}
