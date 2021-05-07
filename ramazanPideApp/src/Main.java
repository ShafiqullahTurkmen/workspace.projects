
import java.util.LinkedList;
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
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ramazan Pidesi Uygulaması.....");
        
        Queue<String> pideKuyrugu = new LinkedList<String>();
        
        pideKuyrugu.offer("Murat");
        pideKuyrugu.offer("Hasan");
        pideKuyrugu.offer("Okan");
        pideKuyrugu.offer("Ayşe");
        pideKuyrugu.offer("Merve");
        pideKuyrugu.offer("Ezgi");
        pideKuyrugu.offer("Gizem");
        pideKuyrugu.offer("Mehmet");
        pideKuyrugu.offer("Oğuz");
        pideKuyrugu.offer("Azer");
        
        int pideSayisi = (int)(Math.random() * 10 + 1);

        System.out.println("Pideler Çıkıyor...");
        System.out.println("Çıkan Pide sayısı : " + pideSayisi);
        
        Thread.sleep(3000);
        
        while (pideSayisi != 0) {
            System.out.println(pideKuyrugu.poll() + " pideyı aldı...");
            pideSayisi--;
            Thread.sleep(1000);
        }
        
        System.out.println("Pide kalmadı...");
        
    }
}
